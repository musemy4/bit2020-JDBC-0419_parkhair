package miniProj_0417.db.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeListener;

import miniProj_0417.db.resource.R;
import miniProj_0417.db.view.*;

public class PayEvt implements ActionListener,R {
	InputView target;
	

	public PayEvt(InputView target) {
		this.target=target;
	}

	
	//
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
	
	int getItemPay() {
		int itemPay=0;
		int item=inputView.services.getSelectedIndex();
		
		if(item==2) {
			itemPay=20000;
		}else if(item==3) {
			itemPay=40000;
		}else if(item==4) {
			itemPay=50000;
		}else if(item==5) {
			itemPay=300000;
		}
		
		return itemPay;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double pays=0;
		int designerPay=0;
		int menuPay=0;
		int servicePay=0;
		int itemPay=0;
				
		if(e.getSource() instanceof JComboBox) {
			JComboBox box = (JComboBox) e.getSource();
			
			if(box==target.designers) {
				int designer=box.getSelectedIndex();
				if(designer==4||designer==3) {
					designerPay=50000;
				} else if(designer==2) {
					designerPay=30000;
				}
				
				menuPay=getMenuPay();
				servicePay=getServicePay();
				itemPay=getItemPay();
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
				itemPay=getItemPay();
					
				
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
				itemPay=getItemPay();
				
			}
			
			
			if(box==target.items) {
			
				int item =box.getSelectedIndex(); 
				if(item==2) {
					itemPay=20000;
				}else if(item==3) {
					itemPay=40000;
				}else if(item==4) {
					itemPay=50000;
				}else if(item==5) {
					itemPay=300000;
				}
			
				designerPay=getDesignerPay();
				menuPay=getMenuPay();
				servicePay=getServicePay();	
			}
			
		
		}
		
		
		pays=designerPay+menuPay+servicePay+itemPay;
		String strPay =String.valueOf(pays);
		tf_pay.setText(strPay);
		
		//등급에 따라 다르게 적립됨
		if(member.get(7).equals("손님")) {
			tf_point.setText(String.valueOf(pays*0.05));
		} else if(member.get(7).equals("고객님")) {
			tf_point.setText(String.valueOf(pays*0.1));
		} else if(member.get(7).equals("붙박이님")) {
			tf_point.setText(String.valueOf(pays*0.15));
		}
		
	}

}
