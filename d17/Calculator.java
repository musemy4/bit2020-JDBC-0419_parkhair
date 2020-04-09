package suwop.w4.d18.swing$;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

	private TextField input;//글씨쓰는곳
	private Button bt;
	private boolean state=true;//숫자를 연속으로 눌렀는지의 여부.
	private int op;//연산기호
	private double buffer;//숫자 저장소
	private boolean opstate=true;//연산자를 연속으로 눌렀는지의 여부. 연속으로 누르면 true
	
	//생성자
	public Calculator() {
		super("AWT계산기");
	
		//패널은 두개입니다요
		Panel main = new Panel();//전체판떼기
		main.setLayout(new BorderLayout());//동서남북 레이아웃
		input=new TextField();
		main.add("North",input);//꼭대기에 글씨쓰는곳 만들기
		
		Panel p = new Panel();//버튼달릴판떼기
		p.setLayout(new GridLayout(4,4));//그리드 나눠주는 레이아웃
		
		//버튼 부착하고 이벤트 리스너 연결하기
		String s="789+456-123*0C=/"; //4*4부분
		for(int i=0;i<s.length();i++) {
			bt=new Button(s.substring(i,i+1));//버튼글씨 입력을 해주쟈
			p.add(bt);
			bt.addActionListener(this);
		}
		
		main.add("Center",p);//전체판떼기에 달고
		add(main);//전체판떼기도 달쟈
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(250,180);
		setVisible(true);
	
	}//생성자끝
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String val=e.getActionCommand();//이벤트가 발생한 버튼을 문자열로 리턴
		if(val.equals("C")) {
			input.setText("0");//보여지는 값도 0으로 초기화하고
			buffer=0;//숫자저장소도 0으로 초기화하자
		} else if('0'<=val.charAt(0)&&val.charAt(0)<='9') {//**숫자가 눌릴때
			if(state)input.setText(val); //숫자가 눌렸으면 눌러야지
			else input.setText(input.getText()+val);//원래 숫자가 눌렸으면 뒤에 붙인다. 
			state=false;//숫자가 눌렸으니 이제 숫자는 못입력한다~ 
		} else operator(val);//**연산자가 눌릴때 
		
	}//actionperformed end
	
	
	public void operator(String val) {
		if(val.equals("+")) {
			op=1;//더하기는 1)
			opstate=true;//켜놔야지 계산함
		} else if(val.equals("-")) {
			op=2;//-는 2)
			opstate=true;
		} else if(val.equals("*")) {
			op=3;//*는 3)
			opstate=true;
		} else if(val.equals("/")) {
			op=4;// /는 4)
			opstate=true;
		} else {
			result();
		}
		
		//숫자 저장소에 있던것들 실수화한다
		buffer=(new Double(input.getText())).doubleValue();
		state=true;//숫자 이제 들어올수있음~
	}
	
	//=를 누르면 실행되는 메서드
	public void result() {
		double result=0;
		//실수값으로 언박싱한다
		double in=(new Double(input.getText())).doubleValue();
		switch(op) {
		case 1: result=buffer+in;break;
		case 2: result=buffer-in;break;
		case 3: result=buffer*in;break;
		case 4: result=buffer/in;break;
		}
		//다시 문자화
		input.setText(result+"");
		opstate=false;
	}
		
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
	}

}
