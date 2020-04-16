package swingMvc_h2.proj0416_20.view;

import java.awt.Color;

import javax.swing.*;
public class InputView extends View {
	JPanel inputPane = new JPanel();
	
	
	
	
	public InputView() {
		display();
	}
	
	
	@Override
	void display() {
		JLabel lbl_name = new JLabel("회원명 :");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setBounds(12, 53, 89, 28);
		inputPane.add(lbl_name);
		
		JLabel lbl_phone = new JLabel("전화번호 :");
		lbl_phone.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_phone.setBounds(12, 85, 89, 28);
		inputPane.add(lbl_phone);
		
		JLabel lbl_designer = new JLabel("담당디자이너:");
		lbl_designer.setHorizontalAlignment(SwingConstants.RIGHT);
		inputPane.add(lbl_designer);
		lbl_designer.setBounds(12, 143, 89, 28);
		
		
		tf_name.setBounds(110, 57, 116, 21);
		inputPane.add(tf_name);
		tf_name.setColumns(10);
		
		tf_phone.setColumns(10);
		tf_phone.setBounds(110, 89, 116, 21);
		inputPane.add(tf_phone);
		
		JLabel lbl_ismember = new JLabel("회원/비회원 :");
		lbl_ismember.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ismember.setBounds(12, 22, 89, 28);
		inputPane.add(lbl_ismember);
		
		JRadioButton rb_new = new JRadioButton("new");
		rb_new.setBounds(110, 24, 56, 25);
		inputPane.add(rb_new);
		
		JRadioButton rb_member = new JRadioButton("member");
		rb_member.setBounds(173, 24, 73, 25);
		inputPane.add(rb_member);
		
		JComboBox cb_hair = new JComboBox();
		cb_hair.setBounds(110, 183, 115, 24);
		inputPane.add(cb_hair);
		
		JLabel lbl_hair = new JLabel("시술명 :");
		lbl_hair.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_hair.setBounds(12, 181, 89, 28);
		inputPane.add(lbl_hair);
		
		JList designerlist = new JList();
		designerlist.setBounds(113, 149, 116, 21);
		inputPane.add(designerlist);
		
		JLabel lbl_hair2 = new JLabel("서비스 :");
		lbl_hair2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_hair2.setBounds(12, 219, 89, 28);
		inputPane.add(lbl_hair2);
		
		JComboBox cb_hair2 = new JComboBox();
		cb_hair2.setBounds(110, 217, 115, 24);
		inputPane.add(cb_hair2);
		
		JLabel lbl_pay = new JLabel("금액 :");
		lbl_pay.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pay.setBounds(12, 272, 89, 28);
		inputPane.add(lbl_pay);
		
		tf_pay.setColumns(10);
		tf_pay.setBounds(110, 276, 116, 21);
		inputPane.add(tf_pay);
		
		JLabel lbl_point = new JLabel("포인트 :");
		lbl_point.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_point.setBounds(12, 307, 89, 28);
		inputPane.add(lbl_point);
		
		
		tf_point.setColumns(10);
		tf_point.setBounds(110, 311, 116, 21);
		inputPane.add(tf_point);
	}

	@Override
	void evt() {
		
		
		
	}

}
