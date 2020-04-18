package miniProj_0417.member.resource;

import java.awt.*;
import java.util.*;
import java.text.*;
import javax.swing.*;
import javax.swing.event.*;

public class SpinnerTest {
	public static void main(String[] args) {
		Date now = new Date();
		final SpinnerDateModel model = new SpinnerDateModel(now, null, now,Calendar.DAY_OF_WEEK);
		JSpinner spinner = new JSpinner(model);
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner,"yyyy-MM-dd");
		JFormattedTextField ftf = editor.getTextField();
		ftf.setEditable(false);
		ftf.setHorizontalAlignment(JTextField.CENTER);
		
		ftf.setBackground(new Color(255, 255, 255));
		spinner.setEditor(editor);
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Date value = (Date) model.getValue();
				Date next = (Date) model.getNextValue();
				if (value != null && next != null)
					System.out.println("value = " + df.format(value) + "\t"
							+ "next = " + df.format(next));
			}
		});
		JPanel panel = new JPanel();
		panel.add(spinner);
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(panel);
		f.setSize(250, 100);
		f.setLocation(200, 200);
		f.setVisible(true);
	}
}
