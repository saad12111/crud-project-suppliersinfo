package com.suppliers;

public class Suppliers {
	private int supplierid; 
	private String cname;
	private String add;
	private String pcode;
	private String city;
	private String cp;
	private String cpm;
	private String cc;
	private String rdate;
	private String cs;
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getCpm() {
		return cpm;
	}
	public void setCpm(String cpm) {
		this.cpm = cpm;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getCs() {
		return cs;
	}
	public void setCs(String cs) {
		this.cs = cs;
	}
	public Suppliers() {};
	public Suppliers(int supplierid,
	 String cname,
	 String add,
 String pcode,
	 String city,
	 String cp,
	 String cpm,
	String cc,
	String rdate,
	 String cs) {
		this.supplierid=supplierid;
		this.cname=cname;
		this.add=add;
		this.pcode=pcode;
		this.city=city;
		this.cp=cp;
		this.cpm=cpm;
		this.cc=cc;
		this.rdate=rdate;
		this.cs=cs;
	}
}
