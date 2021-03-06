package com.callor.school.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * DB  와 연결 하는 Connection 객체 생성
 * DB 와 연결할때는 내부에서 통신 총로가 생성된다
 * 만약 통신 통로가 여러개 만들어진다면 관리하기도 어렵고
 * 		컴퓨터나 운영체제에 많은 부담이 될것이다
 * 
 * 한개의 통로만 만들고 필요할 필요할때 그 통로를 통새서 통신을 하도록
 * 한다면 컴퓨터나 운영체제에 부담이 줄어들 것이다
 * 
 *  Connection  객체를 한개만 생성하고
 *  필요할때 가져다 쓸수 있도록 만드는 기법을  "싱글톤" 기본이라고 하낟
 */
public class DBConnection {

	private static Connection conn = null;
	/*
	 * static 초기화 블럭
	 * static으로 선언된 변수를 초기화 하는 코드를
	 * 작성하는 영역
	 */
	static {
		// Oracle DBMS 와 통신할때 도와줄 클래스, 애플리케이션
		String jdbcDriver = "oracle.jdbc.OracleDriver";
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "user2";
		String password = "12341234";
		
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(dbURL, username, password);
			System.out.println("DB 연결 OK");
		} catch (ClassNotFoundException e) {
			System.out.println(jdbcDriver+ "가 없습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DBMS 연결 문제 발생");
		
		} //end try
	}//end static
	
	//필요할때 conn 객체를 가져가서 사용할수 있도록 하는 method
	public static Connection getDBConnerction() {
		return conn;
	}
}//end class
