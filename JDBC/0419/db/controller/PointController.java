package miniProj_0417.db.controller;

import javax.swing.JOptionPane;

import miniProj_0417.db.resource.R;

public class PointController implements Controller,R {

	@Override
	public void service() {
		double usepoint=Double.parseDouble(tf_usepoint.getText());
		
		if(usepoint>Double.valueOf((String) member.get(6))) {
			System.out.println("가용포인트를 벗어남!");
			JOptionPane.showMessageDialog(null, "포인트금액보다 많이 입력하셨습니다");
			return;
		}
		
		double pay=Double.parseDouble(tf_pay.getText());
		
		//재조정
		pay=pay-usepoint;
		
		String paystr=String.valueOf(pay);
		tf_pay.setText(paystr);
		if(member.get(7).equals("손님")) {
			tf_point.setText(String.valueOf(pay*0.05));
		} else if(member.get(7).equals("고객님")) {
			tf_point.setText(String.valueOf(pay*0.1));
		} else if(member.get(7).equals("붙박이님")) {
			tf_point.setText(String.valueOf(pay*0.15));
		}
		
	}

}
