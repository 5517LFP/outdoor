package com.my.outdoor.serviceimpl;

import java.util.List;















import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.ActivemanagerMapper;
import com.my.outdoor.mapper.AdminMapper;
import com.my.outdoor.mapper.LinemanageMapper;
import com.my.outdoor.mapper.StaffMapper;
import com.my.outdoor.pojo.Activemanager;
import com.my.outdoor.pojo.ActivemanagerExample;
import com.my.outdoor.pojo.Admin;
import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.pojo.Staff;
import com.my.outdoor.pojo.StaffExample;
import com.my.outdoor.pojo.StaffExample.Criteria;
import com.my.outdoor.service.Systemservice;
import com.sun.accessibility.internal.resources.accessibility;
@Service
public class Systemserviceimpl implements Systemservice {
	@Autowired
	private StaffMapper staffMapper;
	@Autowired
	private ActivemanagerMapper activemanagerMapper;
	@Autowired
	private AdminMapper adminMapper;
	@Autowired
	private LinemanageMapper linemanageMapper;

	@Override
	public List<Staff> liststaff() {
		StaffExample example=new StaffExample();
		List<Staff> list=staffMapper.selectByExample(example);
		return list;
	}

	@Override
	public void update(Staff staff) {
		StaffExample example=new StaffExample();
		Criteria criteria=example.createCriteria();
		criteria.andStaidEqualTo(staff.getStaid());
		int i=staffMapper.updateByExample(staff, example);
		if(i==1){
			System.out.println("更新成功");
		}
		

	}

	@Override
	public void deletestaff(Staff staff) {
		StaffExample example=new StaffExample();
		Criteria criteria=example.createCriteria();
		criteria.andStaidEqualTo(staff.getStaid());
		int i=staffMapper.deleteByExample(example);
		if(i==1){
			System.out.println("delete成功");
		}
		
	}

	@Override
	public void addstaff(Staff staff) {
		int i=staffMapper.insert(staff);
		if(i==1){
			System.out.println("add success");
		}
		
	}

	@Override
	public int systeminit() {
		int j=0;
		if(j==1){
		StaffExample example=new StaffExample();
		List<Staff> list=staffMapper.selectByExample(example);
		Criteria criteria=example.createCriteria();
		for(int i=0;i<list.size();i++){
			criteria.andStaidEqualTo(list.get(i).getStaid());
		staffMapper.deleteByExample(example);
		}
		}
		
		
		return 0;
	}
	
	
	

}
