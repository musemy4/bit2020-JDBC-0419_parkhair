package io2.awt.ex4;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class GraphicsEx4 extends Frame implements MouseMotionListener{
	int x=0;
	int y=0;
	
	Image img= null;
	Graphics gImg=null;
	
	public GraphicsEx4(String title) {
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
		
		img=createImage(500,500);
		gImg=img.getGraphics();//Graphics 위에다가 그리는고야~
		gImg.drawString("왼쪽버튼을 누른채로 마우스를 움직여보세요", 10, 50);
		//repaint();
	}

	@Override
	public void paint(Graphics g) {
		if(img!=null)g.drawImage(img,0,0,this);
	}	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			x=e.getX();
			y=e.getY();
			gImg.drawString("*", x, y);
			repaint();
		}
		
	}
		
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	public static void main(String[] args) {
		new GraphicsEx4("Ex4");
	}



}
