package java_mvc.controller;

import java_mvc.model.DTO;

public class InputController implements Controller {

	public InputController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void service() {
		String name = nameF.getText();
		String phone=phoneF.getText();
		String email=emailF.getText();
		DTO dto = new DTO(0,name,phone,email);
		dao.insert(dto);
	}

}
