package miniProj_0417.admin.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import miniProj_0417.admin.resource.R;

public class AdminMemberView extends JFrame implements R{
	JPanel content = null;
	public AdminMemberView() {
		content=(JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		content.setLayout(null);
		
		content.add(titleView);
		titleView.setBounds(370,35,290,65);
		
		JPanel listPane = new JPanel();
		listPane.setBounds(0, 110, 1000, 600);
		listPane.setLayout(null);
		
		listPane.add(mlistView);
		mlistView.setBounds(0, 0, 500, 450);
		
		listPane.add(slistView);
		slistView.setBounds(490, 0, 500, 450);
		
		
		
		listPane.add(buttonView);
		buttonView.setBounds(0, 450, 1000, 50);
		
		content.add(listPane);
		
		
		setSize(1000,650);
		setResizable(false);
	}


}
