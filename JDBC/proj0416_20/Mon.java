package reference;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class Mon {

	private JFrame frame;
	private JTextField tf_name;
	private JTextField tf_phone;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mon window = new Mon();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(245, 255, 250));
		frame.setBounds(100, 100, 774, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("::: ParkHAIR :::");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 30));
		lblNewLabel.setBounds(401, 35, 296, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(411, 93, 296, 399);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_name = new JLabel("\uACE0\uAC1D\uBA85:");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setBounds(12, 53, 89, 28);
		panel.add(lbl_name);
		
		JLabel lbl_phone = new JLabel("\uC804\uD654\uBC88\uD638 :");
		lbl_phone.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_phone.setBounds(12, 85, 89, 28);
		panel.add(lbl_phone);
		
		JLabel lbl_designer = new JLabel("\uB2F4\uB2F9\uB514\uC790\uC774\uB108:");
		lbl_designer.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_designer.setBounds(12, 143, 89, 28);
		panel.add(lbl_designer);
		
		tf_name = new JTextField();
		tf_name.setBounds(110, 57, 116, 21);
		panel.add(tf_name);
		tf_name.setColumns(10);
		
		tf_phone = new JTextField();
		tf_phone.setColumns(10);
		tf_phone.setBounds(110, 89, 116, 21);
		panel.add(tf_phone);
		
		JLabel lbl_designer_1 = new JLabel("\uD68C\uC6D0 \uC720\uBB34:");
		lbl_designer_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_designer_1.setBounds(12, 22, 89, 28);
		panel.add(lbl_designer_1);
		
		JRadioButton rb_new = new JRadioButton("new");
		rb_new.setBounds(110, 24, 56, 25);
		panel.add(rb_new);
		
		JRadioButton rb_new_1 = new JRadioButton("member");
		rb_new_1.setBounds(173, 24, 73, 25);
		panel.add(rb_new_1);
		
		JComboBox cb_hair = new JComboBox();
		cb_hair.setBounds(110, 183, 115, 24);
		panel.add(cb_hair);
		
		JLabel lbl_hair = new JLabel("\uC2DC\uC220\uBA85:");
		lbl_hair.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_hair.setBounds(12, 181, 89, 28);
		panel.add(lbl_hair);
		
		JList list = new JList();
		list.setBounds(113, 149, 116, 21);
		panel.add(list);
		
		JLabel lbl_hair_1 = new JLabel("\uC11C\uBE44\uC2A4:");
		lbl_hair_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_hair_1.setBounds(12, 219, 89, 28);
		panel.add(lbl_hair_1);
		
		JComboBox cb_hair_1 = new JComboBox();
		cb_hair_1.setBounds(110, 217, 115, 24);
		panel.add(cb_hair_1);
		
		JLabel lbl_pay = new JLabel("\uAE08\uC561 :");
		lbl_pay.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pay.setBounds(12, 272, 89, 28);
		panel.add(lbl_pay);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(110, 276, 116, 21);
		panel.add(textField);
		
		JLabel lbl_point = new JLabel("\uD3EC\uC778\uD2B8 :");
		lbl_point.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_point.setBounds(12, 307, 89, 28);
		panel.add(lbl_point);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 311, 116, 21);
		panel.add(textField_1);
		
		JButton btnInput = new JButton("\uC7A5\uBD80\uC785\uB825");
		btnInput.setBounds(76, 359, 81, 23);
		panel.add(btnInput);
		
		JButton btnReset = new JButton("\uC785\uB825\uCDE8\uC18C");
		btnReset.setBounds(163, 359, 81, 23);
		panel.add(btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 76, 348, 489);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 255, 250));
		panel_1.setBounds(403, 521, 316, 44);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnModify = new JButton("\uC218\uC815");
		btnModify.setBounds(170, 10, 67, 23);
		panel_1.add(btnModify);
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setBounds(239, 10, 67, 23);
		panel_1.add(btnDelete);
		
		JButton btnSearch = new JButton("\uAC1C\uC778\uC870\uD68C");
		btnSearch.setBounds(88, 10, 81, 23);
		panel_1.add(btnSearch);
		
		JButton btnlist = new JButton("\uC804\uCCB4\uC870\uD68C");
		btnlist.setBounds(6, 9, 81, 24);
		panel_1.add(btnlist);
	}
}
