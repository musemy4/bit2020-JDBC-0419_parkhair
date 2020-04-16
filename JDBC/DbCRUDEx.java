package jdbc_test0416.db_select;


import java.sql.*;
import java.util.*;
import org.h2.command.Prepared;

import jdbc_test0416.util.DTO;
import jdbc_test0416.util.JdbcUtil;


//close랑 null이 다르다
//close했다고 null은 아니다


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
		System.out.print("수정할 번호를 입력해주세요 >>");
		int no=sc.nextInt();
		sc.nextLine();
		
		System.out.println("새로운 이름 번호 이메일을 입력하세요 ");
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
			
			
			if(rn>0)System.out.println("수정완료!");
			else System.out.println("수정실패!");
			
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
		System.out.print("삭제할 번호를 입력해주세요 >>");
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
			
			if(rn>0)System.out.println("삭제 완료!");
			else System.out.println("삭제 실패!");
			
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
		int rn;//처리한 개수
		String sql ="INSERT INTO MEMBERS (NAME,PHONE,EMAIL) VALUES(?,?,?)";
		
		try {
			
			//?에 정보를 때마다 다르게 하고 싶으면 pstmt를 사용한다
			pstmt=conn.prepareStatement(sql);
			System.out.println("회원정보를 입력하세요");
			System.out.print("이름 번호 이메일 순 >> ");
			String name=sc.next();
			String phone=sc.next();
			String email=sc.next();
			
			
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			
			rn=pstmt.executeUpdate();
			
			if(rn==1)System.out.println("회원정보 입력 성공!");//rn>0
			else System.out.println("회원정보 입력 실패!");
			
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
			//statement :서술한다
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
		
		System.out.println("===>>전체보기<<==================================");
		for(DTO v:list) {
			System.out.println(v);
		}
		System.out.println("===============================================");
	}
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.전체보기 2.입력 3.삭제 4.수정 5.그만");
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
