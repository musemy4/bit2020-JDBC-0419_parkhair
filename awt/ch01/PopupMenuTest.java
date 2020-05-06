package io2.awt.ch01;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {

	public static void main(String[] args) {
		final Frame f = new Frame("popupMenuTest");
		f.setSize(300,200);
				
		final PopupMenu pMenu= new PopupMenu("Edit");
		MenuItem menu1 = new MenuItem("menu1"); 
		MenuItem menu2 = new MenuItem("menu2"); 
		MenuItem menu3 = new MenuItem("menu3"); 
		
		pMenu.add(menu1);
		pMenu.add(menu2);
		pMenu.add(menu3);
		f.add(pMenu);
		
		
		//마우스리스너
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				//if(e.getModifiers()==e.button)
			}
				
		});

		f.setVisible(true);
	
	}

}
