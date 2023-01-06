package cn.lanqiao.entity;

public class applicationFrom {

	private  int uid;
	private String uname;
	private String utel;
	private String uidentify;
	private String usex;
	private String person;
	private String ulistnumber;
	private String udate;
	private String urequestMoney;
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
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
	public String getUidentify() {
		return uidentify;
	}
	public void setUidentify(String uidentify) {
		this.uidentify = uidentify;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getUlistnumber() {
		return ulistnumber;
	}
	public void setUlistnumber(String ulistnumber) {
		this.ulistnumber = ulistnumber;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getUrequestMoney() {
		return urequestMoney;
	}
	public void setUrequestMoney(String urequestMoney) {
		this.urequestMoney = urequestMoney;
	}
	public applicationFrom() {
		super();
	}
	@Override
	public String toString() {
		return "applicationfrom [uid=" + uid + ", uname=" + uname + ", utel=" + utel + ", uidentify=" + uidentify
				+ ", usex=" + usex + ", person=" + person + ", ulistnumber=" + ulistnumber + ", udate=" + udate
				+ ", urequestMoney=" + urequestMoney + "]";
	}
	
	
}
