package com.bin.pc.ui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import com.bin.pc.logic.PC;
import com.bin.pc.logic.PCManager;

public class ReportPanel extends BasePanel{
	private static final String BT_SHOWREP = "BT_SHOWREP";
	private static final String BT_BACK = "BT_BACK";
	private static final String BT_SAVEREP = "BT_SAVEREP";
	private JButton bt_showRep, bt_Back, bt_saveRep;
	private JTextArea ta_report;
	private JScrollPane scr;
	private String id;
	private PCManager pcMan;

	@Override
	public void initUI() {
		// TODO Auto-generated method stub
		setBackground(Color.GRAY);
		setLayout(null);
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
	}

	@Override
	public void addComp() {
		// TODO Auto-generated method stub
		Font f = new Font("Tahoma", Font.BOLD,40);
		Font f2 = new Font("Tahoma", Font.BOLD, 18);
		Font f1 = new Font("Tahoma", Font.BOLD,15);
		
		ta_report = new JTextArea();
		ta_report.setEditable(false);
		
		scr = new JScrollPane(ta_report);
		scr.setLocation(50, 60);
		scr.setSize(500, 300);
		scr.setBackground(Color.LIGHT_GRAY);
		add(scr);
		
		bt_showRep = createButton("Show Report", 400, scr.getY()-30, f1, Color.BLACK, BT_SHOWREP);
		add(bt_showRep);
		bt_Back = createButton("Back", scr.getX(), scr.getHeight()+scr.getY()+15, f1, Color.BLACK, BT_BACK);
//		add(bt_Back);
		bt_saveRep = createButton("Save Report", 400, bt_Back.getY(), f1, Color.BLACK, BT_SAVEREP);
		add(bt_saveRep);
		
	}
	
	@Override
	protected void handleClick(String name) {
		if(name.equals(BT_SHOWREP)) {
			pcMan = new PCManager();
			pcMan.getData();
			ta_report.setText(textInArea(pcMan));
		}
		if(name.equals(BT_BACK)) {
			
		}
		if(name.equals(BT_SAVEREP)) {
			pcMan.addDataReport(textInArea(pcMan));
			JOptionPane.showMessageDialog(this, "Save file successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private String textInArea(PCManager pcMan) {
		int i = 1;
		String dash = "-------------------------------------------------------------";
		String s = dash + "\r\n" + "\t\tPCPROG REPORT" + "\r\n" + dash + "\r\n"; 
		for(PC pcmantemp: pcMan.getList()) {
			s = s + " " + i + "\t" + pcmantemp.getModel() + " " + pcmantemp.getYear() + "\t\t" + pcmantemp.getManufacturer() + " [" + pcmantemp.getComps().getCpu() 
					+ " CPU, " + pcmantemp.getComps().getRam() + " RAM, " + pcmantemp.getComps().getHardDisk() + " hard disk, " 
					+ pcmantemp.getComps().getGraphicsCard() + " graphics card]\r\n";
			i++;
		}
		s += dash;
		return s;
	}
	
}
