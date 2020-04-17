package proj.view;

import javax.swing.JPanel;

import proj.resourse.R;

public abstract class View extends JPanel implements R{
	abstract void display();
	abstract void evt();
}
