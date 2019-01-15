package com.my.outdoor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.LinemanageMapper;
import com.my.outdoor.mapper.MemberMapper;
import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.pojo.LinemanageExample;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.pojo.LinemanageExample.Criteria;
import com.my.outdoor.pojo.MemberExample;
import com.my.outdoor.service.Lineservice;


@Service
public class LineserviceImpl implements Lineservice {
	@Autowired
	private LinemanageMapper linemanageMapper;
	
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<Linemanage> lineshow() {
		LinemanageExample example=new LinemanageExample();
		List<Linemanage> list=linemanageMapper.selectByExample(example);
		
		return list;
	}

	@Override
	public void lineUpdate(Linemanage line) {
		
		LinemanageExample example=new LinemanageExample();
		Criteria criteria=example.createCriteria();
		criteria.andLidEqualTo(line.getLid());
		
		System.out.println(line.getLinename()+"lineid为"+line.getLid());
		int i=linemanageMapper.updateByExampleSelective(line, example);
		if(i==1){
			System.out.println("更新成功");
			
		}
		
		
	}

	@Override
	public void lineDelete(Linemanage line) {
		LinemanageExample example=new LinemanageExample();
		Criteria criteria=example.createCriteria();
		criteria.andLidEqualTo(line.getLid());
		int i=linemanageMapper.deleteByExample(example);
		if(i==1){
			System.out.println("删除成功");
		}
		
	}

	@Override
	public void lineAdd(Linemanage line) {
		// TODO Auto-generated method stub
		
		int i=linemanageMapper.insert(line);
		if(i==1){
			System.out.println("添加成功");
		}
	}

	@Override
	public List<Linemanage> lineSerch(Linemanage line) {
		LinemanageExample example=new LinemanageExample();
		Criteria criteria=example.createCriteria();
		if(line.getLinename()!=null){
			System.out.println(line.getLinename());
			criteria.andLinenameLike("%"+line.getLinename()+"%");	
		}
		if(line.getLinecontent()!=null){
			System.out.println(line.getLinecontent());
			criteria.andLinecontentLike("%"+line.getLinecontent()+"%");
		}
		if(line.getLinetype()!=null){
			System.out.println("linetype进来了"+line.getLinetype());
			criteria.andLinetypeLike("%"+line.getLinetype()+"%");
		}
		if(line.getAbouttime()!=null){
			if(line.getAbouttime()>2){
				criteria.andAbouttimeBetween(line.getAbouttime()+2, line.getAbouttime()+2);
			}else{
				criteria.andAbouttimeBetween(0, line.getAbouttime()+2);
			}
		}
		
		List<Linemanage> list=linemanageMapper.selectByExample(example);
		for(Linemanage s:list){
			System.out.println("返回数据为"+s.getLinename()+":"+s.getLinecontent());
			
		}
		// TODO Auto-generated method stub
		return list;
	}

	

	

}
