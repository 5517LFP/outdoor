package com.my.outdoor.utils;

import java.util.List;

public class Pagebean<T> {
	
	private int total;// json中代表页码总数的数据
	private int page;// json中代表当前页码的数据
	private int rows;
	private int records;// json中代表数据行总数的数据  
	private List<T> formList;// json中代表实际模型数据的入口  
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		if(records/rows==1){
			this.total = 1;
		}else{
			this.total=records/rows+1;
		}
		
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
		if(records/rows==0){
			this.total = 1;
		}else{
			this.total=records/rows+1;
		}
	}
	public List<T> getFormList() {
		return formList;
	}
	public void setFormList(List<T> formList) {
		this.formList = formList;
	}
	
	
	
}
