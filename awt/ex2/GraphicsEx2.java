package io2.awt.ex2;

import java.awt.*;
import java.awt.event.*;

public class GraphicsEx2 extends Frame implements MouseMotionListener{
	int x=0;
	int y=0;
	
	public static void main(String[] args) {
		new GraphicsEx2("GraphicEX2");
	}
	
	public GraphicsEx2(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
		 @Override
		 public void windowClosing(WindowEvent e) {
			 System.exit(0);
		 }
		});
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("마우스를 움직여보세요", 10, 50);
		g.drawString("*", x, y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {}
}
