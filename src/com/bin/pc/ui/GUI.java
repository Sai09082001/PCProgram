package com.bin.pc.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import com.bin.pc.ui.panel.MainPanel;

import javax.swing.UnsupportedLookAndFeelException;

public class GUI extends JFrame {
	public static final int H_SIZE = 450;
	public static final int W_SIZE = 600;
	private MainPanel mainPanel;

	public GUI() {
		// TODO Auto-generated constructor stub
		initUI();
		addEvent();
		addComp();
	}

	private void addComp() {
		// TODO Auto-generated method stub
		mainPanel=new MainPanel();
		add(mainPanel);
	}

	private void addEvent() {
		// TODO Auto-generated method stub
		WindowAdapter event=new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				int result=JOptionPane.showConfirmDialog(null, "Ban co muon dong app k??:((",
						"Xac nhan!!",JOptionPane.YES_NO_OPTION);
				if(result==JOptionPane.YES_OPTION) {
					dispose();// dong het ung ung
				}
			}
		};
		addWindowListener(event);
	}

	private void initUI() {
		// TODO Auto-generated method stub
		setTitle("PC Program");
		setSize(W_SIZE, H_SIZE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.RED);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLayout(new CardLayout());
		//javax.swing.plaf.metal.MetalLookAndFeel
		//javax.swing.plaf.nimbus.NimbusLookAndFeel
		//com.sun.java.swing.plaf.motif.MotifLookAndFeel
		//com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		//com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
