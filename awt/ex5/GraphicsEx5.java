package io2.awt.ex5;

import java.awt.*;
import java.awt.event.*;
public class GraphicsEx5 extends Frame implements MouseMotionListener{
	int x=0;
	int y=0;
	
	Image img = null;
	Graphics gImg = null;
	
	public GraphicsEx5(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
		setVisible(true);
		setBounds(100,100,500,500);
		
		img=createImage(500,500);
		gImg=img.getGraphics();
		gImg.drawString("���� ��ư�� ���� ä�� ���콺�� ������������",10,50);
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		if(img!=null)g.drawImage(img,0,0,this);//������ �׷��� ������ graphic�� img�� �����ض�
	}
	
	
	public static void main(String[] args) {
		new GraphicsEx5("Ex5");
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getModifiersEx()!=MouseEvent.BUTTON1_DOWN_MASK)return;
		
		gImg.drawLine(x, y, e.getX(), e.getY());
		x=e.getX();
		y=e.getY();
		
		repaint();
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
	}

}
