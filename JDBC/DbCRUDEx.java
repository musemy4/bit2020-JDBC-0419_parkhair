package jdbc_test0416.db_select;


import java.sql.*;
import java.util.*;
import org.h2.command.Prepared;

import jdbc_test0416.util.DTO;
import jdbc_test0416.util.JdbcUtil;


//close�� null�� �ٸ���
//close�ߴٰ� null�� �ƴϴ�


public class DbCRUDEx {
	static Scanner sc= new Scanner(System.in);
	static Connection conn;

	public static Connection getCon() {
		conn=JdbcUtil.getConnection();
		
		return conn;
	}
	
	//////////////////////////////////////////////////////////////
	
	public static void modify() {
		selectAll();
		System.out.print("������ ��ȣ�� �Է����ּ��� >>");
		int no=sc.nextInt();
		sc.nextLine();
		
		System.out.println("���ο� �̸� ��ȣ �̸����� �Է��ϼ��� ");
		System.out.print(">> ");
		String name=sc.next();
		String phone=sc.next();
		String email=sc.next();
		
		conn=getCon();
		
		PreparedStatement pstmt = null;
		int rn;
		String sql;
		{
			sql="update members set name=?,phone=?, email=?"
					+"where no=?";
		}
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			pstmt.setInt(4, no);
			
			rn=pstmt.executeUpdate();
			
			
			if(rn>0)System.out.println("�����Ϸ�!");
			else System.out.println("��������!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		selectAll();
	}
	
	
	public static void delete() {
		selectAll();
		System.out.print("������ ��ȣ�� �Է����ּ��� >>");
		int no=sc.nextInt();
		sc.nextLine();
		
		conn=getCon();
		PreparedStatement pstmt = null;
		int rn;
		
		String sql="delete from members where no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			rn=pstmt.executeUpdate();
			System.out.println(rn);
			
			if(rn>0)System.out.println("���� �Ϸ�!");
			else System.out.println("���� ����!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		selectAll();
	}
	
	
	
	public static void input() {
		conn=getCon();
		PreparedStatement pstmt = null;
		int rn;//ó���� ����
		String sql ="INSERT INTO MEMBERS (NAME,PHONE,EMAIL) VALUES(?,?,?)";
		
		try {
			
			//?�� ������ ������ �ٸ��� �ϰ� ������ pstmt�� ����Ѵ�
			pstmt=conn.prepareStatement(sql);
			System.out.println("ȸ�������� �Է��ϼ���");
			System.out.print("�̸� ��ȣ �̸��� �� >> ");
			String name=sc.next();
			String phone=sc.next();
			String email=sc.next();
			
			
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			
			rn=pstmt.executeUpdate();
			
			if(rn==1)System.out.println("ȸ������ �Է� ����!");//rn>0
			else System.out.println("ȸ������ �Է� ����!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		selectAll();
		
		}
	
	
	
	
	public static void selectAll() {
		ArrayList<DTO> list = new ArrayList<DTO>();
		conn=getCon();
		Statement stmt=null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBERS";
		
		try {
			//statement :�����Ѵ�
			stmt = conn.createStatement();
			rs =stmt.executeQuery(sql);
			
			while(rs.next()) {
				int no=rs.getInt("no");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				
				DTO dto = new DTO(no,name,phone,email);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===>>��ü����<<==================================");
		for(DTO v:list) {
			System.out.println(v);
		}
		System.out.println("===============================================");
	}
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1.��ü���� 2.�Է� 3.���� 4.���� 5.�׸�");
			System.out.print(">> ");
			int no = sc.nextInt();
			if(no==1) {
				selectAll();
			}else if(no==2) {
				input();
			}else if(no==3) {
				delete();
			}else if(no==4) {
				modify();
			}else {
				System.out.println("bye-bye!");
				System.exit(0);
			}
			
			
			
		}
	}
	
	
}
