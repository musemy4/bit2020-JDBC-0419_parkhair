package io2.awt.ch01;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// ����, ������
public class Ex13_7 extends Frame implements MouseListener{
	final int LINE_NUM = 9;//���� 9��
	final int LINE_WIDTH=30;
	final int BOARD_SIZE=LINE_WIDTH*(LINE_NUM-1);
	final int STONE_SIZE=(int)(LINE_WIDTH*0.9);
	
	final int x0;
	final int y0;
	
	final int FRAME_WIDTH;
	final int FRAME_HEIGHT;
	
	Image img=null;
	Graphics gImg=null;
	
	public Ex13_7(String title) {
		super(title);
		
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);

		//frame�� ũ��
		Insets insets = getInsets();//���̱��������� �𸥴�. �μ��̹���
		this.FRAME_WIDTH = BOARD_SIZE+LINE_WIDTH*2+insets.left+insets.right;
		this.FRAME_HEIGHT = BOARD_SIZE+LINE_WIDTH*2+insets.top+insets.bottom;
		this.x0=insets.left+LINE_WIDTH;
		this.y0=insets.top+LINE_WIDTH;
	
		setBounds(100,100,FRAME_WIDTH,FRAME_HEIGHT);
	
		img=createImage(FRAME_WIDTH,FRAME_HEIGHT);
		gImg=img.getGraphics();
		
		setResizable(false);
		
		drawBoard(gImg);
		
	}//������end 
	
	private void drawBoard(Graphics g) {
		for(int i=0;i<LINE_NUM;i++) {
			g.drawLine(x0, y0+i*LINE_WIDTH, x0+BOARD_SIZE, y0+i*LINE_WIDTH);
			g.drawLine(x0+i*LINE_WIDTH, y0, x0+i*LINE_WIDTH, y0+BOARD_SIZE);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if(img==null)return;
		//�׸��� ������
		g.drawImage(img,0,0,this);
		
	}

	
	@Override
	public void mousePressed(MouseEvent e) {
		int x= e.getX();
		int y= e.getY();
		if(x<x0||x>x0+BOARD_SIZE||y<y0||y>y0+BOARD_SIZE) {
			return;
		}
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			//System.out.println("����Ŭ��");
		}
		
		if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			//System.out.println("������Ŭ��");

		}
		repaint();
	}
	
	
	
	public static void main(String[] args) {
		new Ex13_7("OmokTest");
	}


	
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}



}
