package miniProj_0417.db.view;

import javax.swing.JPanel;

import miniProj_0417.db.resource.R;

public abstract class View extends JPanel implements R{
	abstract void display();
	abstract void evt();
}