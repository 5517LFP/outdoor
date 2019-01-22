package com.my.outdoor.utils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import com.sun.deploy.config.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class Database {

	private  Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	//数据库的备份
	   @Scheduled(cron = "0 */20 * * * ?")
		public  void backup() {
		logger.info("数据库备份开始");
		   Properties properties=new Properties();
		   try {
			   properties.load(Database.class.getResourceAsStream("/db.properties"));
			   String dbusr=(String) properties.get("jdbc.username");
			   String dbpwd=(String) properties.get("jdbc.password");
			   String dburl=(String)properties.get("jdbc.url");
			   String dbdriver=(String) properties.get("jdbc.driver");
			   String dbdatabase=(String) properties.get("jdbc.base");
			   String dbfilepath=(String) properties.get("jdbc.filepath");
			   String dbip=(String) properties.get("jdbc.ip");
			   String backupsName=getDatanumber()+"-outdoor.sql";

			   File file=new File(dbfilepath);
			   if(!file.exists()){
					file.mkdir();
			   }

			   String cmdString = "mysqldump --opt --host="+dbip+" --port=3306 --user="+dbusr+" --password="+dbpwd+" --lock-all-tables=true --result-file "+dbfilepath+backupsName+" --default-character-set=utf8 "+dbdatabase;
			   logger.info("cmd执行的命令为："+cmdString);
			   Runtime cmd=Runtime.getRuntime();
			   cmd.exec(cmdString);
			   logger.info("备份执行完成");
			   boolean deleteret=deleteBeoverdue(dbfilepath);
			   if(deleteret){
			   	logger.info("过期文件删除失败");
			   }else{
			   	logger.info("过期文件删除成功");
			   }

		   } catch (IOException e) {
			   e.printStackTrace();
			   logger.info("数据库备份失败，备份时间为:"+new Date());
		   }

	    }
		//数据库的还原
	@Scheduled(cron = "0 0/15 * * * ?")
		public static void restore() {
		System.out.println("数据库还原");
	    }


	public String  getDatanumber(){
	   	String ret=null;
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd-HH-mm-ss");
			ret=sdf.format(new Date());

	   	return ret;
		}



	public boolean deleteBeoverdue(String savePath){
	   	boolean ret=false;

	   	File file=new File(savePath);
	   	File[] filelist=file.listFiles();
	   	if(filelist.length<=0){
	   		logger.info("无日志文件生成，请确认日志生成是否正常");
		}else{
			for (int i = 0; i <filelist.length ; i++) {
				String filedate=filelist[i].getName().substring(0,8);
				logger.info("存在日志文件件时间为"+filedate);
				if(Integer.parseInt(filedate)>Integer.parseInt(getDatebyN(-2))){
					logger.info("开始删除过期日志");
					 ret=filelist[i].delete();
				}
			}
		}

	   	return  ret;
	}

	public String getDatebyN(int n){
	   	String ret=null;

		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		calendar.add(Calendar.DATE,n);
		logger.info(new Date()+"===========日期转换============"+sdf.format(calendar.getTime()));
	   	return  sdf.format(calendar.getTime());


	}

}





