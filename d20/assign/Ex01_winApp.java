package week4.assign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class MemBer{
	
	private String name;
	private String gender;
	private String phone;
	private String mail;
	
	//게터세터
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public String getmail() {return mail;}
	public void setmail(String mail) {this.mail = mail;}
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}

	
	public MemBer(String name, String gender,String mail, String phone) {
		this.name = name;
		this.gender=gender;
		this.phone = phone;
		this.mail = mail;
	}
}


public class MyFrame extends JFrame {
	
	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	
	Vector<MemBer> member; //여기에 실제정보저장
	
	private JTextField tx_name;
	private JTextField tx_mail;
	private JTextField tx_phone;

	private FileWriter fw;
	
	public MyFrame() {
		
		initialize();
	}

	private void initialize() {
		
		member=new Vector<MemBer>();
		
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
		scrollPane.setBounds(309, 88, 499, 233);
		frame.getContentPane().add(scrollPane);
		


		//버튼
		JPanel rPanel =new JPanel();
		ButtonGroup g = new ButtonGroup();
		frame.getContentPane().add(rPanel);

		JRadioButton rb_m = new JRadioButton("Male");
		rb_m.setFont(new Font("Consolas", Font.PLAIN, 13));
		frame.getContentPane().add(rb_m);
		rb_m.setBounds(130, 139, 62, 29);
		g.add(rb_m);
		JRadioButton rb_f = new JRadioButton("Female");
		rb_f.setFont(new Font("Consolas", Font.PLAIN, 13));
		frame.getContentPane().add(rb_f);
		
		rb_f.setBounds(201, 139, 85, 29);
		g.add(rb_f);
		rb_m.setSelected(true);
		
		//여기서 부터 라벨들하고 텍스트 필드들
		JLabel lbl_name = new JLabel("Name");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setFont(new Font("Consolas", Font.PLAIN, 13));
		lbl_name.setBounds(52, 179, 61, 37);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_phone = new JLabel("Phone");
		lbl_phone.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_phone.setFont(new Font("Consolas", Font.PLAIN, 13));
		lbl_phone.setBounds(32, 227, 79, 33);
		frame.getContentPane().add(lbl_phone);
		
		JLabel lbl_mail = new JLabel("Email");
		lbl_mail.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_mail.setFont(new Font("Consolas", Font.PLAIN, 13));
		lbl_mail.setBounds(28, 273, 61, 29);
		frame.getContentPane().add(lbl_mail);
		
		JLabel lbl_title = new JLabel("<Member List>");
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setFont(new Font("Consolas", Font.PLAIN, 25));
		lbl_title.setBounds(52, 52, 224, 45);
		frame.getContentPane().add(lbl_title);
		
		JLabel lbl_size = new JLabel("Total :  ");
		lbl_size.setFont(new Font("Consolas", Font.PLAIN, 13));
		lbl_size.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_size.setBounds(110, 103, 151, 29);
		frame.getContentPane().add(lbl_size);

		
		//
		tx_name = new JTextField();
		tx_name.setFont(new Font("굴림", Font.PLAIN, 12));
		tx_name.setBounds(130, 187, 146, 27);
		frame.getContentPane().add(tx_name);
		tx_name.setColumns(10);
		
		tx_mail = new JTextField();
		tx_mail.setFont(new Font("굴림", Font.PLAIN, 12));
		tx_mail.setColumns(10);
		tx_mail.setBounds(106, 275, 170, 27);
		frame.getContentPane().add(tx_mail);
		
		tx_phone = new JTextField();
		tx_phone.setFont(new Font("굴림", Font.PLAIN, 12));
		tx_phone.setColumns(10);
		tx_phone.setBounds(126, 233, 151, 27);
		frame.getContentPane().add(tx_phone);
		
		
		//버튼들. 이벤트 리스너들
		//추가버튼
		JButton btnNewButton_input = new JButton("add");
		btnNewButton_input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tx_name==null||tx_mail==null||tx_phone==null) {
					JOptionPane.showMessageDialog(frame, "입력되지 않은 부분이 있습니다");
					return;
				}
				
				//이름 성별 메일 폰번호
				String[] rows=new String[4];
				rows[0]=tx_name.getText();
				if(rb_m.isSelected())rows[1]="male";
				else rows[1]="female";
				rows[2]=tx_phone.getText();
				rows[3]=tx_mail.getText();
				model.addRow(rows);//보여지는 것에도
			
				tx_name.setText("");
				tx_mail.setText("");
				tx_phone.setText("");
				rb_m.setSelected(true);
				
				
				String name=rows[0];
				String gender=rows[1];
				String phone=rows[2];
				String mail=rows[3];
				member.add(new MemBer(name,gender,phone,mail));//벡터에도 저장되겠네~
				lbl_size.setText("total : "+member.size());
				
