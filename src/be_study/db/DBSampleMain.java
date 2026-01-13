package be_study.db;

import java.sql.*;

public class DBSampleMain {

	public static void main(String[] args) {

		findProduct();

		selectDept();

		selectDeptWhere();

//		findDeptByDeptno(20);

//		findDeptByDeptno(40);
		
//		Dept d1 = findDeptByDeptno(20);
//		System.out.println(d1.toString());
		
//		Dept d2 = findDeptByDeptno(70);
//		if(d2 != null)
//			System.out.println(d2.toString());
		
		Dept d3 = findDeptByDname("SALES");
		System.out.println(d3.toString());
		
		List<Dept> deptList = findDeptList();
		
		if(deptList == null) {
			System.out.println("데이터 없음");
		} else {
			for(Dept d : deptList) {
				System.out.println(d.toString());
			}
		}
	}

	public static void findProduct() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
		// String db_url = "jdbc:oracle:thin:@150.25.33.191:2621:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

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

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				System.out.print(rs.getInt("p_code") + " ");
				System.out.print(rs.getString("p_name") + " ");
				System.out.println(rs.getInt("p_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("------------------------------------------");
	}

	public static void selectDept() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
		// String db_url = "jdbc:oracle:thin:@150.25.33.191:2621:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실행 쿼리 준비
		String sqlQuery = " select * from dept ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.println(rs.getString(3));

				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("------------------------------------------");
	}

	public static void selectDeptWhere() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
		// String db_url = "jdbc:oracle:thin:@150.25.33.191:2621:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실행 쿼리 준비
		String sqlQuery = " select * from dept where deptno = 30 ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.println(rs.getString(3));

				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("------------------------------------------");
	}

	public static Dept findDeptByDname(String dname) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
		// String db_url = "jdbc:oracle:thin:@150.25.33.191:2621:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<Dept> deptList = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from dept ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

//			파라미터 세팅
			psmt.setString(1, dname);

			rs = psmt.executeQuery();

			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				
				dept = new Dept();
				
				dept.setDeptno( rs.getInt("deptno") );
				dept.setDname( rs.getString("dname") );
				dept.setLoc( rs.getString("loc") );

				if(deptList == null)
					deptList = 
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return deptList;
	}

}
