package java_mvc.resource;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java_mvc.controller.*;
import java_mvc.model.DAO;
import java_mvc.view.*;

public interface R {
	DefaultTableModel dm = new DefaultTableModel(10,4);
	Object[] colNames = {"번호","이름","번호","이메일"};
	ListView listView = new ListView(dm,colNames);
	
	JTextField idxF = new JTextField(15);
	JTextField nameF = new JTextField(15);
	JTextField phoneF = new JTextField(15);
	JTextField emailF = new JTextField(15);
	
	ListController listController = new ListController();
	InputController inputController = new InputController();
	SearchController searchController = new SearchController();
	DeleteController deleteController = new DeleteController();
	ModifyController modifyController = new ModifyController();
	
	DAO dao = new DAO();
}
