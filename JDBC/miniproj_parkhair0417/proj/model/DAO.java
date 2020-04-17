package proj.model;

import java.sql.*;
import java.util.Vector;

public class DAO {
	public static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("org.h2.Driver");
			System.out.println("����̹� �˻� ����!");
			
			String url="jdbc:h2:tcp://localhost/~/test";
			String user="sa";
			String pwd="";
			
			conn= DriverManager.getConnection(url,user,pwd);
			
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB Ŀ�ؼ� ����!");
			e.printStackTrace();
		}
		
		return null;
	}
	
	//�̱���
	private DAO() {}

	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance==null)
			instance=new DAO();
		return instance;
	}

	
	
	//DAO �޼����
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
			
			if(rn>0)System.out.println("ȸ���Է� �Ϸ�!");
			else System.out.println("ȸ���Է� ����...");
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
