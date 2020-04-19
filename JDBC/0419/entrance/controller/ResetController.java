package miniProj_0417.entrance.controller;

public class ResetController implements Controller {
	
	public ResetController() {}
	
	@Override
	public void service() {
		tf_name.setText("");
		tf_pw.setText("");
		
	}

}
