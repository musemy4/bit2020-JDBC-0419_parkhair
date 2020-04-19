package miniProj_0417.admin.view;

import javax.swing.JPanel;

import miniProj_0417.admin.resource.R;


public abstract class View extends JPanel implements R{
	abstract void display();
	abstract void evt();
}