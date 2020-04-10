package suwop.w4.d20.windowBuilder;

import java.awt.*;

import javax.swing.*;

public class JFrameEx01 extends JFrame {
	JPanel contentPane;
	JLabel label = new JLabel("성명: ");
	JTextField txt = new JTextField(10);
	JButton button = new JButton("확인");
	
	JPanel p = new JPanel(new FlowLayout());
	
	public JFrameEx01() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = (JPanel)getContentPane();
		p.add(label);
		p.add(txt);
		p.add(button);
		
		setLayout(new BorderLayout());
		contentPane.add("North",p);
		
		ImageIcon image = new ImageIcon("./src/img/bread.jpg");
		JLabel imgLabel = new JLabel(image);
		contentPane.add(imgLabel);
		
		setSize(300,400);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new JFrameEx01();
	}

}
