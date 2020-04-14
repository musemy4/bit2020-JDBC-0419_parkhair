package java_mvc.view;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleView extends View {

	public TitleView() {
		display();
	}
		
	@Override
	public void display() {
		JLabel title = new JLabel("::: MemberList :::");
		title.setFont(new Font("consolas",Font.BOLD,28));
		this.add(title);
	}

	@Override
	public void evt() {
		// TODO Auto-generated method stub

	}

}
