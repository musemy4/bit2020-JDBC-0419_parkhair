package io2.awt;

import java.awt.*;
import java.awt.event.*;

public class Birds extends Frame implements ActionListener{
	Button[] btns = new Button[25];
	String[] birds= {"참새","두루미","황새","비둘기","까오기","오리",
			"타조","부엉이","올빼미","뱁새","꿩","닭","구관조","잉꼬",
			"매","거위","독수리","콘돌","봉황","공작","까치","까마귀","앵무새"
			,"꾀꼬리","고니"};
	
	
	public Birds() {
		super("빙고게임같은.. 새게임");
		
		Panel pane = new Panel();
		add(pane);//프레임에 달어
		pane.setLayout(new GridLayout(5,5));//5*5임
		
		//버튼
		for(int i=0;i<btns.length;i++) {
			Button btn = new Button(birds[i]);//1.버튼에 이름부착
			
			btn.setBackground(new Color(247,247,223));
			pane.add(btn);//2.버튼을 달자
			btn.addActionListener(this);//3.버튼이 눌릴때 이벤트가 일어나게 하자
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//창의 크기
		setSize(300,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x=screen.width/2+this.getWidth()/2;
		int y=screen.height/4;
		
		setLocation(x,y);
		setResizable(false);
		
		
	}//생성자 end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn=(Button)e.getSource();
		btn.setBackground(new Color(217,217,196));
		//System.out.println("겟네임"+btn.getName());
		String birdName = e.getActionCommand();
		System.out.println(birdName);
		
	}
	
	public static void main(String[] args) {
		new Birds().setVisible(true);
	}


}
