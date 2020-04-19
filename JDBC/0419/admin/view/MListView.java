package miniProj_0417.admin.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import miniProj_0417.admin.evt.MouseEvt;

public class MListView extends View {
	DefaultTableModel dm;
	JTable table;
	
	
	public MListView(DefaultTableModel dm) {
		this.dm=dm;
		display();
		evt();
	}
	
	@Override
	void display() {
		table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(30, 0, 400, 450);
		add(scrollPane);
		
	}

	@Override
	void evt() {
		MouseEvt handler = new MouseEvt(this);
		table.addMouseListener(handler);
	
	
	}

}
