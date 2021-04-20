package com.bin.pc.logic;

public class Comps {
	private String cpu;
	private String ram;
	private String hardDisk;
	private String graphicsCard;
	
	public Comps(String cpu, String ram, String hardDisk, String graphicsCard) {
		this.cpu = cpu;
		this.ram = ram;
		this.hardDisk = hardDisk;
		this.graphicsCard = graphicsCard;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	
	
}
