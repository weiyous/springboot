package cn.lanqiao.entity;

public class Bill {
	private int uid;
	private String uname;
	private String uduty;
	private String urank;
	private String uidentify;
	private String ubankCar;
	private String ustatus;
	private String udate;
	private String umoney;
	private String uperson;
	private String month;
	@Override
	public String toString() {
		return "Bill [uid=" + uid + ", uname=" + uname + ", uduty=" + uduty + ", urank=" + urank + ", uidentify="
				+ uidentify + ", ubankCar=" + ubankCar + ", ustatus=" + ustatus + ", udate=" + udate + ", umoney="
				+ umoney + ", uperson=" + uperson + ", month=" + month + "]";
	}



	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getUduty() {
		return uduty;
	}



	public void setUduty(String uduty) {
		this.uduty = uduty;
	}



	public String getUrank() {
		return urank;
	}



	public void setUrank(String urank) {
		this.urank = urank;
	}



	public String getUidentify() {
		return uidentify;
	}



	public void setUidentify(String uidentify) {
		this.uidentify = uidentify;
	}



	public String getUbankCar() {
		return ubankCar;
	}



	public void setUbankCar(String ubankCar) {
		this.ubankCar = ubankCar;
	}



	public String getUstatus() {
		return ustatus;
	}



	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}



	public String getUdate() {
		return udate;
	}



	public void setUdate(String udate) {
		this.udate = udate;
	}



	public String getUmoney() {
		return umoney;
	}



	public void setUmoney(String umoney) {
		this.umoney = umoney;
	}



	public String getUperson() {
		return uperson;
	}
	public void setUperson(String uperson) {
		this.uperson = uperson;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}



	public Bill() {
		super();
	}

}
