package com.my.outdoor.controller;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.google.gson.Gson;
import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.service.Lineservice;

@Controller
public class Linelist {
	@Autowired
	private Lineservice lineservice;

	private Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	@RequestMapping("/line/linelist.action")
	@ResponseBody
	public String linelist(){
		
		List<Linemanage> list=lineservice.lineshow();
		Gson gson=new Gson();
		String lString=gson.toJson(list);
		return lString;
		
	}
	
	@RequestMapping("/line/lineupdate.action")
	@ResponseBody
	public String lineUpdateandaddanddelete(Linemanage line,String id,String oper,Integer lid){
		if(oper.equals("edit")){
			logger.info("我已经进入edit");
			lineservice.lineUpdate(line);
			List<Linemanage> list=lineservice.lineshow();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			return lString;
			
		}
		if(oper.equals("del")){
			Linemanage linemanage=new Linemanage();
			linemanage.setLid(Integer.parseInt(id));
			logger.info("传进来的lid值为"+linemanage.getLid());
			lineservice.lineDelete(linemanage);
			List<Linemanage> list=lineservice.lineshow();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			return lString;
		}
		if(oper.equals("add")){
			logger.info("进来添加控制层");
			lineservice.lineAdd(line);
			List<Linemanage> list=lineservice.lineshow();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			return lString;
		}
		
		return null;
		
		
	}
	@RequestMapping("/list/listsearch.action")
	@ResponseBody
	public String lineSearch(Linemanage line){
		logger.info(line.getLinetype()+line.getLinecontent()+line.getLinename());
		List<Linemanage> list=lineservice.lineSerch(line);
		Gson gson=new Gson();
		String listString=gson.toJson(list);
		logger.info(listString);
		return listString;
		
	}

}
