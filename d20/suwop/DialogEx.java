package suwop.w4.d20.windowBuilder;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogEx extends JFrame{
	
	public DialogEx() {
		int res = JOptionPane.showOptionDialog(null,
				"���ϴ� �۾��� �����Ͻÿ�.", 
				"��ȭ����", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				new String[] {"�����ϱ�","�ٽþ���","���"}, 
				"�����ϱ�");
		
		System.out.println(res);
		
	}
	
	public void test() {
		//String inputMsg=JOptionPane.showInputDialog("���̵� �Է�: ");
		//JOptionPane.showMessageDialog(null, inputMsg+ "���� ���ڸ��� ����Ǿ����ϴ�!");
		
		int result = JOptionPane.showConfirmDialog(this, "�۾��� �����Ͻðڽ��ϱ�?");
		//��:0 �ƴϿ�:1 ���:2
		
		if(result==0)System.out.println("��");
		else if(result==1)System.out.println("�ƴϿ�");
		else System.out.println("���");
	}
	public static void main(String[] args) {
		new DialogEx();
	}
		
		
}
