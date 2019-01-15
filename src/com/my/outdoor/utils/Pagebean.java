package com.my.outdoor.utils;

import java.util.List;

public class Pagebean<T> {
	
	private int total;// json�д���ҳ������������
	private int page;// json�д���ǰҳ�������
	private int rows;
	private int records;// json�д�������������������  
	private List<T> formList;// json�д���ʵ��ģ�����ݵ����  
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
