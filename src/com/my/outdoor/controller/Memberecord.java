package com.my.outdoor.controller;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.my.outdoor.pojo.Memactlist;
import com.my.outdoor.service.Memberactive;

@Controller
public class Memberecord {
	@Autowired
	private Memberactive memberactive;

	private Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@RequestMapping("/memberecord/memrecordlist.action")
	@ResponseBody
	public String listmemberrecord(){
		List<Memactlist> list=memberactive.listmemactlist();
		Gson gson=new Gson();
		String liststring=gson.toJson(list);
		return liststring;
		
	}
	
	@RequestMapping("/memberecord/selectmemrecordlist.action")
	@ResponseBody
	public String selectlistmemberrecord(String zy){
		logger.info("zy值为："+zy);
		
		if(zy==null){
			return null;
		}
		List<Memactlist> list=memberactive.selectlistmemactlist(zy);
		Gson gson=new Gson();
		String liststring=gson.toJson(list);
		return liststring;
		
	}
	
	
	@RequestMapping("/memberecord/memrecordupdate.action")
	@ResponseBody
	public String updateandaddanddelete(Memactlist memactlist,String id,String oper,Integer maid){
		if(oper.equals("edit")){
			logger.info("我已经进入edit");
			memberactive.addmemactivelist(memactlist);
			List<Memactlist> list=memberactive.listmemactlist();
			Gson gson=new Gson();
			String liststring=gson.toJson(list);
			return liststring;
			
		}
		if(oper.equals("del")){
			logger.info("传进来的id是"+id);
			Memactlist memactlist2=new Memactlist();
			memactlist2.setMaid(Integer.parseInt(id));
			memberactive.delmemactivelist(memactlist2);
			List<Memactlist> list=memberactive.listmemactlist();
			Gson gson=new Gson();
			String liststring=gson.toJson(list);
			return liststring;
		}
		if(oper.equals("add")){
			logger.info("进来添加控制层");
			memberactive.addmemactivelist(memactlist);
			List<Memactlist> list=memberactive.listmemactlist();
			Gson gson=new Gson();
			String liststring=gson.toJson(list);
			return liststring;
		}
		
		return null;

	}

}
