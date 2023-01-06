package cn.lanqiao.entity;

public class MoneyTable {
	private int uid;
	private String one;
	private String two;
	private String three;
	private String four;
	private String five;
	private String six;
	private String  saven;
	private String eight;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getOne() {
		return one;
	}
	public void setOne(String one) {
		this.one = one;
	}
	public String getTwo() {
		return two;
	}
	public void setTwo(String two) {
		this.two = two;
	}
	public String getThree() {
		return three;
	}
	public void setThree(String three) {
		this.three = three;
	}
	public String getFour() {
		return four;
	}
	public void setFour(String four) {
		this.four = four;
	}
	public String getFive() {
		return five;
	}
	public void setFive(String five) {
		this.five = five;
	}
	public String getSix() {
		return six;
	}
	public void setSix(String six) {
		this.six = six;
	}
	public String getSaven() {
		return saven;
	}
	public void setSaven(String saven) {
		this.saven = saven;
	}
	public String getEight() {
		return eight;
	}
	public void setEight(String eight) {
		this.eight = eight;
	}
	@Override
	public String toString() {
		return "MoneyTable [uid=" + uid + ", one=" + one + ", two=" + two + ", three=" + three + ", four=" + four
				+ ", five=" + five + ", six=" + six + ", saven=" + saven + ", eight=" + eight + "]";
	}
	public MoneyTable() {
		super();
	}
}
