package main.view;

import javax.swing.JPanel;

import main.resource.R;

public abstract class View extends JPanel implements R{
	abstract void display();
	abstract void evt();
}
