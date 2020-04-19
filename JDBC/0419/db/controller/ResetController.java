package miniProj_0417.db.controller;

public class ResetController implements Controller {

	@Override
	public void service() {
		
		inputView.designers.setSelectedIndex(0);
		inputView.menus.setSelectedIndex(0);
		inputView.services.setSelectedIndex(0);
		inputView.items.setSelectedIndex(0);
					
		tf_usepoint.setText("");
		tf_pay.setText("");
		tf_point.setText("");

		
	}

}
