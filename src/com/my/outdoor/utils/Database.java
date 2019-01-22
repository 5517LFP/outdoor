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
	
	//���ݿ�ı���
	   @Scheduled(cron = "0 */20 * * * ?")
		public  void backup() {
		logger.info("���ݿⱸ�ݿ�ʼ");
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
			   logger.info("cmdִ�е�����Ϊ��"+cmdString);
			   Runtime cmd=Runtime.getRuntime();
			   cmd.exec(cmdString);
			   logger.info("����ִ�����");
			   boolean deleteret=deleteBeoverdue(dbfilepath);
			   if(deleteret){
			   	logger.info("�����ļ�ɾ��ʧ��");
			   }else{
			   	logger.info("�����ļ�ɾ���ɹ�");
			   }

		   } catch (IOException e) {
			   e.printStackTrace();
			   logger.info("���ݿⱸ��ʧ�ܣ�����ʱ��Ϊ:"+new Date());
		   }

	    }
		//���ݿ�Ļ�ԭ
	@Scheduled(cron = "0 0/15 * * * ?")
		public static void restore() {
		System.out.println("���ݿ⻹ԭ");
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
	   		logger.info("����־�ļ����ɣ���ȷ����־�����Ƿ�����");
		}else{
			for (int i = 0; i <filelist.length ; i++) {
				String filedate=filelist[i].getName().substring(0,8);
				logger.info("������־�ļ���ʱ��Ϊ"+filedate);
				if(Integer.parseInt(filedate)>Integer.parseInt(getDatebyN(-2))){
					logger.info("��ʼɾ��������־");
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
		logger.info(new Date()+"===========����ת��============"+sdf.format(calendar.getTime()));
	   	return  sdf.format(calendar.getTime());


	}

}





