package com.my.outdoor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.ActivemanagerMapper;
import com.my.outdoor.mapper.BenlistMapper;
import com.my.outdoor.pojo.Activemanager;
import com.my.outdoor.pojo.ActivemanagerExample;
import com.my.outdoor.pojo.Benlist;
import com.my.outdoor.pojo.BenlistExample;
import com.my.outdoor.pojo.BenlistExample.Criteria;
import com.my.outdoor.service.Font_baomingservice;

@Service
public class Font_baomingserviceimpl implements Font_baomingservice {
	@Autowired
	private BenlistMapper benlistMapper;
	@Autowired
	private ActivemanagerMapper activemanagerMapper;
	@Override
	public List<Benlist> listbenlist(Benlist benlist) {

		BenlistExample example=new BenlistExample();
		Criteria criteria=example.createCriteria();
		criteria.andBnameLike("%"+benlist.getBname()+"%");
		List<Benlist> list=benlistMapper.selectByExample(example);
		return list;
	}

	@Override
	public void addenlist(Benlist benlist) {
		ActivemanagerExample example=new ActivemanagerExample();
		com.my.outdoor.pojo.ActivemanagerExample.Criteria criteria=example.createCriteria();
		criteria.andAnameLike("%"+benlist.getBactivename()+"%");
		
		List<Activemanager> list=activemanagerMapper.selectByExample(example);
		for(Activemanager a:list){
			benlist.setBactivetime(a.getAproject());
		}
		benlistMapper.insert(benlist);
		
		
	}

}
