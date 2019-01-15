package com.my.outdoor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.pojo.Project;
import com.my.outdoor.service.projectservice;

@Controller
public class projectlist {
	@Autowired
	private projectservice projectservice;
	@RequestMapping("/project/projectlist.action")
	@ResponseBody
	public String projectlist(){
		System.out.println("controller");
		List<Project> list=projectservice.listProject();
		Gson gson=new Gson();
		String listdata=gson.toJson(list);
		System.out.println(listdata);
		return listdata;

	}
	
	@RequestMapping("/project/projectupdateandaddanddelete.action")
	@ResponseBody
	public String projectUpdate(Project project,String id,String oper ){
		
		if(oper.equals("edit")){
			System.out.println("我已经进入edit");
			projectservice.projectUpadate(project);
			List<Project> list=projectservice.listProject();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			System.out.println(lString);
			return lString;
			
		}
		if(oper.equals("del")){
			
			Project p=new Project();
			p.setPid(Integer.parseInt(id));
			
			projectservice.projectDelete(p);
			List<Project> list=projectservice.listProject();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			
			return lString;
		}
		if(oper.equals("add")){
		System.out.println("进来添加控制层");
			projectservice.projectAdd(project);
			List<Project> list=projectservice.listProject();
			Gson gson=new Gson();
			String lString=gson.toJson(list);
			
			return lString;
		}
		
		return null;
		
		
		
	
		
		
		
	}
	@RequestMapping("/project/projectserch.action")
	@ResponseBody
	public String projectSerch(Project project){
		System.out.println("我已经进入到"+project.getType()+project.getContent()+project.getLvs()+project.getLvd()+project.getName()+project.getPid());
		List<Project> list=projectservice.projectList(project);
		Gson gson=new Gson();
		System.out.println(gson.toJson(list));
		
		return gson.toJson(list);
		
	}
	

}
