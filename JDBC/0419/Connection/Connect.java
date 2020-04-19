package miniProj_0417.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static Connection getConnection() {
		
		try {
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공!");
			
			String url="jdbc:h2:tcp://localhost/~/test";
			String user="sa";
			String pwd="";
			
			Connection conn= DriverManager.getConnection(url,user,pwd);
			
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
}
