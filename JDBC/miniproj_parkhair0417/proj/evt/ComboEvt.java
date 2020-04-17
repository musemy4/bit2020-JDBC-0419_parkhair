package proj.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import proj.resourse.R;
import proj.view.InputView;




public class ComboEvt implements ActionListener,R {
	InputView target;
	

	public ComboEvt(InputView target) {
		this.target=target;
	}

	
	//¸Þ¼­µå
	int getDesignerPay() {
		int designerPay=0;
		int designer = inputView.designers.getSelectedIndex();
		
		if(designer==4||designer==3) {
			designerPay=50000;
		} else if(designer==2) {
			designerPay=30000;
		}
		
		return designerPay;
	}

	
	int getMenuPay() {
		int menuPay=0;
		int menu=inputView.menus.getSelectedIndex();
		
		if(menu==1) {
			menuPay=25000;
		} else if(menu==2) {
			menuPay=50000;
		} else if(menu==3) {
			menuPay=70000;
		}
				
		return menuPay;
	}
	
	
	int getServicePay() {
		int servicePay=0;
		int service=inputView.services.getSelectedIndex();
		
		if(service==1) {
			servicePay=30000;
		}else if(service==2) {
			servicePay=50000;
		}
		
		return servicePay;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JComboBox) {
			JComboBox box = (JComboBox) e.getSource();
			
			int pays=0;
			int designerPay=0;
			int menuPay=0;
			int servicePay=0;
			if(box==target.designers) {
				int designer=box.getSelectedIndex();
				if(designer==4||designer==3) {
					designerPay=50000;
				} else if(designer==2) {
					designerPay=30000;
				}
				
				menuPay=getMenuPay();
				servicePay=getServicePay();
				
			}	
			
			if(box==target.menus) {
				int menu=box.getSelectedIndex();
				if(menu==1) {
					menuPay=25000;
				} else if(menu==2) {
					menuPay=50000;
				} else if(menu==3) {
					menuPay=70000;
				}
				
				designerPay=getDesignerPay();
				servicePay=getServicePay();
				
				
			}
			
			if(box==target.services) {
			
				int service =box.getSelectedIndex(); 
				if(service==1) {
					servicePay=30000;
				}else if(service==2) {
					servicePay=50000;
				}
			
				menuPay=getMenuPay();
				designerPay=getDesignerPay();
				
			}
			
			pays=designerPay+menuPay+servicePay;
			String strPay =String.valueOf(pays);
			tf_pay.setText(strPay);
			tf_point.setText(String.valueOf(pays*0.1));
			
		
		}
		
	}

}
