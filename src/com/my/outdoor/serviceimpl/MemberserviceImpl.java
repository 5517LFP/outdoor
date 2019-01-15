package com.my.outdoor.serviceimpl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;







import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.outdoor.mapper.MemberMapper;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.pojo.MemberExample;
import com.my.outdoor.pojo.MemberExample.Criteria;
import com.my.outdoor.pojo.MemberExample.Criterion;
import com.my.outdoor.service.Memberservice;
import com.my.outdoor.utils.Pagebean;
@Service
public class MemberserviceImpl implements Memberservice {
	@Autowired
	private MemberMapper memberMapper;
	@Test
	@Override
	public List<Member> showMembers() {
		MemberExample member=new MemberExample();
		List<Member> list=memberMapper.selectByExample(member);
		
		for(Member e:list){
			System.out.println(e.toString());
		}
		return list;
	}
	@Override
	public void insertMembers(Member m) {
		int i=memberMapper.insert(m);
		if(i==1){
			System.out.println("成功插入");
		}
	}
	@Override
	public List<Member> serchMembers(Member m) {
		System.out.println("我已经进入服务实现层"+m.getHname()+m.getHlv()+m.getHphonenumber()+m.getHidcard());
		
		MemberExample m2=new MemberExample();
		Criteria createCriteria = m2.createCriteria();
		if(m.getHname()!=null&&!m.getHname().equals("")){
			System.out.println("进来hname"+m.getHname());
			createCriteria.andHnameLike("%"+m.getHname()+"%");
		}
		if(m.getHlv()!=null&&!m.getHlv().equals("")){
			System.out.println("进来hlv"+m.getHlv());
			createCriteria.andHlvLike("%"+m.getHlv()+"%");
		}
		if(m.getHphonenumber()!=null&&!m.getHphonenumber().equals("")){
			createCriteria.andHphonenumberEqualTo(m.getHphonenumber());
		}
		if(m.getHidcard()!=null&&!m.getHidcard().equals("")){
			createCriteria.andHidcardLike("%"+m.getHidcard()+"%");
		}

		List<Member> list=memberMapper.selectByExample(m2);
		
		for(Member s:list){
			System.out.println("返回数据为"+s.getHemail()+":"+s.getHname());
		}
		return list;
	}
	@Override
	public List<Member> updateMembers(Member m) {
		System.out.println("我已经进入serviceimpl层");
		MemberExample example=new MemberExample();
		Criteria criteria=example.createCriteria();
		criteria.andHidEqualTo(m.getHid());
		int i=memberMapper.updateByExample(m, example);
		if(i==1){
			MemberExample example2=new MemberExample();
			List<Member> list=memberMapper.selectByExample(example2);
			return list;
			
		}
		return null;
	}
	@Override
	public void deleteMembers(Member m) {
		MemberExample example=new MemberExample();
		Criteria criteria=example.createCriteria();
		criteria.andHidEqualTo(m.getHid());
		memberMapper.deleteByExample(example);
		
	}
	@Override
	public List<Member> selshowMembers(Pagebean<Member> page) {
		//需要传进来的分页条件有rows，page（当前页码数）
		//memberMapper.selectByExample(example);
		System.out.println(page.getPage());
		System.out.println(page.getRows());
		
		MemberExample example=new MemberExample();
		
		
		List<Member> list=memberMapper.selectByExample(example);
		System.out.println("总页数为："+page.getTotal());
		if(page.getPage()!=page.getTotal()){
		     list=list.subList((page.getPage()-1)*page.getRows(),page.getPage()*page.getRows());
		}else{
			 list=list.subList((page.getPage()-1)*page.getRows(),page.getRecords());
		}
		
		//PageHelper.startPage(page.getPage(),page.getRows());
		//PageInfo<Member> p=new PageInfo<>(list);
		
		for(Member m:list){
			
			System.out.println("test  "+m.getHname());
			
		}
		return list;
		
	}
	@Override
	public int countmemeber() {
		MemberExample example=new MemberExample();
		int i=memberMapper.countByExample(example);
		return i;
	}
}
