package com.my.outdoor.service;

import java.util.List;

import com.my.outdoor.pojo.Memactlist;

public interface Memberactive {
	public List<Memactlist> listmemactlist();
	public void delmemactivelist(Memactlist memactlist);
	public void addmemactivelist(Memactlist memactlist);
	public void updateactivelist(Memactlist memactlist);
	public List<Memactlist> selectlistmemactlist(String name);

}
