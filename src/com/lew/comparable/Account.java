package com.lew.comparable;

public class Account implements Comparable<Account> {
	String name;
	String type;
	String remark;

	public Account(String name, String type, String remark) {
		this.name = name;
		this.type = type;
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		// return this.getName().compareTo(o.getName());

		return o.getName().compareTo(this.getName());

	}

}
