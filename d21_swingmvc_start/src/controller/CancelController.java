package controller;

public class CancelController implements Controller {

	@Override
	public void service() {
		nameF.setText("");
		phoneF.setText("");
		emailF.setText("");
		noLabel.setText("");
	}

}
