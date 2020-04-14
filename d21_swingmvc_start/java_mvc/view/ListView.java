package java_mvc.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListView extends View {

	DefaultTableModel dm;
	
	public void setTableModel(DefaultTableModel dm) {
		this.dm=dm;
	}
	public ListView(DefaultTableModel dm, Object[] colNames) {
		this.dm=dm;
		dm.setColumnIdentifiers(colNames);
		display();
	}
	
	
	@Override
	public void display() {
		JTable table=new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}

	@Override
	public void evt() {
		// TODO Auto-generated method stub

	}

}
