package com.my.outdoor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import com.my.outdoor.pojo.Benlist;

import com.my.outdoor.service.Font_baomingservice;

@Controller
public class font_baominglist {
	@Autowired
	private Font_baomingservice font_baomingservice;
	
	@RequestMapping("/fontbaoming/list.action")
	@ResponseBody
	public String listbaoming(String bbname){
		Benlist benlist=new Benlist();
		benlist.setBname(bbname);
		List<Benlist> list=font_baomingservice.listbenlist(benlist);
		Gson gson=new Gson();
		String liststringString=gson.toJson(list);
		return liststringString;
		
	}
	@RequestMapping("/fontbaoming/add.action")
	@ResponseBody
	public String addbaoming(Benlist benlist,String id,String oper,Integer bid,String bbname){
		if(oper.equals("add")){
			benlist.setBname(bbname);
			benlist.setBjust("…Û∫À÷–");
			font_baomingservice.addenlist(benlist);
			List<Benlist> list=font_baomingservice.listbenlist(benlist);
			Gson gson=new Gson();
			String liststringString=gson.toJson(list);
			return liststringString;
		}
		
		List<Benlist> list=font_baomingservice.listbenlist(benlist);
		Gson gson=new Gson();
		String liststringString=gson.toJson(list);
		return liststringString;
		
	}
	

}
