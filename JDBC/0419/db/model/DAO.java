package miniProj_0417.db.model;

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

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
	

	public Vector getInfo(String idx) {
				
		conn=getConnection();
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="select * from members where idx=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, idx);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Vector member = new Vector<>();
				member.add(rs.getString("idx"));
				member.add(rs.getString("name"));
				member.add(rs.getString("gender"));
				member.add(rs.getString("phone"));
				member.add(rs.getString("birth"));
				member.add(rs.getString("accumpoint"));
				member.add(rs.getString("point"));
				member.add(rs.getString("membership"));
				member.add(rs.getString("joindate"));
						
				
				return member;
			}
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
	
		return null;
	}

	public void pay(DTO dto) {
		conn=getConnection();
		PreparedStatement pstmt =null;
		int rn;
		String sql="insert into services values (?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIdx());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getDate());
			pstmt.setString(4, dto.getDesigner());
			pstmt.setString(5, dto.getMenu());
			pstmt.setString(6, dto.getService());
			pstmt.setString(7, dto.getItem());
			pstmt.setDouble(8, dto.getUsepoint());
			pstmt.setDouble(9, dto.getTotalpay());
			pstmt.setDouble(10, dto.getWillpoint());
			
			rn=pstmt.executeUpdate();
			
			if(rn>0)JOptionPane.showMessageDialog(null, "결제되었습니다.");

			else System.out.println("결제실패!");
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
		
		
	}

	public void pointadd(DTO dto) {
		conn=getConnection();
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="select * from members where idx=?";
		int exaccumpoint=0;
		int expoint=0;
		String membership=null;
		//1고객번호로 멤버정보조회=>2에서 포인트적립과 멤버십업뎃을 위한
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIdx());
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				exaccumpoint=rs.getInt("accumpoint");
				expoint=rs.getInt("point");
				membership=rs.getString("membership");
				System.out.println(exaccumpoint+", "+ expoint+", "+membership);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	
		
		int rn;
		sql="update members set accumpoint=?, point=?, membership=? where idx=?";
		
		double willpoint=dto.getWillpoint();
		
		int accumpoint=(int) (exaccumpoint+willpoint);
			
		int point=(int)(expoint+willpoint-dto.getUsepoint());
		
		//2
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, accumpoint);
			pstmt.setInt(2, point);
			if(accumpoint<10000) {
				pstmt.setString(3, "손님");
			} else if(accumpoint<30000) {
				pstmt.setString(3, "고객님");
			}else {
				pstmt.setString(3, "붙박이님");
			}
			pstmt.setString(4, dto.getIdx());
			
			rn=pstmt.executeUpdate();
			
			if(rn>0)System.out.println("포인트, 멤버십 수정완료!");
			else System.out.println("포인트수정실패!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

		
	
	
	
	
}
