package proj.controller;

import proj.model.TodayDTO;

public class InputController implements Controller {

	@Override
	public void service() {
		String name = tf_name.getText();
		
		String designer = designerselect[inputView.designers.getSelectedIndex()];
		int pay=Integer.parseInt(tf_pay.getText());
	
		
		TodayDTO dto =new TodayDTO(name,designer,pay);
		
		dao.todayInsert(dto);
		
		resetController.service();
	}

}
