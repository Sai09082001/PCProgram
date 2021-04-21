package com.bin.pc.logic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;


public class PCManager {
	public static final String PATH_USING = "D:\\pc.txt";
	public static final String PATH_REPORT = "D:\\pc_report.txt";
	private List<PC> list;
	
	public PCManager() {
		list = new ArrayList<PC>();
	}
	
	public void getData() {
		File file = new File(PATH_USING);
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			String data = "";
			while(raf.getFilePointer() < raf.length()) {
				data += raf.readLine() + "\n";
			}
			raf.close();
			if(data.equals("")) {
				return;
			}
			String[] arrPC = data.split("\n");
			for(String pcInfo: arrPC) {
				String[] info = pcInfo.split("_");
				Comps comps = new Comps(info[3], info[4], info[5], info[6]);
				PC pc = new PC(info[0], Integer.parseInt(info[1]), info[2], comps);
				list.add(pc);
				for(String s: info) {
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addDataTemp(String model, int year, String manufacturer, Comps comps) {
		File file = new File(PATH_USING);
		PC pc = new PC(model, year, manufacturer, comps);
		try {
			FileOutputStream out = new FileOutputStream(file,true);
			String s = model + "_"+String.valueOf(year)+"_"+manufacturer+"_"+comps.getCpu()+"_"+comps.getRam()+"_"+comps.getHardDisk()+"_"+comps.getGraphicsCard() + "\n";
			byte[] buff = s.getBytes();
			out.write(buff);
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addDataReport(String s) {
		File file = new File(PATH_REPORT);
		try {
			FileOutputStream out = new FileOutputStream(file,true);
			byte[] buff = s.getBytes();
			out.write(buff);
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<PC> getList() {
		return list;
	}

	public void setList(List<PC> list) {
		this.list = list;
	}
	
	
}
