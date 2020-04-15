package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import evt.MouseEvt;

public class ListView extends View {
	//IoC 디자인패턴 (제어의 역전) : 사용할 데이터를 외부에서 생성하고 객체로 입력
	DefaultTableModel model;
	JTable table;
	
	public void setTableModel(DefaultTableModel model) {
		this.model=model;
	}
		
	public ListView(DefaultTableModel model) {
		this.model=model;
		display();
		evt();
	}
	@Override
	void display() {
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane);
	}

	@Override
	void evt() {
		MouseEvt handler = new MouseEvt(this);
		table.addMouseListener(handler);
	}

}
