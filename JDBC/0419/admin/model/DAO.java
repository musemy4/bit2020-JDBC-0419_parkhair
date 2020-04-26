package miniProj_0417.admin.model;

import java.sql.*;
import java.util.Vector;

import javax.swing.JOptionPane;

import miniProj_0417.Connection.Connect;

public class DAO {
	//싱글톤
	private DAO() {}

	private static DAO instance;
	
	public static DAO getInstance() {
		if(instance==null)
			instance=new DAO();
		return instance;
	}
	
	
	private  Connection conn = null;
	
	
	public Vector<Object> memberlist() {
		Vector<Object> members=new Vector<Object>();
		
		conn=Connect.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		String sql="Select * from members";
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				Vector<Object> dto = new Vector<>();
				dto.add(rs.getString("idx"));
				dto.add(rs.getString("name"));
				dto.add(rs.getString("gender"));
				dto.add(rs.getString("phone"));
				dto.add(rs.getString("birth"));
				dto.add(rs.getInt("accumpoint"));
				dto.add(rs.getInt("point"));
				dto.add(rs.getString("membership"));
				dto.add(rs.getString("joindate"));
				
				members.add(dto);
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
		
		
		return members;
	}
	
	public Vector<Object> servicelist() {
		Vector<Object> services=new Vector<Object>();
		
		conn=Connect.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		String sql="Select * from services";
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				Vector<Object> dto = new Vector<>();
				dto.add(rs.getString("idx"));
				dto.add(rs.getString("name"));
				dto.add(rs.getString("date"));
				dto.add(rs.getString("designer"));
				dto.add(rs.getString("menu"));
				dto.add(rs.getString("service"));
				dto.add(rs.getString("item"));
				dto.add(rs.getInt("usepoint"));
				dto.add(rs.getInt("totalpay"));
				dto.add(rs.getInt("willpoint"));
				
				services.add(dto);
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
		
		
		return services;
	}	

	public Vector<Object> searchmem(DTO dto) {
		Vector<Object> members=new Vector<Object>();
		
		conn=Connect.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="Select * from members where name=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
				
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Vector<Object> d = new Vector<>();
				d.add(rs.getString("idx"));
				d.add(rs.getString("name"));
				d.add(rs.getString("gender"));
				d.add(rs.getString("phone"));
				d.add(rs.getString("birth"));
				d.add(rs.getInt("accumpoint"));
				d.add(rs.getInt("point"));
				d.add(rs.getString("membership"));
				d.add(rs.getString("joindate"));
				
				members.add(d);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			return members;
		}

	public Vector<Object> searchmemserv(DTO dto) {
		Vector<Object> members=new Vector<Object>();
		
		conn=Connect.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="search * from services where idx=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIdx());
				
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Vector<Object> d = new Vector<>();
				d.add(rs.getString("idx"));
				d.add(rs.getString("name"));
				d.add(rs.getString("date"));
				d.add(rs.getString("designer"));
				d.add(rs.getString("menu"));
				d.add(rs.getString("service"));
				d.add(rs.getString("item"));
				d.add(rs.getInt("usepoint"));
				d.add(rs.getInt("totalpay"));
				d.add(rs.getInt("willpoint"));
				members.add(d);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			return members;
	}
	
	
	public void delete(DTO dto) {
		conn=Connect.getConnection();
		PreparedStatement pstmt=null;
		int rn;
		String sql="delete from members where idx=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIdx());
				
			rn=pstmt.executeUpdate();
			
			if(rn>0)System.out.println("회원정보가 삭제되었습니다");
			else System.out.println("회원정보 삭제가 실패하였습니다");
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

	public void deletememserv(DTO dto) {
		Vector<Object> members=new Vector<Object>();
		
		conn=Connect.getConnection();
		PreparedStatement pstmt=null;
		int rn=0;
		String sql="delete from services where idx=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIdx());
				
			rn=pstmt.executeUpdate();
			
			if(rn>0)JOptionPane.showMessageDialog(null, "회원과 회원 서비스정보가 삭제되었습니다");
			else System.out.println("회원의 서비스삭제가 실패하였습니다!");
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
}
	

