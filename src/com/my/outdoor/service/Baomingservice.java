package com.my.outdoor.service;

import java.util.List;

import com.my.outdoor.pojo.Benlist;

public interface Baomingservice {
	
	public List<Benlist> listbenlist();
	public void addenlist(Benlist benlist);
	public void updateenlist(Benlist benlist);
	public void delenlist(Benlist benlist);
	

}
