package miniProj_0417.member.model;

import java.sql.*;
import java.util.Vector;

import miniProj_0417.Connection.Connect;
import miniProj_0417.entrance.model.DTO;
public class DAO {
	//싱글톤
	private DAO(){};
	
	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance==null)
			instance=new DAO();
		return instance;
	}

	private Connection conn =null;
	
	
	public int getMemberSize() {
		Vector<Object> size =new Vector<Object>(); 
		conn=Connect.getConnection();
		Statement stmt = null;
		ResultSet rs =null;
		String sql = "SELECT * FROM MEMBERS";
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				size.add(rs);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
		return size.size();
	}

	
	public void joinMember(MemberDTO dto) {
		conn=Connect.getConnection();
		PreparedStatement pstmt = null;
		int rn;
		String sql ="INSERT INTO MEMBERS (IDX,NAME,GENDER,PHONE,BIRTH,ACCUMPOINT, POINT,MEMBERSHIP,JOINDATE)"
				+ "VALUES(?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIdx());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getGender());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getBirth());
			pstmt.setInt(6, dto.getAccumPoint());
			pstmt.setInt(7, dto.getPoint());
			pstmt.setString(8, dto.getMembership());
			pstmt.setString(9, dto.getJoinDate());
			
			rn=pstmt.executeUpdate();
			
			if(rn>0)System.out.println("회원입력완료!");
			else System.out.println("회원입력실패..");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	}



	
	
	
	
	
}
