package miniProj_0417.db.controller;

import miniProj_0417.db.resource.R;

public class ListController implements Controller,R {

	@Override
	public void service() {
		if(text.getText()!=null) {
			text.setText(null);
		}
		
		text.append("\n");
		text.append("\t-------------------------------------\n");
		
		text.append("\t   *고객번호: "+member.get(0)+"\n");
		text.append("\t   *고객명: "+member.get(1)+ "\n");
		text.append("\t   *일시: "+df3.format(now2)+ "\n");
		
		text.append("\t-------------------------------------\n");
		
		text.append("\n");
		text.append("\t-담당 디자이너 : "+designerstr[designers.getSelectedIndex()]+"\n");
		text.append("\t-메뉴: "+menustr[menus.getSelectedIndex()]+"\n");
		text.append("\t-서비스이용: "+servicestr[services.getSelectedIndex()]+"\n");
		text.append("\t-상품: "+itemstr[items.getSelectedIndex()]+"\n");
		text.append("\n");
		text.append("\t-------------------------------------\n");
		text.append("\n");
		text.append("\t  포인트 이용: -"+tf_usepoint.getText()+"\n");
		text.append("\n");
		
		text.append("\t  총금액 "+tf_pay.getText()+"\n");
		text.append("\t  예정 적립포인트 "+tf_point.getText()+"\n");
		text.append("\n");
		text.append("\t-------------------------------------\n");
		
		
		
		
	}

}
