package com.bin.pc.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;

public class MainPanel extends BasePanel{
    private InputDataPanel tong2SoABPanel;
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
		tong2SoABPanel=new InputDataPanel();
		add(tong2SoABPanel);
	}

}
