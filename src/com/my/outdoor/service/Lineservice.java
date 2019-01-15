package com.my.outdoor.service;

import java.util.List;




import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.pojo.Member;

public interface Lineservice {
	public List<Linemanage> lineshow();
	public void lineUpdate(Linemanage line);
	public void lineDelete(Linemanage line);
	public void lineAdd(Linemanage line);
	
	public List<Linemanage> lineSerch(Linemanage line);
	

}
