package com.my.outdoor.service;

import com.my.outdoor.pojo.Admin;
import com.my.outdoor.pojo.Member;
import com.my.outdoor.pojo.Staff;

public interface Loginservice {
	public Admin denglu(String usernameString,String pwd);
	public int zhece(Member member);
	public Staff staffdenglu(String usernameString,String pwd);
	public Member memberdenglu(String usernameString,String pwd);
	public int membermessage(Member m);

}
