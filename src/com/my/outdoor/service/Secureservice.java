package com.my.outdoor.service;

import java.util.List;

import com.my.outdoor.pojo.Secure;

public interface Secureservice {
	public List<Secure> securlist();
	public void securAdd(Secure secure);
	public void securdelete(Secure secure);
	public List<Secure> securUpdate(Secure secure);
	

}
