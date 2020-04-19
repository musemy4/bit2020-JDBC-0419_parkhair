package miniProj_0417.admin.evt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;

import miniProj_0417.admin.resource.R;
import miniProj_0417.admin.view.MListView;

public class MouseEvt implements MouseListener,R {
	MListView target;
	
	
	public MouseEvt(MListView target) {
		this.target=target;
		
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() instanceof JTable) {
			JTable table=(JTable)e.getSource();
			int row=table.getSelectedRow();
			int column=table.getSelectedColumn();
			
			
			
		}
	}

}
