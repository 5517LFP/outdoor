package com.my.outdoor.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.my.outdoor.pojo.Activemanager;
import com.my.outdoor.pojo.Admin;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.pojo.Staff;
import com.my.outdoor.service.Activeservice;
import com.my.outdoor.service.Loginservice;
import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class Login {
	@Autowired
	private Loginservice loginservice;
	
	@Autowired
	private Activeservice activeservice;

	private Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@RequestMapping("/login/login.action")
	@ResponseBody
	public ModelAndView denglu(String username,String pwd,String status,HttpSession session){
		ModelAndView mav=new ModelAndView();
		logger.info("我已经进入logincontroller"+username+pwd+status);
		if(status.equals("adminstatus")){
			Admin i=loginservice.denglu(username, pwd);
			if(i!=null){
				session.setAttribute("adminu", i);
				mav.setViewName("/index.jsp");
				return mav;
			}
			mav.addObject("error","密码有误");
			mav.setViewName("/login.jsp");
			return mav;
		}
		if(status.equals("staffstatus")){
			System.out.println("员工登陆控制");
			Staff i=loginservice.staffdenglu(username, pwd);
			if(i!=null){
				session.setAttribute("staff", i);
				mav.setViewName("/index.jsp");
				return mav;
			}
			mav.addObject("error","密码有误");
			mav.setViewName("/login.jsp");
			return mav;
		}
		
		if(status.equals("memberstatus")){
			Member i=loginservice.memberdenglu(username, pwd);
			if(i!=null){
				
				 session.setAttribute("user", i);
				 List<Activemanager> list=activeservice.activelist();
					mav.addObject("lista", list);
				mav.setViewName("/font_index.jsp");
				return mav;
				
			}
			
			mav.addObject("error","密码有误");
			mav.setViewName("/login.jsp");
			return mav;
		}
		return mav;
		
		
	}
	
	/*@RequestMapping("/login/login1.action")
	@ResponseBody
	public String deng(String username,String pwd){
		int i=loginservice.denglu(username, pwd);
		if(i==1){	
			return "/index.jsp";
		}
		return "/login.jsp";
	}*/
	
	@RequestMapping("/login/zhuce.action")
	@ResponseBody
	public ModelAndView zhece(String email,String username,String pwd ){
		ModelAndView mav=new ModelAndView();
		Member member=new Member();
		member.setHemail(email);
		member.setHname(username);
		member.setHpwd(pwd);
		int i=loginservice.zhece(member);
		mav.setViewName("/login.jsp");
		return mav;
		
	}

	
	@RequestMapping("/login/loginout.action")
	@ResponseBody
	public ModelAndView logout(HttpSession session){
		ModelAndView mav=new ModelAndView();
		 session.removeAttribute("user");
	       session.invalidate();
	       List<Activemanager> list=activeservice.activelist();
			mav.addObject("lista", list);
	       mav.setViewName("/font_index.jsp");
	       return mav;
		
	}
	//管理员注销
	@RequestMapping("/login/adminloginout.action")
	@ResponseBody
	public ModelAndView adminlogout(HttpSession session){
		ModelAndView mav=new ModelAndView();
		 session.removeAttribute("adminu");
	       session.invalidate();
	       mav.setViewName("/login.jsp");
	       return mav;
		
	}
	
	//staff注销
		@RequestMapping("/login/staffloginout.action")
		@ResponseBody
		public ModelAndView stafflogout(HttpSession session){
			ModelAndView mav=new ModelAndView();
			 session.removeAttribute("staff");
			 session.removeAttribute("adminu");
		       session.invalidate();
		       
		       mav.setViewName("/login.jsp");
		       return mav;
			
		}
	
	//跟人信息修改
	@RequestMapping("/login/membermessage.action")
	@ResponseBody
	public ModelAndView membermessageupdate(HttpSession session,Member m,String hid){
		ModelAndView mav=new ModelAndView();
		m.setHid(Integer.parseInt(hid));
		loginservice.membermessage(m);
		 session.setAttribute("user", m);
			List<Activemanager> list=activeservice.activelist();
			mav.addObject("lista", list);
	       mav.setViewName("/font_index.jsp");
	       return mav;
		
	}
	
	@RequestMapping("/login/jumpfont_index.action")
	@ResponseBody
	public ModelAndView jumpfont_index(){
		ModelAndView mav=new ModelAndView();
		
			List<Activemanager> list=activeservice.activelist();
			mav.addObject("lista", list);
	       mav.setViewName("/font_index.jsp");
	       return mav;
		
	}
	
	@RequestMapping("/login/serch.action")
	@ResponseBody
	public ModelAndView activeserch(String serchtext){
		ModelAndView mav=new ModelAndView();
			System.out.println(serchtext);
			List<Activemanager> list=activeservice.superserch(serchtext);
			mav.addObject("lista", list);
	       mav.setViewName("/font_index.jsp");
	       return mav;
		
	}
	
	
}
