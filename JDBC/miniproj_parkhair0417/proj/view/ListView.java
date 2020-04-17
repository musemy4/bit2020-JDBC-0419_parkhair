package proj.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import proj.evt.ButtonEvt;
import proj.evt.MouseEvt;
public class ListView extends View {
	DefaultTableModel dm;
	JTable table;
	
	public ListView(DefaultTableModel dm) {
		this.dm=dm;
		display();
		evt();
	}
	
	@Override
	void display() {
		table = new JTable(dm);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}

	@Override
	void evt() {
		MouseEvt handler = new MouseEvt(this);
		table.addMouseListener(handler);
	
	}

}
