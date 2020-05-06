package io2.awt.ex3;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsEx3 extends Frame implements MouseMotionListener {
	int x=0;
	int y=0;
	
	public GraphicsEx3(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(100,100,500,500);
		setVisible(true);
		
	}
	@Override
	public void update(Graphics g) {
		paint(g);//누적되게하는 요인!~
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("마우스를 움직여보세요", 10, 50);
		g.drawString("*", x, y);
		repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
	}

	public static void main(String[] args) {
		new GraphicsEx3("Ex3");
	}

	@Override
	public void mouseDragged(MouseEvent e) {}
}
