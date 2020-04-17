package proj.resourse;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import proj.controller.*;
import proj.model.DAO;
import proj.view.*;

public interface R {
	
	//listVeiw
	String[] colNames = new String[] {"today","idx","name","designer","pay"};
	DefaultTableModel dm = new DefaultTableModel(colNames,0);
	
	
	
	//inputview
	JTextField tf_name = new JTextField(15);
	JTextField tf_phone = new JTextField(15);
	JTextField tf_pay = new JTextField(15);
	JTextField tf_point = new JTextField(15);
	
	JRadioButton rb_m = new JRadioButton("Male");
	JRadioButton rb_f = new JRadioButton("Female");
	
	//����ǥ ���°�
	String[] designerselect = new String[] {"����","������","�����","����ī","����"};
	String[] menuselect = new String[] {"����","��Ʈ","����","��/����"};
	String[] serviceselect = new String[] {"����","ũ����","��彺��"};
	
	//����ǥ�ִ°�
	String[] designerstr = new String[] {"����","������","����� +3","����ī +5","���� +5"};
	String[] menustr = new String[] {"����","��Ʈ +2.5 ","���� +5","��/���� +7"};
	String[] servicestr = new String[] {"����","ũ���� +3","��彺�� +5"};
	
	
	//Controller
	ListController listController = new ListController();
	InputController inputController = new InputController();
	SearchController searchController = new SearchController();
	DeleteController deleteController = new DeleteController();
	ModifyController modifyController = new ModifyController();
	ResetController resetController = new ResetController();
	
	
	//view
	TitleView titleView = new TitleView();
	InputView inputView = new InputView();
	ButtonView buttonView = new ButtonView();
	ListView listView = new ListView(dm);
	
	DAO dao = DAO.getInstance();
	
	
	
	
}
