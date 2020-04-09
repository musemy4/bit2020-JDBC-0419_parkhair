package suwop.w4.d18.swing$;

import java.awt.*;
import java.awt.event.*;

class ButtonHandlerr implements ActionListener{
	Calc0 window;
	
	public ButtonHandlerr(Calc0 window) {
		this.window=window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof Button) {
			Button btn=(Button)e.getSource();
			window.output.setText(btn.getLabel());
		}
	}


}

public class Calc0 extends MyFrame {

	Button mc = new Button("MC");
	Button mr = new Button("MR");
	Button ms = new Button("MS");
	Button mp = new Button("M+");
	Button mm = new Button("M-");
	Button delete = new Button("¡ç");
	Button ce = new Button("CE");
	Button c = new Button("C");
	Button pm = new Button("¡¾");
	Button root = new Button("¡î");
	
	
	
	
	Button n1 = new Button("1");
	Button n2 = new Button("2");
	Button n3 = new Button("3");
	Button n4 = new Button("4");
	Button n5 = new Button("5");
	Button n6 = new Button("6");
	Button n7 = new Button("7");
	Button n8 = new Button("8");
	Button n9 = new Button("9");
	Button n0 = new Button("0");
	
	Button ndot = new Button(".");
	Button nslash = new Button("/");
	Button nper = new Button("%");
	Button nstar = new Button("*");
	Button nmi = new Button("-");
	Button npl = new Button("+");
	Button nrev	= new Button("1/x");
	Button eq	= new Button("=");
	
	
	
	
	Label output = new Label("0"); 
	//center
	Panel outputpanel = new Panel(new GridLayout(1,1,0,5));
	//north
	Panel cnt5_5panel = new Panel(new GridLayout(5,5,10,10));
	Panel cnt1_5panel = new Panel(new GridLayout(1,5,10,10));
	
	//»ý¼ºÀÚ
	public Calc0(String title,int width,int height) {
		super(title,width,height);
		
		
		outputpanel.add(output);
		this.add("North",outputpanel);
		cnt5_5panel.add(mc);
		cnt5_5panel.add(mr);
		cnt5_5panel.add(ms);
		cnt5_5panel.add(mp);
		cnt5_5panel.add(mm);
		cnt5_5panel.add(delete);
		cnt5_5panel.add(ce);
		cnt5_5panel.add(c);
		cnt5_5panel.add(pm);
		cnt5_5panel.add(root);
		cnt5_5panel.add(n7);
		cnt5_5panel.add(n8);
		cnt5_5panel.add(n9);
		cnt5_5panel.add(nslash);
		cnt5_5panel.add(nper);
		cnt5_5panel.add(n4);
		cnt5_5panel.add(n5);
		cnt5_5panel.add(n6);
		cnt5_5panel.add(nstar);
		cnt5_5panel.add(nrev);
		cnt5_5panel.add(n1);
		cnt5_5panel.add(n2);
		cnt5_5panel.add(n3);
		cnt5_5panel.add(nmi);
		cnt5_5panel.add(eq);
		this.add("Center",cnt5_5panel);
		
		cnt1_5panel.add(n0);
		cnt1_5panel.add(n0);
		cnt1_5panel.add(ndot);
		cnt1_5panel.add(npl);
		cnt1_5panel.add(eq);
		this.add("South",cnt1_5panel);
			
			
		
		
		
	}
		
	
	public static void main(String[] args) {
		
		new Calc0("calc",200,400).setVisible(true);
	
	}
	
}
