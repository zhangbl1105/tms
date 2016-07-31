package com.tms.controller;

import java.util.Date;

public class SmartContainer {

	/**
	 * The global unique identifier of the smart container
	 */
	private String id;  
	
	/**
	 * The hardware version
	 */
	private String hardwareVersion;

	/**
	 * The hardware provider name
	 */
	private String vendor;
	
	/**
	 * The date of manufacture
	 */
	private Date productDate; 
	
	/**
	 * The owner of this smart container
	 */
	private String owner;

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHardwareVersion() {
		return hardwareVersion;
	}

	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
