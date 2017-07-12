package com.hanbit.member.domain;

public class MemberBean {
	private String id,name,password,ssn,regdate;
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPassWord(String password){
		this.password=password;
	}
	public String getPassWord(){
		return password;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setRegDate(String regdate){
		this.regdate=regdate;
	}
	public String getRegDate(){
		return regdate;
	}
	public String toString(){
		return String.format("%s %s %s %s %s", id,name,password,ssn,regdate);
	}
}
