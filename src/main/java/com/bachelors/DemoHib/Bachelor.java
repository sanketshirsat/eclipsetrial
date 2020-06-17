package com.bachelors.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bachelor //POJO
{   
	@Id
	private int bid;
	private String bname;
	private String color;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
