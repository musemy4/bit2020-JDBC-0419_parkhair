package suwop.w4.d20.windowBuilder;

import java.awt.FlowLayout;

import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;
public class RadioBtnEx extends JFrame {

	JRadioButton rb01 = new JRadioButton("학생",true);
	JRadioButton rb02 = new JRadioButton("직장인",false);
	JRadioButton rb03 = new JRadioButton("우수 회원",true);
	JRadioButton rb04 = new JRadioButton("일반회원",true);
	
	ButtonGroup gr01 = new ButtonGroup();
	ButtonGroup gr02 = new ButtonGroup();

	public RadioBtnEx() {
		gr01.add(rb01);
		gr01.add(rb02);
		gr02.add(rb03);
		gr02.add(rb04);
		
		JPanel p = new JPanel(new FlowLayout());
		p.add(rb01);
		p.add(rb02);
		p.add(rb03);
		p.add(rb04);
		
		add("North",p);
		
		setSize(640,480);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new RadioBtnEx();
		
		
		
		
	}

}
