package miniProj_0417.member.view;

import java.awt.*;

import javax.swing.*;
public class TitleView extends View {
	JPanel titlePane = new JPanel(new GridLayout(2,1));
	
	public TitleView() {
		display();
	}
	
	@Override
	void display() {
		JLabel title = new JLabel("::: PARK HAIR :::");
		title.setFont(new Font("consolas",Font.BOLD,28));
		JLabel title2 = new JLabel("===  JOIN  ===");
		title2.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("consolas",Font.BOLD,20));
		
		
		titlePane.add(title);
		titlePane.add(title2);
		titlePane.setAlignmentX(CENTER_ALIGNMENT);
		
		add(titlePane);
	}

	@Override
	void evt() {}

}
