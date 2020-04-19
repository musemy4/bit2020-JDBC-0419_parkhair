package miniProj_0417.admin.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SListView extends View {
	DefaultTableModel dm;
	JTable table;
	
	public SListView(DefaultTableModel sdm) {
		this.dm=sdm;
		display();
		evt();
	}

	@Override
	void display() {
		table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(500, 0, 400, 450);
		add(scrollPane);
	}

	@Override
	void evt() {
		// TODO Auto-generated method stub

	}

}
