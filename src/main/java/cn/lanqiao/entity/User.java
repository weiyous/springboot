package cn.lanqiao.entity;
import org.springframework.web.bind.annotation.CrossOrigin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class User {
		private int uid;
		private String uloginid;
		private String upassword;
		private String usex;
		private String utel;
		private String uaddress;
		private String uname;
		private String uemail;
		private String udate;
		private String ubalance;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getUloginid() {
			return uloginid;
		}
		public void setUloginid(String uloginid) {
			this.uloginid = uloginid;
		}
		public String getUpassword() {
			return upassword;
		}
		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}
		public String getUsex() {
			return usex;
		}
		public void setUsex(String usex) {
			this.usex = usex;
		}
		public String getUtel() {
			return utel;
		}
		public void setUtel(String utel) {
			this.utel = utel;
		}
		public String getUaddress() {
			return uaddress;
		}
		public void setUaddress(String uaddress) {
			this.uaddress = uaddress;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getUemail() {
			return uemail;
		}
		public void setUemail(String uemail) {
			this.uemail = uemail;
		}
		public String getUdate() {
			return udate;
		}
		public void setUdate(String udate) {
			this.udate = udate;
		}
		public String getUbalance() {
			return ubalance;
		}
		public void setUbalance(String ubalance) {
			this.ubalance = ubalance;
		}
		@Override
		public String toString() {
			return "User [uid=" + uid + ", uloginid=" + uloginid + ", upassword=" + upassword + ", usex=" + usex
					+ ", utel=" + utel + ", uaddress=" + uaddress + ", uname=" + uname + ", uemail=" + uemail
					+ ", udate=" + udate + ", ubalance=" + ubalance + "]";
		}
		public User() {
			super();
		}	
		
}
