package controller;

import model.DTO;

public class DeleteController implements Controller {

	@Override
	public void service() {
		String name=nameF.getText();
		String phone=phoneF.getText();
		String email=emailF.getText();
		int no = Integer.parseInt(noLabel.getText());
		
		DTO dto = new DTO(no,name,phone,email);
		dao.delete(dto);
	}

}
