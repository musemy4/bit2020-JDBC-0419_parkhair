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
	
	//가격표 없는거
	String[] designerselect = new String[] {"선택","가위손","울버린","제시카","원장"};
	String[] menuselect = new String[] {"선택","컷트","염색","펌/매직"};
	String[] serviceselect = new String[] {"안함","크리닉","헤드스파"};
	
	//가격표있는거
	String[] designerstr = new String[] {"선택","가위손","울버린 +3","제시카 +5","원장 +5"};
	String[] menustr = new String[] {"선택","컷트 +2.5 ","염색 +5","펌/매직 +7"};
	String[] servicestr = new String[] {"안함","크리닉 +3","헤드스파 +5"};
	
	
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
