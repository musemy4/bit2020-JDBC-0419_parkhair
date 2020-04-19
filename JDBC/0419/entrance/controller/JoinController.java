package miniProj_0417.entrance.controller;

import miniProj_0417.entrance.view.WelcomeView;
import miniProj_0417.member.view.JoinView;

public class JoinController implements Controller {
	
	public JoinController() {}
	
	@Override
	public void service() {
		new JoinView().setVisible(true);
		//닫히게 하고싶음
	}

}
