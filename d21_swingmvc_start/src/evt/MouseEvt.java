package evt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;

import resource.R;
import view.ListView;

public class MouseEvt implements MouseListener,R{
	ListView target=null;
	
	public MouseEvt(ListView target) {
		this.target=target;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() instanceof JTable) {
			JTable table=(JTable)e.getSource();
			int row=table.getSelectedRow();
			int column=table.getSelectedColumn();
			
			nameF.setText(model.getValueAt(row, 1).toString());
			phoneF.setText(model.getValueAt(row, 2).toString());
			emailF.setText(model.getValueAt(row, 3).toString());
			noLabel.setText(model.getValueAt(row, 0).toString());
		
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("행선택했다!");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}
	
	
	
	
}
