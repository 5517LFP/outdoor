package com.my.outdoor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;






import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.pojo.Staff;
import com.my.outdoor.service.Systemservice;
import com.my.outdoor.utils.Database;

@Controller
public class Systemlist {
	@Autowired
	private Systemservice systemservice;
	@RequestMapping("/System/sysstaff.action")
	@ResponseBody
	public String staffList(){
		List<Staff> list=systemservice.liststaff();
		Gson gson=new Gson();
		String listsString=gson.toJson(list);
		return listsString;
		
	}
	
	@RequestMapping("/System/sysupdata.action")
	@ResponseBody
	public String updatestaff(Staff staff,String id,String oper,Integer staid){
		
		if(oper.equals("edit")){
			System.out.println("我已经进入edit");
			systemservice.update(staff);;
			List<Staff> list=systemservice.liststaff();
			Gson gson=new Gson();
			String listsString=gson.toJson(list);
			return listsString;
			
		}
		if(oper.equals("del")){
			Staff staff2=new Staff();
			System.out.println("删除id是"+id);
			staff2.setStaid(Integer.parseInt(id));
			
			
			systemservice.deletestaff(staff2);
			List<Staff> list=systemservice.liststaff();
			Gson gson=new Gson();
			String listsString=gson.toJson(list);
			return listsString;
		}
		if(oper.equals("add")){
			System.out.println("进来添加控制层");
			systemservice.addstaff(staff);
			List<Staff> list=systemservice.liststaff();
			Gson gson=new Gson();
			String listsString=gson.toJson(list);
			return listsString;
		}
		return null;
		
	}
	
	
	@RequestMapping("/System/databasecopy.action")
	@ResponseBody
	public String  databasecopy(){
		System.out.println("i have success come in");
		Database database=new Database();
		database.backup();
		String string="{suc:success}";
		System.out.println(string);
		return string;
		
		
	}
	
	
	@RequestMapping("/system/systeminit.action")
	@ResponseBody
	public  String systeminit(){
		int i=systemservice.systeminit();
		String string="";
		if(i==0){
			 string="{suc:success}";
		}else {
			 string="{suc:false}";
		}
		
		System.out.println(string);
		return string;
		
	}

}
