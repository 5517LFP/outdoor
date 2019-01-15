package com.my.outdoor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.ActivemanagerMapper;
import com.my.outdoor.pojo.Activemanager;
import com.my.outdoor.pojo.ActivemanagerExample;
import com.my.outdoor.pojo.ActivemanagerExample.Criteria;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.service.Activeservice;
import com.my.outdoor.service.Memberservice;
@Service
public class Activeserviceimpl implements Activeservice {
	@Autowired
	private ActivemanagerMapper activemapper;

	@Override
	public List<Activemanager> activelist() {
		ActivemanagerExample example=new ActivemanagerExample();
		List<Activemanager> list=activemapper.selectByExample(example);
		return list;
	}

	@Override
	public void activeupdate(Activemanager activemanager) {
		ActivemanagerExample example=new ActivemanagerExample();
		Criteria criteria=example.createCriteria();
		System.out.println("要修改的id为："+activemanager.getAid());
		criteria.andAidEqualTo(activemanager.getAid());
		int i=activemapper.updateByExampleSelective(activemanager, example);
		if(i==1){
			System.out.println("更新成功");
			
		}
		
	}

	@Override
	public void activedelete(Activemanager activemanager) {
		
		ActivemanagerExample example=new ActivemanagerExample();
		Criteria criteria=example.createCriteria();
		System.out.println("要删除的id是："+activemanager.getAid());
		criteria.andAidEqualTo(activemanager.getAid());
		activemapper.deleteByExample(example);
		
	}

	@Override
	public void activeadd(Activemanager activemanager) {
		activemapper.insert(activemanager);
		
	}

	@Override
	public List<Activemanager> superserch(String serchtext) {
		ActivemanagerExample example=new ActivemanagerExample();
		Criteria criteria=example.createCriteria();
		criteria.andAnameLike("%"+serchtext+"%");
		List<Activemanager> list=activemapper.selectByExample(example);
		return list;
	}

	
}
