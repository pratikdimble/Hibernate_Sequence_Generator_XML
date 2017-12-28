
package com.app;



public class Student {
	
	private int sid;
	private String sname;
	private String semail;
	private String sresult;

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSresult() {
		return sresult;
	}
	public void setSresult(String sresult) {
		this.sresult = sresult;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sresult=" + sresult + "]";
	}
	
	

}
