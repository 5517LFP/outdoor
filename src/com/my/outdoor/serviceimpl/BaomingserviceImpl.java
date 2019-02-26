package com.my.outdoor.serviceimpl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.BenlistMapper;
import com.my.outdoor.pojo.Benlist;
import com.my.outdoor.pojo.BenlistExample;
import com.my.outdoor.pojo.BenlistExample.Criteria;
import com.my.outdoor.pojo.BenlistExample.Criterion;
import com.my.outdoor.service.Baomingservice;
@Service
public class BaomingserviceImpl implements Baomingservice {

	@Autowired
	private BenlistMapper benlistMapper;

	private Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	@Override
	public List<Benlist> listbenlist() {
		BenlistExample example=new BenlistExample();
		List<Benlist> list=benlistMapper.selectByExample(example);
		return list;
	}

	@Override
	public void addenlist(Benlist benlist) {
		System.out.println(benlist.getBname());
		int i=benlistMapper.insert(benlist);
		if(i==1){
			logger.info("更新成功");
		}
		
	}

	@Override
	public void updateenlist(Benlist benlist) {
		BenlistExample example=new BenlistExample();
		Criteria criteria=example.createCriteria();
		criteria.andBidEqualTo(benlist.getBid());
		int i=benlistMapper.updateByExample(benlist, example);
		if(i==1){
			logger.info("更新成功");
		}
		
	}

	@Override
	public void delenlist(Benlist benlist) {
		BenlistExample example=new BenlistExample();
		Criteria criteria=example.createCriteria();
		criteria.andBidEqualTo(benlist.getBid());
		int i=benlistMapper.deleteByExample(example);
		if(i==1){
			logger.info("删除成功");
		}
		
	}
	
	
}
