package com.my.outdoor.service;

import java.util.List;

import com.my.outdoor.pojo.Activemanager;

public interface Activeservice {
	public List<Activemanager> activelist();
	public void activeupdate(Activemanager activemanager);
	public void activedelete(Activemanager activemanager);
	public void activeadd(Activemanager activemanager);
	
	public List<Activemanager> superserch(String serchtext);

}
