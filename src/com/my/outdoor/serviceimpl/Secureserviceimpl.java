package com.my.outdoor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.SecureMapper;
import com.my.outdoor.pojo.Secure;
import com.my.outdoor.pojo.SecureExample;
import com.my.outdoor.pojo.SecureExample.Criteria;
import com.my.outdoor.service.Secureservice;
@Service
public class Secureserviceimpl implements Secureservice {
	@Autowired
	private SecureMapper secureMapper;

	@Override
	public List<Secure> securlist() {
		SecureExample example=new SecureExample();
		Criteria criteria=example.createCriteria();
		List<Secure> list=secureMapper.selectByExample(example);
		return list;
	}

	@Override
	public void securAdd(Secure secure) {
		SecureExample example=new SecureExample();
		Criteria criteria=example.createCriteria();
		int i=secureMapper.insert(secure);
		if(i==1){
			System.out.println("添加成功");
		}
		
	}

	@Override
	public void securdelete(Secure secure) {
		SecureExample example=new SecureExample();
		Criteria criteria=example.createCriteria();
		criteria.andSeidEqualTo(secure.getSeid());
		int i=secureMapper.deleteByExample(example);
		if(i==1){
			System.out.println("添加成功");
		}
		
	}

	@Override
	public List<Secure> securUpdate(Secure secure) {
		SecureExample example=new SecureExample();
		Criteria criteria=example.createCriteria();
		criteria.andSeidEqualTo(secure.getSeid());
		int i=secureMapper.updateByExample(secure, example);
		if(i==1){
			System.out.println("添加成功");
		}
		return null;
		
	}

	

}
