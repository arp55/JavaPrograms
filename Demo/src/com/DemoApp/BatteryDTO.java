package com.DemoApp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="battery_details")
public class BatteryDTO implements Serializable {
	@Id
	@GenericGenerator(name="incr",strategy="increment")
	@GeneratedValue(generator="incr")
	private int srNo;
	private String company;
	private String mah;
	
	@OneToOne
	@JoinColumn(name="imeiNo")
	
	private MobileDTO mobile;

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMah() {
		return mah;
	}

	public void setMah(String mah) {
		this.mah = mah;
	}

	public MobileDTO getMobile() {
		return mobile;
	}

	public void setMobile(MobileDTO mobile) {
		this.mobile = mobile;
	}
}
