package week4.assign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class MemBer{
	
	private String name;
	private String gender;
	private String email;
	private String phone;
	
	public MemBer(String name, String gender,String email, String phone) {
		this.name = name;
		this.gender=gender;
		this.email = email;
		this.phone = phone;
	}
}


public class MyFrame extends JFrame {
	private String[] monsters= {"피카츄","파이리","꼬북이","이상해씨"};
	private ImageIcon[] imgMonsters= {
			new ImageIcon("./img/el/jpg"),
			new ImageIcon("./img/fi.jpg"),
			new ImageIcon("./img/wa.jpg"),
			new ImageIcon("./img/gr.jpg")
	};
	
	
	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	
	Vector<MemBer> member=new Vector<MemBer>(); 
	
	private JTextField tx_name;
	private JTextField tx_mail;
	private JTextField tx_phone;

	
	public MyFrame() {
		
		initialize();
	}

	private void initialize() {
		
		
		
		//큰 프레임
		frame = new JFrame();
		frame.setTitle("연락처");
		frame.setBounds(100, 100, 870, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
				
		//맨 위에 
		String[] colsNames = new String[] {"Name", "gender", "phone", "email"};
		//테이블에 넣으려면 디폴트테이블모델에 담아서 넣어야한다
		DefaultTableModel model = new DefaultTableModel(colsNames,0);//첫단의 줄 
		
		table=new JTable(model);
		
		//결과물이 나올 판넬
		scrollPane = new JScrollPane(table);//테이블은 스크롤팬에 담는다
		scrollPane.setBounds(309, 73, 499, 248);
		frame.getContentPane().add(scrollPane);
		


		//버튼
		JPanel rPanel =new JPanel();
		ButtonGroup g = new ButtonGroup();
		frame.getContentPane().add(rPanel);

		JRadioButton rb_m = new JRadioButton("남");
		rb_m.setFont(new Font("궁서", Font.PLAIN, 13));
		frame.getContentPane().add(rb_m);
		rb_m.setBounds(154, 139, 51, 29);
		g.add(rb_m);
		JRadioButton rb_f = new JRadioButton("여");
		rb_f.setFont(new Font("궁서", Font.PLAIN, 13));
		frame.getContentPane().add(rb_f);
		
		rb_f.setBounds(225, 139, 51, 29);
		g.add(rb_f);
		
		
		//여기서 부터 라벨들하고 텍스트 필드들
		JLabel lbl_name = new JLabel("이 름");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setFont(new Font("궁서", Font.BOLD, 13));
		lbl_name.setBounds(52, 179, 61, 37);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_phone = new JLabel("전 화 번 호");
		lbl_phone.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_phone.setFont(new Font("궁서", Font.BOLD, 13));
		lbl_phone.setBounds(32, 227, 79, 33);
		frame.getContentPane().add(lbl_phone);
		
		JLabel lbl_mail = new JLabel("이 메 일");
		lbl_mail.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_mail.setFont(new Font("궁서", Font.BOLD, 13));
		lbl_mail.setBounds(32, 283, 61, 29);
		frame.getContentPane().add(lbl_mail);
		
		JLabel lbl_title = new JLabel("<회원 명단>");
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setFont(new Font("궁서", Font.BOLD, 25));
		lbl_title.setBounds(95, 52, 181, 47);
		frame.getContentPane().add(lbl_title);
		
		JLabel lbl_size = new JLabel("총 : ");
		lbl_size.setFont(new Font("궁서", Font.PLAIN, 13));
		lbl_size.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_size.setBounds(110, 103, 151, 29);
		frame.getContentPane().add(lbl_size);

		
		//
		tx_name = new JTextField();
		tx_name.setBounds(125, 185, 151, 27);
		frame.getContentPane().add(tx_name);
		tx_name.setColumns(10);
		
		tx_mail = new JTextField();
		tx_mail.setColumns(10);
		tx_mail.setBounds(110, 285, 170, 29);
		frame.getContentPane().add(tx_mail);
		
		tx_phone = new JTextField();
		tx_phone.setColumns(10);
		tx_phone.setBounds(126, 233, 151, 27);
		frame.getContentPane().add(tx_phone);
		
		
		//버튼들. 이벤트 리스너들
		//추가버튼
		JButton btnNewButton_input = new JButton("추 가");
		btnNewButton_input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//이름 성별 메일 폰번호
				String[] rows=new String[4];
				rows[0]=tx_name.getText();
				if(rb_m.isSelected())rows[1]="male";
				else rows[1]="female";
				rows[2]=tx_phone.getText();
				rows[3]=tx_mail.getText();
				model.addRow(rows);//한줄씩 대입한다
			
				tx_name.setText("");
				tx_mail.setText("");
				tx_phone.setText("");
				rb_m.setSelected(true);
				
				
				String name=rows[0];
				String gender=rows[1];
				String phone=rows[2];
				String mail=rows[3];
				member.add(new MemBer(name,gender,phone,mail));//앱센스가 담기겠네~
				lbl_size.setText("total : "+member.size()+" 명");
				
				JOptionPane.showMessageDialog(frame, "추가가 성공적으로 완료되었습니다");
			}
			
		});
		btnNewButton_input.setFont(new Font("궁서", Font.PLAIN, 15));
		btnNewButton_input.setBounds(100, 350, 129, 29);
		frame.getContentPane().add(btnNewButton_input);
		
		
		//검색버튼
		JButton btnNewButton_search = new JButton("검 색");
		btnNewButton_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_search.setFont(new Font("궁서", Font.PLAIN, 15));
		btnNewButton_search.setBounds(536, 350, 129, 29);
		frame.getContentPane().add(btnNewButton_search);
		
		//삭제버튼
		JButton btnNewButton_delete = new JButton("삭 제");
		btnNewButton_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int rowIndex = table.getSelectedRow();//
				if(rowIndex == -1) return;
				model.removeRow(rowIndex);
				member.remove(rowIndex); //데이터 지우기
				lbl_size.setText("total : "+member.size()+" 명");
			}
		});
		btnNewButton_delete.setFont(new Font("궁서", Font.PLAIN, 15));
		btnNewButton_delete.setBounds(390, 350, 129, 29);
		frame.getContentPane().add(btnNewButton_delete);
		
		
		//취소버튼
		JButton btnNewButton_cancel = new JButton("취 소");
		btnNewButton_cancel.setFont(new Font("궁서", Font.PLAIN, 15));
		btnNewButton_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tx_name.setText("");
				tx_mail.setText("");
				tx_phone.setText("");
				rb_m.isSelected();
			}
		});
		
		btnNewButton_cancel.setBounds(679, 350, 129, 29);
		frame.getContentPane().add(btnNewButton_cancel);
		
		JButton btnNewButton_input_1 = new JButton("수 정");
		btnNewButton_input_1.setFont(new Font("궁서", Font.PLAIN, 15));
		btnNewButton_input_1.setBounds(244, 350, 129, 29);
		frame.getContentPane().add(btnNewButton_input_1);
		
		
		
		//콤보박스랑 이미지는 쌍
//		JComboBox comboBox = new JComboBox(monsters);
//		comboBox.setFont(new Font("궁서", Font.PLAIN, 12));
//		comboBox.setMaximumRowCount(4);
//		comboBox.setBounds(20, 131, 112, 27);
//		frame.getContentPane().add(comboBox);
//		//
//		JLabel imgLabel = new JLabel(imgMonsters[0]);
//		imgLabel.setBounds(20, 15, 112, 117);
//		frame.getContentPane().add(imgLabel);

				
	}
		
		
	public static void main(String[] args) {
		new MyFrame();
	}	
	
	
}
