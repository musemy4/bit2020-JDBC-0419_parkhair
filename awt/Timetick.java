package io2.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timetick implements Runnable{
	Date today;
	SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss aa");
	
	@Override
	public void run() {
		ClockBar bar = new ClockBar();
		while (true) {
			today=new Date();
			String result = df.format(today);
			System.out.println(result);
			bar.setTitle(result);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {} 
		}
	
	
	}
	
	public static void main(String[] args) {
		Runnable t = new Timetick();
		Thread ticks = new Thread(t);
		ticks.start();
	}
}


class ClockBar extends Frame {
	
	public ClockBar() {
	
		//´Ý±â±â´É
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
	
		setVisible(true);
		setSize(300,0);
		setResizable(false);
	}
	
}
