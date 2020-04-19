package miniProj_0417.db.view;

import java.awt.*;
import javax.swing.*;

import miniProj_0417.db.resource.IdxSet;
import miniProj_0417.db.resource.R;

public class MainView extends JFrame implements R {
	JPanel content = null;

	
	//idx값으로 생성됨
	public MainView(String idx) {
		IdxSet.idxset=idx;
		
		SettinView settinView= new SettinView();
		
		content=(JPanel)getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		content.setLayout(null);
		
		add(listView);
		listView.setBounds(30, 100, 350, 500);
		
		
		
		add(titleView);
		titleView.setBounds(450, 35, 290, 65);
		
		add(settinView);
		settinView.setBounds(420, 100, 350, 90);
		settinView.setBackground(new Color(255, 255, 255));
		
		
		add(inputView);
		inputView.setBounds(420, 190, 350, 300);
		inputView.setBackground(new Color(255, 255, 255));
		
//		add(buttonView);
//		buttonView.setBounds(520, 470, 450, 100);
		
		
		
		setResizable(false);
		setSize(800, 600);
		}
	
	
}