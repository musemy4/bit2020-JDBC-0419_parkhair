package io2.awt;

import java.awt.*;
import java.util.Calendar;

public class Schedular extends Frame{
	Panel pUp= new Panel();
	Button btnPrevMon = new Button("¢¸");
	Button btnNextMon = new Button("¢º");
	Label lblYearMon = new Label();
	
	Calendar curMon = Calendar.getInstance();
	
	public Schedular(String title) {
		super(title);
		
		pUp.setBackground(Color.yellow);
		pUp.setLayout(new FlowLayout(FlowLayout.CENTER));
		pUp.add(btnPrevMon);
		pUp.add(lblYearMon);
		pUp.add(btnNextMon);
		
		//btnPrevMon.addActionListener(new BtnEventHandler());
		
		
		
	}
			
			
			
			
			
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
