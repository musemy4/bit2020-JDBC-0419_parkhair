package w4.day17;

import java.awt.*;
import java.awt.event.*;
public class Calc_0410 extends Frame implements ActionListener {
	
	private TextField input; //얘네는 awt기능들
	private Label allinput; //얘도
	private Button bt;
	private boolean state=true;//숫자
	private boolean rootflag=false;//루트앞에 값이 있으면 true로 변함
	private double sum;//숫자저장소
	private double rootfront;
	private int op;//연산메뉴
	
	public Calc_0410() {
		super("Calculator");//Frame
		//패널만들기
		Panel background = new Panel();
		background.setLayout(new BorderLayout());//동서남북패널
		
		//식이보여지는 allinput 이랑 지금당장 입력되는 input
		input=new TextField();				
		allinput=new Label();
		Panel inputpanel = new Panel();
		inputpanel.setLayout(new GridLayout(2,1));
		inputpanel.add(allinput);
		inputpanel.add(input);
		background.add("North",inputpanel);//가장 위쪽에 달고
		
		//버튼패널		
		Panel buttons=new Panel();
		buttons.setLayout(new GridLayout(4,5));//20개를 넣을거임
		
		//버튼부착
		String s="789+<456-√123*%.0C÷=";
		for(int i=0;i<s.length();i++) {
			bt=new Button(s.substring(i,i+1));//이름으로 넣고
			buttons.add(bt);
			bt.addActionListener(this);//버튼 하나하나에 입력이벤트가 일어나게 할거임**밑에 메소드
		}
		
		background.add(buttons);
		add(background);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//귀여운 크기
		setSize(230,180);
		
		//창을 약간 오른쪽에 뜨게하장
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x=screen.width/2+this.getWidth()/2;
		int y=screen.width/4;
		setLocation(x,y);
		
		//창크기 못바꾸게 하자
		setResizable(false);
		
		
	}//Calc생성자 끝
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String val=arg0.getActionCommand();//눌러진 버튼이름을 문자열로
		//<,C:2개  연산기호:+,-,*,/,%,√:6개 숫자+. 11개 =까지 총 20개
		//우선 연산과 숫자 외를 정의해놓자
		if(val.equals("C")) {//1.완전지우기
			input.setText("");//TextField 메서드 setText()
			allinput.setText("");
			state=true;
			sum=0;//숫자저장소 초기화
		} else if(val.equals("<")) {//2.한글자만 지우기
			String old=input.getText();
			input.setText(old.substring(0,old.length()-1));
			allinput.setText(old.substring(0,old.length()-1));
		} else if('0'<=val.charAt(0)&&'9'>=val.charAt(0)||val.charAt(0)=='.') {//3.숫자관련
			if(state) {
				if(val.charAt(0)=='.') {
					input.setText("0"+val);//첨부터 소숫점찍히면 0달아주자				
					allinput.setText(allinput.getText()+"0"+val);
				} else {
					input.setText(val);
					allinput.setText(allinput.getText()+val);
				}
				
			}//첫숫자끝
			else {//숫자가 두글자이상이면 문자열로 쌓아놓자
				input.setText(input.getText()+val);
				allinput.setText(allinput.getText()+val);
				
			}
			state=false;//두번부터 찍힐때는 문자열로 쌓게끔
		} else if(val.charAt(0)=='%') { //4.루트랑 퍼센트..얘네도 숫자로 취급해야할듯 미리변환해줄거다 머리아프니까
			if(val.charAt(0)=='%'&&state) return;//퍼센트는 처음에 못눌림
			double trans=Double.parseDouble(input.getText())/100;
			String transinput=String.valueOf(trans);
			input.setText(transinput);				//여기서는 바뀐값을 보여줌
			allinput.setText(allinput.getText()+val);
			
		} else if(val.charAt(0)=='√'){//**숫자가 입력됐을때 다음에 루트가 입력됨
			char c=input.getText().charAt(input.getText().length()-1);
			if(Character.isDigit(c)) {
				rootflag=true;
				double front =Double.parseDouble(input.getText());
				rootfront=front*front;
			}
			
			input.setText(input.getText()+val);
			allinput.setText(allinput.getText()+val);//루트모양은 우선 보여주자 숫자가 눌리면 변환되게
			
		//1)√3 이런식으로 입력되면은 숫자가 입력될때 제곱근값이 되게 한다
		//2)3√3 이런식으로 입력되면 3을 먼저 루트안에 넣고 대기하고 있자	
			
			
			
		}else {
			operator(val);//5.=,연산자는 operator()메서드로 해결됨
		}
		
	}//actionPerformed end
	

	
	//여기서는 연산자가 메뉴값으로 변환됨
	public void operator(String val) {
		//연산자여러번 눌리는거 방지
		char opdetector=allinput.getText().charAt(allinput.getText().length()-1);
		if(opdetector=='+'||opdetector=='-'||opdetector=='*'||opdetector=='/')return;
		
		if(val.equals("=")) {
			result();
			return;
		}
		
		if(val.equals("+")) {
			op=1;
		} else if(val.equals("-")) {
			op=2;
		} else if(val.equals("*")) {
			op=3;
		} else if(val.equals("÷")) {
			op=4;
		} 
		
		allinput.setText(allinput.getText()+val);
		state=true;//다음에 숫자가 들어오겠지
		sum+=(new Double(input.getText())).doubleValue();//실수화함????
	
	
	}//operator end
	
	//=를 했을때 sum으로 다 들어감
	public void result() {
		double result=0;
		
		double in=(new Double(input.getText())).doubleValue();
		
		switch(op) {
			case 1: result=sum+in;break;
			case 2: result=sum-in;break;
			case 3: result=sum*in;break;
			case 4: result=sum/in;break;
			
		}
		
		input.setText(result+"");//지금까지 있었던거 다시 띄워줌
		allinput.setText(allinput.getText()+"="+result);
	
		
	}

	public static void main(String[] args) {
		new Calc_0410().setVisible(true);
	}

}
