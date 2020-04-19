package miniProj_0417.member.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
public class InputView extends View {
	JPanel inputPane = new JPanel();
	
	
	public InputView() {
		display();
		evt();
	}
	
	@Override
	void display() {
		inputPane.setLayout(new GridLayout(3,1));
		JLabel lblName = new JLabel("이름 :");
		JLabel lblphone = new JLabel("연락처 :");
		
		
		rb_m.setFont(new Font("consolas",Font.PLAIN,10));
		rb_f.setFont(new Font("consolas",Font.PLAIN,10));
		rb_m.setSelected(true);
		g.add(rb_m);
		g.add(rb_f);
		
		inputPane.add(rb_m);
		inputPane.add(rb_f);
		inputPane.add(lblName);
		inputPane.add(tf_name);
		inputPane.add(lblphone);
		inputPane.add(tf_phone);
		
		add(inputPane);
		
	}

	@Override
	void evt() {
		
	}

}
