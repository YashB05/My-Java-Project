package bank.model;

public class Register {
 private int rno;
 private String fanme;
 private String lname;
 private double accbal;
 private String uname;
 private String pass;
public Register(int rno, String fanme, String lname, double accbal, String uname, String pass) {
	super();
	this.rno = rno;
	this.fanme = fanme;
	this.lname = lname;
	this.accbal = accbal;
	this.uname = uname;
	this.pass = pass;
}
public Register() {
	
}
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getFanme() {
	return fanme;
}
public void setFanme(String fanme) {
	this.fanme = fanme;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public double getAccbal() {
	return accbal;
}
public void setAccbal(double accbal) {
	this.accbal = accbal;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
 
 
}
