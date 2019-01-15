package com.my.outdoor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.ActivemanagerMapper;
import com.my.outdoor.mapper.MemactlistMapper;
import com.my.outdoor.mapper.MemberMapper;
import com.my.outdoor.pojo.Activemanager;
import com.my.outdoor.pojo.ActivemanagerExample;
import com.my.outdoor.pojo.Memactlist;
import com.my.outdoor.pojo.MemactlistExample;
import com.my.outdoor.pojo.MemactlistExample.Criteria;
import com.my.outdoor.pojo.MemactlistExample.Criterion;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.pojo.MemberExample;
import com.my.outdoor.service.Memberactive;
@Service
public class Memberactiveimpl implements Memberactive {
	@Autowired
	private MemactlistMapper memactlistMapper;
	@Autowired
	private ActivemanagerMapper activemanagerMapper;
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<Memactlist> listmemactlist() {
		MemactlistExample example=new MemactlistExample();
		List<Memactlist> list=memactlistMapper.selectByExample(example);
		return list;
	}

	@Override
	public void delmemactivelist(Memactlist memactlist) {
		MemactlistExample example=new MemactlistExample();
		Criteria criteria=example.createCriteria();
		criteria.andMaidEqualTo(memactlist.getMaid());
		memactlistMapper.deleteByExample(example);
		
	}

	@Override
	public void addmemactivelist(Memactlist memactlist) {
		String zzString=memactlist.getAname();
		ActivemanagerExample example=new ActivemanagerExample();
		com.my.outdoor.pojo.ActivemanagerExample.Criteria criteria=example.createCriteria();
		criteria.andAnameLike("%"+zzString+"%"); 
		
		System.out.println(zzString);
		List<Activemanager> list=activemanagerMapper.selectByExample(example);
		if(list==null){
			System.out.println("查询值为空");
		}
		
		for(Activemanager m:list){
			System.out.println(m.getAline());
			memactlist.setAlinename(m.getAline());
			memactlist.setAproject(m.getAproject());
			memactlist.setAid(m.getAid());	
		}
		
		MemberExample example2=new MemberExample();
		com.my.outdoor.pojo.MemberExample.Criteria criteria2=example2.createCriteria();
		criteria2.andHnameEqualTo(memactlist.getMname());
		List<Member> list2=memberMapper.selectByExample(example2);
		for(Member a:list2){
			memactlist.setMid(a.getHid());
		}
		
		int i=memactlistMapper.insert(memactlist);
		if(i==1){
			System.out.println("插入成功");
		}
		
	}

	@Override
	public void updateactivelist(Memactlist memactlist) {
		
		
		
		MemactlistExample example=new MemactlistExample();
		Criteria criteria=example.createCriteria();
		criteria.andMaidEqualTo(memactlist.getMaid());
		int i=memactlistMapper.updateByExample(memactlist, example);
		if(i==1){
			System.out.println("更新成功");
		}
		
	}

	@Override
	public List<Memactlist> selectlistmemactlist(String name) {
		Memactlist memactlist=new Memactlist();
		MemactlistExample example=new MemactlistExample();
		Criteria criteria=example.createCriteria();
		criteria.andMnameLike("%"+name+"%");
		List<Memactlist> list=memactlistMapper.selectByExample(example);
		return list;
	}

}
