package com.bin.pc.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.bin.pc.ui.ICommon;

public abstract class BasePanel extends JPanel implements ICommon {
	public BasePanel() {
		// TODO Auto-generated constructor stub
		initUI();
		addEvent();
		addComp();
	}
	protected JLabel createLabel(String text,int x,int y,Font f,Color c) {
		JLabel lb =new JLabel();
		lb.setText(text);
		lb.setLocation(x, y);
		//lb.setOpaque(true);
		
		lb.setForeground(c);
		//lb.setBackground(Color.YELLOW);
		lb.setFont(f);
		FontMetrics fontMetric=getFontMetrics(lb.getFont());
		int wTitle=fontMetric.stringWidth(lb.getText())+10;
		int hTitle=fontMetric.getHeight();
		lb.setSize(wTitle, hTitle);
		//add(lb);
		return lb;
	}
	protected JTextField createTextField(int x,int y,int w,
			Font f,Color c) {
		JTextField tf=new JTextField();
		tf.setFont(f);
		tf.setLocation(x, y);
		FontMetrics fm=getFontMetrics(tf.getFont());
		int hTfA=fm.getHeight();
		tf.setSize(w, hTfA);
		tf.setForeground(c);
		return tf;
	}
	protected JButton createButton(String text ,int x,int y,Font f,Color c,String name) {
		JButton bt=new JButton();
		bt.setText(text);
		bt.setFont(f);
		bt.setName(name);
        bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComponent comp=(JComponent) e.getSource();
				String name=comp.getName(); 
				handleClick(name);
			}

		});
		bt.setForeground(c);
		bt.setLocation(x,y);
		FontMetrics fm=getFontMetrics(bt.getFont());
		
		int w=fm.stringWidth(bt.getText())+bt.getInsets().left*2+10;
		int h=fm.getHeight()+getInsets().top*2;
		bt.setSize(w, h);
		return bt;
	}
	protected void handleClick(String name) {
		// TODO Auto-generated method stub
		
	}
}
