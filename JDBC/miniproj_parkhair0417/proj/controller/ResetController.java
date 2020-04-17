package proj.controller;

public class ResetController implements Controller {

	@Override
	public void service() {
		
		rb_m.setSelected(true);
		
		tf_name.setText("");
		tf_phone.setText("");
		
		inputView.designers.setSelectedIndex(0);
		inputView.menus.setSelectedIndex(0);
		inputView.services.setSelectedIndex(0);
				
		tf_pay.setText("");
		tf_point.setText("");
		
		
		
		
	}

}
