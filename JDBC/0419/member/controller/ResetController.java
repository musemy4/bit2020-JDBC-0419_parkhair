package miniProj_0417.member.controller;

public class ResetController implements Controller {

	@Override
	public void service() {
		tf_name.setText("");
		tf_phone.setText("");
		rb_m.setSelected(true);
		
		//스피너도 원상태로
	}

}
