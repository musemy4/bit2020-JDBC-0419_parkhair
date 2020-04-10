package suwop.w4.d20.windowBuilder;


import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxEx extends JFrame {
	JCheckBox ch01 = new JCheckBox("���",true);
	JCheckBox ch02 = new JCheckBox("���弭��",false);
	JCheckBox ch03 = new JCheckBox("����",false);
	
	JPanel p = new JPanel(new FlowLayout());
	
	public CheckBoxEx() {
		p.add(ch01);
		p.add(ch02);
		p.add(ch03);
		
		add("North",p);
		
		CheckboxEventHandler handler = new CheckboxEventHandler();
		ch01.addItemListener(handler);
		ch02.addItemListener(handler);
		ch03.addItemListener(handler);
		
		
		setSize(300,300);
		setVisible(true);
	}
	
	class CheckboxEventHandler implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() instanceof JCheckBox) {
			JCheckBox check = (JCheckBox)e.getSource();
			if(check==ch01) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("��� ����");
				} else {
					System.out.println("��� ����");
				}
			}
			if(check==ch02) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("���弭�� ����");
				} else {
					System.out.println("���弭�� ����");
				}
			}
			if(check==ch03) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
			}
			
			}
		}
	}
		public static void main(String[] args) {
		new CheckBoxEx();
	}

}