				JOptionPane.showMessageDialog(frame, "추가가 성공적으로 완료되었습니다");
				table.setModel(model);
			}
			
		});
		btnNewButton_input.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_input.setBounds(75, 324, 92, 29);
		frame.getContentPane().add(btnNewButton_input);
		
		
		
		//삭제버튼
		JButton btnNewButton_delete = new JButton("Delete");
		btnNewButton_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int rowIndex = table.getSelectedRow();//
				if(rowIndex == -1) return;
				model.removeRow(rowIndex);
				member.remove(rowIndex); //데이터 지우기
				lbl_size.setText("total : "+member.size()+" 명");
			}
		});
		btnNewButton_delete.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_delete.setBounds(667, 350, 92, 29);
		frame.getContentPane().add(btnNewButton_delete);
		
		
		//취소버튼
		JButton btnNewButton_cancel = new JButton("reset");
		btnNewButton_cancel.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tx_name.setText("");
				tx_mail.setText("");
				tx_phone.setText("");
				rb_m.isSelected();
			}
		});
		
		btnNewButton_cancel.setBounds(184, 324, 92, 29);
		frame.getContentPane().add(btnNewButton_cancel);
		
		JButton btnNewButton_modify = new JButton("Modify");
		btnNewButton_modify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int rowIndex = table.getSelectedRow();
			
				String name=tx_name.getText();
				String mail=tx_mail.getText();
				String phone=tx_phone.getText();
				String gender=null;
				if(rb_m.isSelected())gender="male";
				else gender="female";
				
				if(name.equals("")) {
					name = member.get(rowIndex).getName();
				}
				if(phone.equals("")) {
					phone = member.get(rowIndex).getPhone();
				}
				if(mail.equals("")) {
					mail = member.get(rowIndex).getmail();
				}
				member.set(rowIndex,new MemBer(name,gender,phone,mail));
				model.removeRow(rowIndex);
				String[] rows=new String[4];
				rows[0]=name;
				rows[1]=gender;
				rows[2]=phone;
				rows[3]=mail;
				
				model.insertRow(rowIndex, rows);
				
				JOptionPane.showMessageDialog(frame, "수정이 성공적으로 완료되었습니다");
				table.setModel(model);
			}
		});
		btnNewButton_modify.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_modify.setBounds(558, 350, 92, 29);
		frame.getContentPane().add(btnNewButton_modify);
		
		//전체보기. List버튼
		JButton btnNewButton_list = new JButton("List");
		btnNewButton_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(table.getModel()!=model)
			table.setModel(model);
			else return;
			}
		});
		
		btnNewButton_list.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_list.setBounds(341, 350, 92, 29);
		frame.getContentPane().add(btnNewButton_list);
		
		//검색된 것만 보기. Search 버튼
		JButton btnNewButton_search = new JButton("Search");
		btnNewButton_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = JOptionPane.showInputDialog(frame,"검색할 이름을 입력해주세요");
				
				DefaultTableModel tmp= new DefaultTableModel(colsNames,0);
				for(int i=0;i<member.size();i++) {
					if(member.get(i).getName().equals(name)) {
						String[] rows= new String[4];
						rows[0]=member.get(i).getName();
						rows[1]=member.get(i).getGender();
						rows[2]=member.get(i).getPhone();
						rows[3]=member.get(i).getEmail();
						
						tmp.addRow(rows);
					}
				}
				
				table.setModel(tmp);
				
			}
		});
		btnNewButton_search.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_search.setBounds(449, 350, 92, 29);
		frame.getContentPane().add(btnNewButton_search);
		
		//파일열기
		JButton btnNewButton_open = new JButton("Open");
		btnNewButton_open.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "파일에서 자료를 가져옵니다..");
				Scanner sc = null;
				try {
					sc = new Scanner(new FileReader("C:/JSP/list.txt"));
				} catch (FileNotFoundException e1) {
					System.out.println("파일이 없습니다!");
					return;
				}
				
				while(sc.hasNext()) {
					String line = sc.nextLine();
					String[] split = line.split(" ");
					String[] rows = new String[4];
					
					for(int i=0;i<4;i++) {
						rows[i]=split[i];
					}
					
					model.addRow(rows);
					member.add(new MemBer(split[0],split[1],split[2],split[3]));
					lbl_size.setText("total : "+member.size());
				}
						
			}
		});
		btnNewButton_open.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_open.setBounds(309, 44, 85, 29);
		frame.getContentPane().add(btnNewButton_open);
		
		//파일저장하기
		JButton btnNewButton_save = new JButton("Save");
		btnNewButton_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try {
					fw = new FileWriter("C:/JSP/list2.txt");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(frame, "경로가 잘못되었습니다...");
				}
				
				for(int i=0;i<member.size();i++) {
					String name=member.get(i).getName();
					String gender=member.get(i).getGender();
					String phone=member.get(i).getPhone();
					String mail=member.get(i).getmail();
					String line=name+" "+gender+" "+phone+" "+mail+"\n";
					System.out.println(line);
					try {
						fw.write(line,0,line.length());
												
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(frame, "저장이 완료되었습니다!");
			}
		});
		btnNewButton_save.setFont(new Font("궁서", Font.PLAIN, 12));
		btnNewButton_save.setBounds(411, 44, 85, 29);
		frame.getContentPane().add(btnNewButton_save);
		
		
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
