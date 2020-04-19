package miniProj_0417.member.view;

import java.awt.*;
import java.text.*;
import java.util.*;

import javax.swing.*;


public class CalView extends View {
	JPanel calPane = new JPanel(new GridLayout(2,2));
	
		
	public CalView() {
		display();
	}
	
	@Override
	void display() {
		JLabel birth = new JLabel("회원 생일: ");
		JLabel joinDate = new JLabel("가입일: ");
		
		calPane.add(birth);
		calPane.add(birthspin);
		calPane.add(joinDate);
		calPane.add(joinspin);
		
		birthspin.setEditable(true);
		birthspin.setHorizontalAlignment(JTextField.CENTER);
		
		joinspin.setEditable(false);
		joinspin.setHorizontalAlignment(JTextField.CENTER);
		joinspin.setOpaque(true);//얘는 손못대도록
		
			
		add(calPane);
		
	}

	@Override
	void evt() {
		
	}

}
