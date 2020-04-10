package suwop.w4.d20.jtable;

import java.util.Vector;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class JTableExam extends JFrame {
	JPanel contentPane;
	JScrollPane infoScrollPane;
	JTable searchResultTable;
	DefaultTableModel tableModel;
	
	
	public JTableExam() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane=(JPanel)getContentPane();
		
		Object[][] data= {
				{"강지아","jeea@mem.com","1111","30"},
				{"이장미","rose@mem.com","2222","21"},
				{"김백합","lilly@mem.com","3333","35"}
		};
		
		
		
		String[] columns = {"성명","이메일","전화번호","나이"};
		tableModel = new DefaultTableModel(data,columns);
		searchResultTable = new JTable(tableModel);
		infoScrollPane = new JScrollPane(searchResultTable);
		
		tableModel.setRowCount(5);
		tableModel.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				System.out.println(e.getSource());
			}
		});
		
		
		add(infoScrollPane);
		
		setSize(640,480);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JTableExam();
	}

}
