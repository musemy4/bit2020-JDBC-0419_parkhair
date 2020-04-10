package suwop.w4.d20.windowBuilder;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogEx extends JFrame{
	
	public DialogEx() {
		int res = JOptionPane.showOptionDialog(null,
				"원하는 작업을 선택하시오.", 
				"대화상자", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				new String[] {"가입하기","다시쓰기","취소"}, 
				"가입하기");
		
		System.out.println(res);
		
	}
	
	public void test() {
		//String inputMsg=JOptionPane.showInputDialog("아이디 입력: ");
		//JOptionPane.showMessageDialog(null, inputMsg+ "님의 일자리가 보장되었습니다!");
		
		int result = JOptionPane.showConfirmDialog(this, "작업을 종료하시겠습니까?");
		//예:0 아니오:1 취소:2
		
		if(result==0)System.out.println("예");
		else if(result==1)System.out.println("아니오");
		else System.out.println("취소");
	}
	public static void main(String[] args) {
		new DialogEx();
	}
		
		
}
