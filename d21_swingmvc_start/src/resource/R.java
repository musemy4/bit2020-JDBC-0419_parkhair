package resource;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.*;
import model.DAO;
import view.ListView;

public interface R {
	String[] colNames = new String[] {"NO","Name","phone","email"};
	DefaultTableModel model = new DefaultTableModel(colNames,0);
	
	JTextField nameF = new JTextField(15);
	JTextField phoneF = new JTextField(15);
	JTextField emailF = new JTextField(15);
	JLabel noLabel = new JLabel();
	
	ListView listView = new ListView(model);
	
	ListController listController = new ListController();
	InputController inputController = new InputController();
	SearchController searchController = new SearchController();
	DeleteController deleteController = new DeleteController();
	ModifyController modifyController = new ModifyController();
	CancelController cancelController = new CancelController();
	
	DAO dao=DAO.getInstance();
	
	
}
