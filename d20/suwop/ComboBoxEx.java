package suwop.w4.d20.windowBuilder;

import javax.swing.*;
import javax.swing.event.*;
public class ComboBoxEx extends JFrame implements ListSelectionListener {
	JList list;
	JTextField tf;
	
	
	
	public ComboBoxEx() {
		String[] str= {"���","���弭��","����","����","����","��ȭ"};
		list = new JList(str);
		
		add(new JLabel("��̸� �����ϼ���"),"North");
		add(list);
		
		tf=new JTextField();
		add(tf,"South");
		
		list.addListSelectionListener(this);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200,300);
		setVisible(true);
		
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object[] item;
		String total="";
		
		if(e.getSource() instanceof JList) {
			JList list = (JList)e.getSource();
			item=list.getSelectedValues();
			for(int i=0;i<item.length;i++) {
				total=total+item[i]+" ";
			}
			
			tf.setText(total + "���� ��!");
		}
	}
	
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}





}
