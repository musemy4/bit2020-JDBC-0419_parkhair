package miniProj_0417.entrance.model;

import java.sql.*;
import java.util.Vector;

import miniProj_0417.Connection.Connect;
public class DAO {
	
	private Connection conn=null; 
	
	//싱글톤
	private DAO() {};
	
	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance==null) 
			instance=new DAO();
		
		return instance;
	}

	public String login(DTO dto) {
		
		conn=Connect.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from members where name=?";
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			rs=pstmt.executeQuery();
			
			
			while(rs.next()) {
				
				String phone=rs.getString("phone");
			
				if(phone.substring(9).equals(dto.getPhone())) {
					System.out.println("발견!"+phone.substring(9));
					String idx=rs.getString("idx");
					return idx;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		System.out.println("아이디와 패쓰워드가 맞지않다!");
		return null;
	}

	public Vector getadmins(String name) {
		Vector<Object> admins =new Vector<Object>();
		conn=Connect.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from admin where name=?";
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			
			
			while(rs.next()) {
				
				admins.add(rs.getString("name"));
				admins.add(rs.getString("pw"));
				System.out.println(rs.getString("name")+","+rs.getString("pw"));
				return admins;
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return null;
	}
		
		
		
		
}
