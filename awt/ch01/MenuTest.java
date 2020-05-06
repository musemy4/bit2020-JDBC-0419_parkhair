package io2.awt.ch01;

import java.awt.*;
public class MenuTest {

	public static void main(String[] args) {
		Frame f= new Frame("Frame with Menu");
		f.setSize(300,200);
		
		MenuBar mb = new MenuBar();
		Menu FileA= new Menu("서랍A");
		Menu FileB= new Menu("서랍B");
		Menu FileC= new Menu("서랍C");
		Menu FileD= new Menu("서랍D");
		
		mb.add(FileA);
		mb.add(FileB);
		mb.add(FileC);
		mb.add(FileD);
		
		//mFile안에
		MenuItem a1 = new MenuItem("a1");
		MenuItem a2 = new MenuItem("a2");
		MenuItem a3 = new MenuItem("a3");
		Menu a4 = new Menu("a4");
		
		FileA.add(a1);
		FileA.add(a2);
		FileA.add(a3);
		FileA.addSeparator();
		FileA.add(a4);
		
		MenuItem aa1 = new MenuItem("aa1");
		MenuItem aa2 = new MenuItem("aa2");
		a4.add(aa1);
		a4.add(aa2);
		
		
		f.setMenuBar(mb);//맨마지막에 붙음
		f.setVisible(true);
		
		
		
	}

}
