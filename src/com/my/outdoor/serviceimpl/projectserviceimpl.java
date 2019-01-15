package com.my.outdoor.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.outdoor.mapper.ProjectMapper;
import com.my.outdoor.pojo.Project;
import com.my.outdoor.pojo.ProjectExample;
import com.my.outdoor.pojo.ProjectExample.Criteria;
import com.my.outdoor.service.projectservice;
@Service
public class projectserviceimpl implements projectservice {
	@Autowired
	private ProjectMapper projectMapper;

	@Override
	public List<Project> listProject(){
		
		ProjectExample example=new ProjectExample();
		List<Project> list=projectMapper.selectByExample(example);
		System.out.println("service层");
		return list;
	}

	@Override
	public void projectUpadate(Project project) {
		
		ProjectExample example=new ProjectExample();
		Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo(project.getPid());
		int i=projectMapper.updateByExampleSelective(project, example);
		if(i==1){
			System.out.println("修改成功");
		}
		
		
	}

	@Override
	public void projectDelete(Project project) {
		System.out.println("我进入删除层了");
		ProjectExample example=new ProjectExample();
		Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo(project.getPid());
		int i=projectMapper.deleteByExample(example);
		if(i==1){
			System.out.println("delete success");
			
		}
		
	}

	@Override
	public void projectAdd(Project project) {
		int i=projectMapper.insert(project);
		if(i==1){
			System.out.println("add success");
		}
		
	}

	@Override
	public List<Project> projectList(Project p) {
		ProjectExample example=new ProjectExample();
		Criteria criteria=example.createCriteria();
		System.out.println(p.getLvd());
	
		
		if(p.getLvd()!=null){
			criteria.andLvdLike("%"+p.getLvd()+"%");
		}
		if(p.getLvs()!=null){
			System.out.println(p.getLvs());
			criteria.andLvsLike("%"+p.getLvs()+"%");
		}
		if(p.getType()!=null){
			criteria.andTypeLike("%"+p.getType()+"%");	
		}
		if(p.getContent()!=null){
			criteria.andContentLike("%"+p.getContent()+"%");	
		}
		if(p.getName()!=null){
			criteria.andNameLike("%"+p.getName()+"%");
		}
		List<Project> list=projectMapper.selectByExample(example);
		return list;
	}

}
