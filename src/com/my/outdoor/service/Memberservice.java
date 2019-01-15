package com.my.outdoor.service;

import java.util.List;





import com.my.outdoor.pojo.Member;
import com.my.outdoor.utils.Pagebean;

public interface Memberservice {
	public List<Member> showMembers();
	public void insertMembers(Member m);
	public List<Member> serchMembers(Member m);
	public List<Member> updateMembers(Member m);
	public void deleteMembers(Member m);
	//·ÖÒ³²âÊÔ
	public List<Member> selshowMembers(Pagebean<Member> page);
	public int countmemeber();
	
}
