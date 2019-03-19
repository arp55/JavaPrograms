package com.DemoApp;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="mobile_details")
public class MobileDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="incr", strategy="increment")
	@GeneratedValue(generator="incr")
	
	private int imeiNo;
	private String company;
	private String model;
	private String color;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="imeiNo")
	private BatteryDTO battery;
	public int getImeiNo() {
		return imeiNo;
	}
	public void setImeiNo(int imeiNo) {
		this.imeiNo = imeiNo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public BatteryDTO getBattery() {
		return battery;
	}
	public void setBattery(BatteryDTO battery) {
		this.battery = battery;
	}
}
