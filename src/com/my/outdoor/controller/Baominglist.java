package com.my.outdoor.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.my.outdoor.pojo.Benlist;
import com.my.outdoor.pojo.Secure;
import com.my.outdoor.service.Baomingservice;
@Controller
public class Baominglist {
	@Autowired
	private Baomingservice baomingservice;

	private Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	@RequestMapping("/baoming/baominglist.action")
	@ResponseBody
	public String benlistString(){
		List<Benlist> list=baomingservice.listbenlist();
		Gson gson=new Gson();
		String string=gson.toJson(list);
		logger.info(string);
		return string;


		
	}
	
	@RequestMapping("/baoming/baomingupdate.action")
	@ResponseBody
	public String udateandaddanddel(Benlist benlist,String id,String oper){
		if(oper.equals("edit")){
			logger.info("我已经进入edit");
			baomingservice.updateenlist(benlist);
			List<Benlist> list=baomingservice.listbenlist();
			Gson gson=new Gson();
			String string=gson.toJson(list);
			return string;
			
		}
		if(oper.equals("del")){
			Benlist benlist2=new Benlist();
			benlist2.setBid(Integer.parseInt(id));
			baomingservice.delenlist(benlist2);
			List<Benlist> list=baomingservice.listbenlist();
			Gson gson=new Gson();
			String string=gson.toJson(list);
			return string;
		}
		if(oper.equals("add")){
		logger.info("进来添加控制层");
		baomingservice.addenlist(benlist);
		List<Benlist> list=baomingservice.listbenlist();
		Gson gson=new Gson();
		String string=gson.toJson(list);
		return string;
		}
		
		return null;
	}
	

}
