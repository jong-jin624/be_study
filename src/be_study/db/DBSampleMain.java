package be_study.db;

import java.sql.*;

public class DBSampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB 연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결 sql 명령 실행 객체
		ResultSet rs = null; // sql 실행 후 select 결과 저장 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실행 쿼리 준비
		String sqlQuery = " select * from product ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt("p_code") + " ");
				System.out.print(rs.getString("p_name") + " ");
				System.out.println(rs.getInt("p_price") + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (rs != null) {
				rs.close();
			}
			if (rs != null) {
				psmt.close();
			}
			if (rs != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
