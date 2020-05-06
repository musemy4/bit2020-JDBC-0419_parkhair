package io2.awt.ch01;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.*;

public class FileDialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300,200);
		
		FileDialog fileOpen = new FileDialog(f,"파일열기",FileDialog.LOAD);
		
		f.setVisible(true);
		fileOpen.setDirectory("E://");////?******
		fileOpen.setVisible(true);
		
		
		
		//파일을 선택한다음 FileDialog의 열기버튼을 누르면, 
		System.out.println("경로: "+fileOpen.getDirectory()+"파일명: "+fileOpen.getFile());
	}

}
