package cn.lanqiao.entity;

public class Profit {
	private int uid;
	private String project;
	private String amountNow;
	private String amountLast;
	@Override
	public String toString() {
		return "Profit [uid=" + uid + ", project=" + project + ", amountNow=" + amountNow + ", amountLast=" + amountLast
				+ "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getAmountNow() {
		return amountNow;
	}
	public void setAmountNow(String amountNow) {
		this.amountNow = amountNow;
	}
	public String getAmountLast() {
		return amountLast;
	}
	public void setAmountLast(String amountLast) {
		this.amountLast = amountLast;
	}
	public Profit() {
		super();
	}
	
	
}
