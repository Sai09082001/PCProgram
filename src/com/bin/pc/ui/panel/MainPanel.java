package com.bin.pc.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import com.bin.pc.ui.ActionClick;

public class MainPanel extends BasePanel implements ActionClick{
    private InputDataPanel inputDataPanel;
    private ReportPanel report;
	@Override
	public void initUI() {
		// TODO Auto-generated method stub
		setBackground(Color.green);
		setLayout(new CardLayout());
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComp() {
		// TODO Auto-generated method stub
		inputDataPanel = new InputDataPanel();
		inputDataPanel.setCallBack(this);
		add(inputDataPanel);
		report = new ReportPanel();
		add(report);
	}

	@Override
	public void clickSubmit(String idUser, Object... objects) {
		Font f1 = new Font("Tahoma", Font.BOLD,15);
		// TODO Auto-generated method stub
		JLabel lb_id = createLabel("ID user:"+idUser, 50, 25, f1, Color.BLACK);
		report.add(lb_id);
		add(report);
		inputDataPanel.setVisible(false);
		report.setVisible(true);
	}

}
