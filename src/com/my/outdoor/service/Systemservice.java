package com.my.outdoor.service;

import java.util.List;

import com.my.outdoor.pojo.Staff;

public interface Systemservice {
	public List<Staff> liststaff();
	public void update(Staff staff);
	public void deletestaff(Staff staff);
	public void addstaff(Staff staff);
	
	public int systeminit();

}
