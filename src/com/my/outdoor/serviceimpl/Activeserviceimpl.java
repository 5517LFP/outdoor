package com.my.outdoor.serviceimpl;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

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
		logger.info("Ҫ�޸ĵ�idΪ��"+activemanager.getAid());
		criteria.andAidEqualTo(activemanager.getAid());
		int i=activemapper.updateByExampleSelective(activemanager, example);
		if(i==1){
			logger.info("���³ɹ�");
			
		}
		
	}

	@Override
	public void activedelete(Activemanager activemanager) {
		
		ActivemanagerExample example=new ActivemanagerExample();
		Criteria criteria=example.createCriteria();
		logger.info("Ҫɾ����id�ǣ�"+activemanager.getAid());
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
