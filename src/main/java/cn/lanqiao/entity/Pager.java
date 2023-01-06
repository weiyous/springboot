package cn.lanqiao.entity;

import java.util.ArrayList;
import java.util.List;

public class Pager<T> {
	private List<T> data=new ArrayList<T>();//当前页面数据
	private Integer  pagesize;//每页的页面大小
	private Integer totals;//总记录数
	private Integer pages;//总页数
	private Integer pageindex;//当前页码
	public Pager(){
		
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Integer getTotals() {
		return totals;
	}
	public void setTotals(Integer totals) {
		this.totals = totals;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getPageindex() {
		return pageindex;
	}
	public void setPageindex(Integer pageindex) {
		this.pageindex = pageindex;
	}
	@Override
	public String toString() {
		return "Pager [data=" + data + ", pagesize=" + pagesize + ", totals=" + totals + ", pages=" + pages
				+ ", pageindex=" + pageindex + "]";
	}
	
 }
