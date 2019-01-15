package com.my.outdoor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.my.outdoor.pojo.Activemanager;
import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.pojo.Project;
import com.my.outdoor.service.Activeservice;
import com.my.outdoor.service.Lineservice;
import com.my.outdoor.service.projectservice;



@Controller
public class Activelist {
	@Autowired
	private Activeservice activeservice;
	@Autowired
	private Lineservice Lineservice;
	@Autowired
	private projectservice projectservice;
	@RequestMapping("/active/activelist.action")
	@ResponseBody
	public String activelist(){
		List<Activemanager> list=activeservice.activelist();
		Gson gson=new Gson();
		String listsString=gson.toJson(list);
		System.out.println(listsString);
		return listsString;
		
	}
	
	@RequestMapping("/active/activeupdata.action")
	@ResponseBody
	public String lineUpdateandaddanddelete(Activemanager activemanager,String id,String oper,Integer aid){
		if(oper.equals("edit")){
			System.out.println("我已经进入edit");
			activeservice.activeupdate(activemanager);
			List<Activemanager> list=activeservice.activelist();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			return lString;
			
		}
		if(oper.equals("del")){
			System.out.println("传进来的id是"+id);
			Activemanager activemanager2=new Activemanager();
			activemanager2.setAid(Integer.parseInt(id));
			activeservice.activedelete(activemanager2);
			List<Activemanager> list=activeservice.activelist();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			return lString;
		}
		if(oper.equals("add")){
			System.out.println("进来添加控制层");
			activeservice.activeadd(activemanager);
			List<Activemanager> list=activeservice.activelist();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			return lString;
		}
		
		return null;
		
		
	}
	@RequestMapping("/active/selectline.action")
	@ResponseBody
	public String selectline(){
		List<Linemanage> list=Lineservice.lineshow();
		Gson gson=new Gson();
		String listsString=gson.toJson(list);
		return listsString;
		
	}
	
	@RequestMapping("/active/selectproject.action")
	@ResponseBody
	public String selectproject(){
		List<Project> list=projectservice.listProject();
		Gson gson=new Gson();
		String listsString=gson.toJson(list);
		return listsString;
		
	}
	
	
	
	@RequestMapping("/active/dongtaiactivelist.action")
	@ResponseBody
	public ModelAndView dongtaiactivelist(){
		ModelAndView mav=new ModelAndView();
		List<Activemanager> list=activeservice.activelist();
		mav.addObject("lista", list);
		mav.setViewName("/font_indextest.jsp");
		return mav;
		
	}

}
