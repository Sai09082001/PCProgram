package com.bin.pc.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.bin.pc.ui.GUI;

public class InputDataPanel extends BasePanel {
	private static final String BT_NO = "BT_NO";
	private static final String BT_YES = "BT_YES";
	private static final String BT_SUBMIT = null;
	private JLabel lb_id, lb_model, lb_year, lb_manu, lb_comps_cpu, lb_comps_ram, lb_comps_harddisk, lb_comps_graCard, lb_title, lb_quest;
	private JTextField tf_id, tf_model, tf_year, tf_manu, tf_comps_cpu, tf_comps_ram, tf_comps_harddisk, tf_comps_graCard;
	private JButton bt_yes, bt_no, bt_submit;

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
		Font f = new Font("Tahoma", Font.BOLD,40);
		Font f2 = new Font("Tahoma", Font.BOLD, 18);
		Font f1 = new Font("Tahoma", Font.BOLD,15);
		
		lb_manu = createLabel("Manufacturer:", 50, 25, f1, Color.BLACK);
		tf_manu = createTextField(lb_manu.getX()+lb_manu.getWidth()+15, lb_manu.getY(), 300, f1, Color.BLACK);
		lb_id = createLabel("ID user:", 50, 25, f1, Color.BLACK);
		add(lb_id);
		tf_id = createTextField(tf_manu.getX(), lb_id.getY(), 300, f1, Color.BLACK);
		add(tf_id);
		lb_title = createLabel("PC informations: ", lb_id.getX(), lb_id.getHeight()+lb_id.getY()+15, f2, Color.BLACK);
		add(lb_title);
		lb_model = createLabel("Model:", lb_id.getX(), lb_title.getHeight()+lb_title.getY()+15, f1, Color.BLACK);
		add(lb_model);
		tf_model = createTextField(tf_id.getX(), lb_model.getY(), 300, f1, Color.BLACK);
		add(tf_model);
		lb_year = createLabel("Year:", lb_id.getX(), lb_model.getY()+lb_model.getHeight()+15, f1, Color.BLACK);
		add(lb_year);
		tf_year = createTextField(tf_id.getX(), lb_year.getY(), 300, f1, Color.BLACK);
		add(tf_year);
		lb_manu.setLocation(lb_id.getX(), lb_year.getY()+lb_year.getHeight()+15);
		add(lb_manu);
		tf_manu.setLocation(tf_id.getX(), lb_manu.getY());
		add(tf_manu);
		lb_comps_cpu = createLabel("CPU;", lb_manu.getX(), lb_manu.getY()+lb_manu.getHeight()+15, f1, Color.BLACK);
		add(lb_comps_cpu);
		tf_comps_cpu = createTextField(tf_manu.getX(), lb_comps_cpu.getY(), 300, f1, Color.BLACK);
		add(tf_comps_cpu);
		lb_comps_ram = createLabel("RAM:", lb_comps_cpu.getX(), lb_comps_cpu.getY()+lb_comps_cpu.getHeight()+15, f1, Color.BLACK);
		add(lb_comps_ram);
		tf_comps_ram = createTextField(tf_comps_cpu.getX(), lb_comps_ram.getY(), 300, f1, Color.BLACK);
		add(tf_comps_ram);
		lb_comps_harddisk = createLabel("Hard Disk", lb_id.getX(), lb_comps_ram.getY()+lb_comps_ram.getHeight()+15, f1, Color.BLACK);
		add(lb_comps_harddisk);
		tf_comps_harddisk = createTextField(tf_id.getX(), lb_comps_harddisk.getY(), 300, f1, Color.BLACK);
		add(tf_comps_harddisk);
		lb_comps_graCard = createLabel("Graphics Card:", lb_comps_harddisk.getX(), lb_comps_harddisk.getHeight()+lb_comps_harddisk.getY()+15, f1, Color.BLACK);
		add(lb_comps_graCard);
		tf_comps_graCard = createTextField(tf_id.getX(), lb_comps_graCard.getY(), 300, f1, Color.BLACK);
		add(tf_comps_graCard);
//		lb_quest = createLabel("DO YOU WANT TO CONTINUE?", lb_id.getX(), lb_comps_graCard.getY()+lb_comps_graCard.getHeight()+15, f1, Color.BLACK);
//		add(lb_quest);
//		bt_yes = createButton("YES", lb_id.getX()+100, lb_quest.getY()+lb_quest.getHeight()+15, f1, Color.BLACK, BT_YES);
//		add(bt_yes);
//		bt_no = createButton("NO", bt_yes.getX()+200, bt_yes.getY(), f1, Color.BLACK, BT_NO);
//		add(bt_no);
		bt_submit = createButton("Submit Date", lb_id.getX(), tf_comps_graCard.getHeight()+tf_comps_graCard.getY()+15, f1, Color.BLACK, BT_SUBMIT);
		int x = GUI.W_SIZE/2 - bt_submit.getWidth()/2;
		bt_submit.setLocation(x, bt_submit.getY());
		add(bt_submit);
	}


}
