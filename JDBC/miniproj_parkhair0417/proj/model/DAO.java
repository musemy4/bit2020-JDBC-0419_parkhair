package proj.model;

import java.sql.*;
import java.util.Vector;

public class DAO {
	public static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공!");
			
			String url="jdbc:h2:tcp://localhost/~/test";
			String user="sa";
			String pwd="";
			
			conn= DriverManager.getConnection(url,user,pwd);
			
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 커넥션 실패!");
			e.printStackTrace();
		}
		
		return null;
	}
	
	//싱글톤
	private DAO() {}

	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance==null)
			instance=new DAO();
		return instance;
	}

	
	
	//DAO 메서드들
	public void todayInsert(TodayDTO dto) {
		conn=getConnection();
		PreparedStatement pstmt = null;
		int rn;
		String sql="INSERT INTO TODAY (idx,name,designer,pay) values (?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIdx());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getDesigner());
			pstmt.setLong(4, dto.getPay());
			
			rn=pstmt.executeUpdate();
			
			if(rn>0)System.out.println("회원입력 완료!");
			else System.out.println("회원입력 실패...");
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
		
		todayList();
	}

	public Vector<Object> todayList() {
		Vector<Object> todays =new Vector<Object>(); 
		
		conn=getConnection();
		Statement stmt= null;
		ResultSet rs =null;
		String sql= "SELECT * FROM TODAY";
		
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				Vector<Object> dto = new Vector<>();
				dto.add(rs.getInt("today"));
				dto.add(rs.getString("idx"));
				dto.add(rs.getString("name"));
				dto.add(rs.getString("designer"));
				dto.add(rs.getInt("pay"));
				
				todays.add(dto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return todays;
	}

		
	
	
	
	
}
