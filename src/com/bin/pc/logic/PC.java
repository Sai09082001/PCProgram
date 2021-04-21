package com.bin.pc.logic;

import java.util.Set;

import com.bin.pc.commonutils.AttrRef;
import com.bin.pc.commonutils.DOpt;
import com.bin.pc.commonutils.DomainConstraint;
import com.bin.pc.commonutils.OptType;

public class PC {
	private final int MODEL_LENGTH = 20;
	private final int YEAR_MIN = 1940;
	private final int MANUFACTURER_LENGTH = 20;
	
	private String model;
	private int year;
	private String manufacturer;
	private Comps comps;
	
	public PC(String model, int year, String manufacturer, Comps comps) {
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.comps = comps;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Comps getComps() {
		return comps;
	}

	public void setComps(Comps comps) {
		this.comps = comps;
	}
	
}