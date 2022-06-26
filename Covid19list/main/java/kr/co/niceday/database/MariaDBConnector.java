package kr.co.niceday.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDBConnector {
	private static Connection conn;
	public static Connection getConnection() {    
		try{
			String driver = "org.mariadb.jdbc.Driver";
			String jdbc_url = "jdbc:mariadb://sc1.swu.ac.kr:13306/ay0518_ts";
	        String id = "ay0518";
	        String pw = "ay051822";
	        
	        Class.forName(driver);
			conn = DriverManager.getConnection(jdbc_url, id, pw);

		}catch(Exception e){
			e.printStackTrace();
			System.out.println("==========================================");
			// 에러가 발생할경우 Log파일에 쓴다.
		}
		return conn;
	}
}
