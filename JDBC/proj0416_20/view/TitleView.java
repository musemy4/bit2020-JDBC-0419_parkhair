package swingMvc_h2.proj0416_20.view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TitleView extends View {

	public TitleView() {
		display();
	}
	
	@Override
	void display() {
		JLabel title = new JLabel("::: ParkHAIR :::");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Consolas", Font.PLAIN, 30));
		//title.setSize(296, 64);
		//title.setBounds(401, 35, 296, 64);
		add(title);
	}

	@Override
	void evt() {
		// TODO Auto-generated method stub

	}

}
