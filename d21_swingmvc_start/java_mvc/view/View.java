package java_mvc.view;

import javax.swing.JPanel;
import java_mvc.resource.R;

public abstract class View extends JPanel implements R {
	public abstract void display();
	public abstract void evt();
}
