package controller;

import java.util.Vector;

import model.DTO;

public class SearchController implements Controller {

	@Override
	public void service() {
		String name=nameF.getText();
		String phone=phoneF.getText();
		String email=emailF.getText();
		
		DTO dto = new DTO(0,name,phone,email);
		Vector<Vector> selects=dao.select(dto);
		
		Vector v=new Vector<>();
		v.add(colNames[0]);
		v.add(colNames[1]);
		v.add(colNames[2]);
		v.add(colNames[3]);
		
		model.setDataVector(selects,v);
	}

}
