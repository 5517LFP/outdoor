package com.my.outdoor.controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.service.Memberservice;
import com.my.outdoor.utils.Pagebean;

@Controller
public class Memberlist {

	@Autowired
	private Memberservice memberservice;
	
	@RequestMapping("/member/memberlist.action")
	@ResponseBody
	public String  testaction(Pagebean<Member> page){
		/*System.out.println("�ҽ������������");
		List<Member> list=memberservice.showMembers();
		for(Member m:list){
			System.out.println(m.getHname());			
		}
		Gson gson=new Gson();
		String dataString=gson.toJson(list);
		System.out.println(dataString);
		return dataString;*/
		int i=memberservice.countmemeber();
		page.setRecords(i);
		List<Member> list=memberservice.selshowMembers(page);
		for(Member m:list){
			System.out.println(m.getHname());
		}
		page.setFormList(list);
		Gson gson=new Gson();
		String dataString=gson.toJson(page);
		return dataString;
		
	}
	
	@RequestMapping("/member/memberlistsel.action")
	@ResponseBody
	public String  testactionm(){
		System.out.println("�ҽ������������");
		List<Member> list=memberservice.showMembers();
		for(Member m:list){
			System.out.println(m.getHname());			
		}
		Gson gson=new Gson();
		String dataString=gson.toJson(list);
		System.out.println(dataString);
		return dataString;
		
		
	}
	
	
    @RequestMapping("/member/memberadd.action")
	public ModelAndView memberAddc(Member m){
    	ModelAndView mav=new ModelAndView();
    			
    	System.out.println("�ҽ���̫��ӽ�����");
		System.out.println("�ҽ����˰�"+m.toString()+":::::"+m.getHemail());
		memberservice.insertMembers(m);
		mav.setViewName("/memberadd.jsp");
		return mav;
		
	}
    
    @RequestMapping("/member/memberserch.action")
    @ResponseBody
   	public String memberSerch(Member m){
       	System.out.println("�ҽ�dao��ѯ�ӽ�����");
       	System.out.println("�������ȼ�Ϊ"+m.getHlv()+m.getHidcard()+m.getHname()+m.getHphonenumber());
   		System.out.println("�ҽ����˰�"+m.toString()+":::::"+m.getHemail());
   		List<Member> list=memberservice.serchMembers(m);
   		Gson gson=new Gson();
   		String dString=gson.toJson(list);
   		System.out.println("��Ӧ��Ϣwei"+dString);
   		return dString;
   		
   	}
    
    @RequestMapping("/member/memberupdate.action")
    @ResponseBody
   	public String memberUpdate(Member m,String oper,Integer hid,String id){
    	System.out.println(oper);
    	if(oper.equals("edit")){
    		 	
   		System.out.println("�ҽ����˰�"+m.getHid()+"::"+m.toString()+"::"+m.getHname()+"::"+m.getHname()+"::"+m.getHidcard()+"::"+m.getHpwd()+"::"+m.getHphonenumber()+"::"+m.getHlv());
   		
   		List<Member> list=memberservice.updateMembers(m);
   		Gson gson=new Gson();
   		String lString=gson.toJson(list);
   		return lString;
    	}
    	
    	if(oper.equals("add")){
		 	
       		System.out.println("�ҽ�����Ӳ���add");
       		memberservice.insertMembers(m);
       		List<Member> list=memberservice.showMembers();
       		Gson gson=new Gson();
       		String lString=gson.toJson(list);
       		System.out.println(lString);
       		return lString;
        	}
    	
    	if(oper.equals("del")){
		 	System.out.println("�ҽ�control����ɾ��������"+"hid"+hid+"id��"+id);
		 	m.setHid(Integer.parseInt(id));
		 	memberservice.deleteMembers(m);
		 	List<Member> list=memberservice.showMembers();

			Gson gson=new Gson();
			String dataString=gson.toJson(list);
			System.out.println(dataString);
			return dataString;
		
	}
    	
		return null;
    	
      
   		
   	}
   //��ҳ���� 
    @RequestMapping("/member/selectmemberlist.action")
	@ResponseBody
	public String  testa(Pagebean<Member> page){
    	
    	
		int i=memberservice.countmemeber();
		page.setRecords(i);
		List<Member> list=memberservice.selshowMembers(page);
		for(Member m:list){
			System.out.println(m.getHname());
		}
		page.setFormList(list);
		Gson gson=new Gson();
		String dataString=gson.toJson(page);
		return dataString;
		
	}
	
}
