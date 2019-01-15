package com.my.outdoor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.my.outdoor.pojo.Project;
import com.my.outdoor.pojo.Secure;
import com.my.outdoor.service.Secureservice;

@Controller
public class Securelist {
	@Autowired
	private Secureservice secureservice;
	@RequestMapping("/secure/securelist.action")
	@ResponseBody
	public String listsecure(){
		List<Secure> list=secureservice.securlist();
		Gson gson=new Gson();
		String string=gson.toJson(list);
		return string;
		
	}
	
	@RequestMapping("/secure/serureupdateanddelandadd.action")
	@ResponseBody
	public String udateandaddanddel(Secure secure,String id,String oper){
		if(oper.equals("edit")){
			System.out.println("我已经进入edit");
			
			List<Secure> list=secureservice.securUpdate(secure);
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			System.out.println(lString);
			return lString;
			
		}
		if(oper.equals("del")){
			
			Secure secure2=new Secure();
			secure2.setSeid(Integer.parseInt(id));
			secureservice.securdelete(secure2);
			List<Secure> list=secureservice.securlist();
			Gson gson=new Gson();
			String string=gson.toJson(list);
			return string;
		}
		if(oper.equals("add")){
		System.out.println("进来添加控制层");
			secureservice.securAdd(secure);
			List<Secure> list=secureservice.securlist();
			Gson gson=new Gson();
			String string=gson.toJson(list);
			return string;
		}
		
		return null;
	}
	

}
