package miniProj_0417.db.controller;

import miniProj_0417.db.model.DTO;
import miniProj_0417.db.resource.R;

public class PayController implements Controller,R {

	@Override
	public void service() {
		String idx=(String) member.get(0);
		String name=(String) member.get(1);
		String date=df3.format(now2);
		String designer=designerselect[designers.getSelectedIndex()];
		String menu=menuselect[menus.getSelectedIndex()];
		String service=serviceselect[services.getSelectedIndex()];
		String item=itemselect[items.getSelectedIndex()];
		double usepoint=Double.parseDouble(tf_usepoint.getText());
		double totalpay=Double.parseDouble(tf_pay.getText());
		double willpoint=Double.parseDouble(tf_point.getText());
		
		
		DTO dto = new DTO(idx,name,date,designer,menu,service,item,usepoint,totalpay,willpoint);
		
		dao.pay(dto);
		dao.pointadd(dto);
	}

}
