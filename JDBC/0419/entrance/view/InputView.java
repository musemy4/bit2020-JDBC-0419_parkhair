package miniProj_0417.entrance.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class InputView extends View {
	JPanel inputPane=new JPanel();

	JLabel name =new JLabel("이름 : ");
	JLabel pw =new JLabel("비밀번호 : ");

	
	public InputView() {
		display();
	}
	
	@Override
	void display() {
		inputPane.setLayout(new GridLayout(2,1));
		JPanel input=new JPanel(new GridLayout(3,1));
		JPanel explain= new JPanel(new GridLayout(2,1));
	
		JLabel lblex= new JLabel("          *고객 비밀번호는 번호 마지막 4자리입니다");
		lblex.setFont(new Font("굴림",Font.PLAIN,9));
		
		admincheck.setFont(new Font("굴림",Font.PLAIN,9));
		//좀 예쁜곳에 놓고싶다..
		
		name.setFont(new Font("굴림",Font.PLAIN,12));
		pw.setFont(new Font("굴림",Font.PLAIN,12));
		
		input.add(name);
		input.add(tf_name);
		input.add(pw);
		input.add(tf_pw);
		explain.add(lblex);
		input.add(new JPanel());
		input.add(admincheck);
		
		inputPane.add(input);
		inputPane.add(explain);
		
		add(inputPane);
		
	}

	
	@Override
	void evt() {}

}