package miniProj_0417.db.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;

import miniProj_0417.db.resource.IdxSet;
import miniProj_0417.db.resource.R;

public class SettinView extends View{

	JPanel settin = new JPanel(new GridLayout(5,1));

	public SettinView() {
		
		display();
	}
	
	
	@Override
	void display() {
		JLabel lblidx=new JLabel("* 고객번호: "+member.get(0));
		JLabel lblname=new JLabel("* 이름 : "+member.get(1));
		JLabel lblpoint=new JLabel("* 가용포인트 : "+member.get(6));
		JLabel lblmembership=new JLabel("* 고객등급 : "+member.get(7));
		
		settin.setBackground(new Color(255, 255, 255));
		
		
		lblidx.setFont(new Font("굴림",Font.PLAIN,12));
		lblname.setFont(new Font("굴림",Font.PLAIN,12));
		lblpoint.setFont(new Font("굴림",Font.PLAIN,12));
		lblmembership.setFont(new Font("굴림",Font.PLAIN,12));
		
		settin.add(new JLabel(""));
		settin.add(lblidx);
		settin.add(lblname);
		settin.add(lblpoint);
		settin.add(lblmembership);
		
		add(settin);
	}

	@Override
	void evt() {
		// TODO Auto-generated method stub

	}

}
