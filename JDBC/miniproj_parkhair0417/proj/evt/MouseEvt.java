package proj.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import proj.resourse.R;
import proj.view.*;

public class MouseEvt implements MouseListener,R{
	ListView target;



	public MouseEvt(ListView target) {
		this.target=target;
	
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() instanceof JTable) {
			JTable table=(JTable)e.getSource();
			int row=table.getSelectedRow();
			int column=table.getSelectedColumn();
			
			
			
		}
	
	}
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	
	

}
