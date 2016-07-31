package com.tms.controller;

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
