package miniProj_0417.entrance.view;

import javax.swing.JPanel;

import miniProj_0417.entrance.resource.R;


public abstract class View extends JPanel implements R{
	abstract void display();
	abstract void evt();
}