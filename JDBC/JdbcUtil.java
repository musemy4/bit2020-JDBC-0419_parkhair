package jdbc_test0416.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() {
		
		
		try {
			// 1.����̹� �ҷ�����
			Class.forName("org.h2.Driver");
			System.out.println("����̹� �˻� ����!");
		
			// 2.Ŀ�ؼ� ��ü ������ _����̹��� �ҷ����� ����̹��Ŵ����� ��������(url,user,pwd)
			String url="jdbc:h2:tcp://localhost/~/test";
			String user="sa";
			String pwd="";
			try {
				Connection conn = DriverManager.getConnection(url,user,pwd);
				System.out.println("conn => "+conn);
				
				return conn;
			} catch (SQLException e) {
				System.out.println("DBĿ�ؼ� ����!");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		}
		
		return null;
	}

	public static Connection getConnection(String url, String user, String pwd) {
		
		
		try {
			// 1.����̹� �ҷ�����
			Class.forName("org.h2.Driver");
			System.out.println("����̹� �˻� ����!");
		
			try {
				Connection conn = DriverManager.getConnection(url,user,pwd);
				System.out.println("conn => "+conn);
				
				return conn;
			} catch (SQLException e) {
				System.out.println("DBĿ�ؼ� ����!");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		}
		
		return null;
	}
}
