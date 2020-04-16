package jdbc_test0416.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() {
		
		
		try {
			// 1.드라이버 불러오기
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공!");
		
			// 2.커넥션 객체 얻어오기 _드라이버를 불러오면 드라이버매니저를 쓸수있음(url,user,pwd)
			String url="jdbc:h2:tcp://localhost/~/test";
			String user="sa";
			String pwd="";
			try {
				Connection conn = DriverManager.getConnection(url,user,pwd);
				System.out.println("conn => "+conn);
				
				return conn;
			} catch (SQLException e) {
				System.out.println("DB커넥션 실패!");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		}
		
		return null;
	}

	public static Connection getConnection(String url, String user, String pwd) {
		
		
		try {
			// 1.드라이버 불러오기
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공!");
		
			try {
				Connection conn = DriverManager.getConnection(url,user,pwd);
				System.out.println("conn => "+conn);
				
				return conn;
			} catch (SQLException e) {
				System.out.println("DB커넥션 실패!");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		}
		
		return null;
	}
}
