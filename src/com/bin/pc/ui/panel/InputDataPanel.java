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

import com.bin.pc.logic.Comps;
import com.bin.pc.logic.PC;
import com.bin.pc.logic.PCManager;
import com.bin.pc.ui.ActionClick;
import com.bin.pc.ui.GUI;

public class InputDataPanel extends BasePanel {
	private static final String BT_NO = "BT_NO";
	private static final String BT_YES = "BT_YES";
	private JLabel lb_id, lb_model, lb_year, lb_manu, lb_comps_cpu, lb_comps_ram, lb_comps_harddisk, lb_comps_graCard, lb_title, lb_quest;
	private JButton bt_yes, bt_no, bt_submit;
	private static final String BT_SUBMIT = "BT_SUBMIT";
	private JTextField tf_id, tf_model, tf_year, tf_manu, tf_comps_cpu, tf_comps_ram, tf_comps_harddisk, tf_comps_graCard;
	private PCManager pcMan;
	
	private ActionClick callBack;
	

	public JLabel getLb_year() {
		return lb_year;
	}

	public void setLb_year(JLabel lb_year) {
		this.lb_year = lb_year;
	}

	public ActionClick getCallBack() {
		return callBack;
	}

	public void setCallBack(ActionClick callBack) {
		this.callBack = callBack;
	}
	
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

		bt_submit = createButton("Submit Date", lb_id.getX(), tf_comps_graCard.getHeight()+tf_comps_graCard.getY()+15, f1, Color.BLACK, BT_SUBMIT);
		int x = GUI.W_SIZE/2 - bt_submit.getWidth()/2;
		bt_submit.setLocation(x, bt_submit.getY());
		add(bt_submit);

	}
	
	@Override
	protected void handleClick(String name) {
		if(name.equals(BT_SUBMIT)) {
			Comps compTemp = new Comps(tf_comps_cpu.getText(), tf_comps_ram.getText(), tf_comps_harddisk.getText(), tf_comps_graCard.getText());
			pcMan = new PCManager();
			pcMan.addDataTemp(tf_model.getText(), Integer.parseInt(tf_year.getText()), tf_manu.getText(), compTemp);
			int rs = JOptionPane.showConfirmDialog(this, "Do you want to add more data?", "Confirm", JOptionPane.YES_NO_OPTION);
			if(rs == JOptionPane.YES_OPTION) {
				resetData();
			}else {
				callBack.clickSubmit(tf_id.getText(), null);
			}
		}
	}

	private void resetData() {
		tf_comps_cpu.setText("");
		tf_comps_graCard.setText("");
		tf_comps_harddisk.setText("");
		tf_comps_ram.setText("");
		tf_manu.setText("");
		tf_model.setText("");
		tf_year.setText("");
	}
}
