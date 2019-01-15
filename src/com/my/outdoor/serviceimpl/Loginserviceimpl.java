package com.my.outdoor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.AdminMapper;
import com.my.outdoor.mapper.MemberMapper;
import com.my.outdoor.mapper.StaffMapper;
import com.my.outdoor.pojo.Admin;
import com.my.outdoor.pojo.AdminExample;
import com.my.outdoor.pojo.MemberExample;
import com.my.outdoor.pojo.MemberExample.Criterion;
import com.my.outdoor.pojo.Staff;
import com.my.outdoor.pojo.StaffExample;
import com.my.outdoor.pojo.AdminExample.Criteria;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.service.Loginservice;
import com.sun.accessibility.internal.resources.accessibility;
@Service
public class Loginserviceimpl implements Loginservice {
	@Autowired
	private AdminMapper adminMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private StaffMapper staffMapper;

	@Override
	public Admin denglu(String usernameString, String pwd) {
		AdminExample example=new AdminExample();
		Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(usernameString);
		List<Admin> list=adminMapper.selectByExample(example);
		for(Admin a:list){
			if(a.getPwd().equals(pwd)){
				return a;
			}	
		}
		return null;

	}

	@Override
	public int zhece(Member member) {
		int i=memberMapper.insert(member);
		return i;
	}

	@Override
	public Staff staffdenglu(String usernameString, String pwd) {
		StaffExample example=new StaffExample();
		com.my.outdoor.pojo.StaffExample.Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(usernameString);
		List<Staff> list=staffMapper.selectByExample(example);
		for(Staff s:list){
			if(s.getPwd().equals(pwd)){
				return s;
				
			}
			
		}
		return null;
	}

	@Override
	public Member memberdenglu(String usernameString, String pwd) {
		MemberExample example=new MemberExample();
		com.my.outdoor.pojo.MemberExample.Criteria criteria=example.createCriteria();
		criteria.andHnameEqualTo(usernameString);
		List<Member> list=memberMapper.selectByExample(example);
		for(Member m:list){
			if(m.getHpwd().equals(pwd)){
				return m;
			}
			
		}
		return null;
	}
	
	@Override
	public int membermessage(Member m) {
		System.out.println("´«ÖµidÎª£º"+m.getHid());
		MemberExample example=new MemberExample();
		com.my.outdoor.pojo.MemberExample.Criteria criteria=example.createCriteria();
		criteria.andHidEqualTo(m.getHid());
		int i=memberMapper.updateByExample(m, example);
		return i;
	}

}
