package io2.awt.ch01;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.*;

public class FileDialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300,200);
		
		FileDialog fileOpen = new FileDialog(f,"���Ͽ���",FileDialog.LOAD);
		
		f.setVisible(true);
		fileOpen.setDirectory("E://");////?******
		fileOpen.setVisible(true);
		
		
		
		//������ �����Ѵ��� FileDialog�� �����ư�� ������, 
		System.out.println("���: "+fileOpen.getDirectory()+"���ϸ�: "+fileOpen.getFile());
	}

}
