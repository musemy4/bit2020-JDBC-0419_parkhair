package swingMvc_h2.proj0416_20.resource;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import swingMvc_h2.proj0416_20.view.*;

public interface R {
	
	String[] colNames=new String[] {};
	DefaultTableModel dm = new DefaultTableModel(colNames,0);
	
	JTextField tf_name = new JTextField();
	JTextField tf_phone = new JTextField();
	JTextField tf_pay = new JTextField();
	JTextField tf_point = new JTextField();
	
	TitleView titleView =new TitleView();
	InputView inputView =new InputView();
	ButtonView buttonView =new ButtonView();
	ListView listView =new ListView(dm);
	
	
	
}
