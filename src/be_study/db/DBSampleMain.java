package be_study.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		
//		findProduct();
		
//		selectDept();
		
//		selectDeptWhere();
		
//		findDeptByDeptnoPrint(20);
//		
//		findDeptByDeptnoPrint(40);
//		
//		findDeptByDeptnoPrint(10);
		
		Dept d1 = findDeptByDeptno(20);
		System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());
		System.out.println(d1.toString());
		
		Dept d2 = findDeptByDeptno(70);
		if(d2 != null)
			System.out.println(d2.toString());
		
		Dept d3 = findDeptByDname("SALES");
		System.out.println(d3.toString());
		
		Dept d4 = findDeptByDname("DEEPSLEEP");
		if(d4 == null) {
			System.out.println("해당 부서명 데이터 없음");
		} else {
			System.out.println(d4.toString());
		}
		
		List<Dept> deptList = findDeptList();
		
		if(deptList == null) {
			System.out.println("데이터 없음");
		} else { //데이터 있음
			
			for(Dept d : deptList) {
				System.out.println(d.toString());
			}
		}
		
		List<Dept> deptList2 = findDeptList2();
		//if(deptList2 == null)
		if( deptList2.size() == 0) {  //초기화O    추가된 데이터가 X
		}
		
		if( deptList2 != null && deptList2.size() > 0 ) {
			
			//조회된 데이터가 있는 경우 처리할 코드
			for(Dept d : deptList2) {
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
				
		//DB 연결 정보
		//String db_url = "jdbc:oracle:thin:@150.25.33.191:2621:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행 쿼리 준비
		String sqlQuery = " select * from product ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				System.out.print( rs.getInt("p_code") + " ");
				System.out.print( rs.getString("p_name") + " ");
				System.out.println( rs.getInt("p_price") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//				   readDept   findDept   findDeptList
	public static void selectDept() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		//String db_url = "jdbc:oracle:thin:@150.25.33.191:2621:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행 쿼리 준비
		String sqlQuery = " select * from dept ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				//   column Index 값 기준으로 조회
				// System.out.print( rs.getInt(1) + " ");
				// System.out.print( rs.getString(2) + " ");
				// System.out.println( rs.getString(3) );
				
				System.out.print( rs.getInt("deptno") + " ");
				System.out.print( rs.getString("dname") + " ");
				System.out.println( rs.getString("loc") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void selectDeptWhere() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행 쿼리 준비
		String sqlQuery = " select * from dept where deptno = 30 ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				System.out.print( rs.getInt("deptno") + " ");
				System.out.print( rs.getString("dname") + " ");
				System.out.println( rs.getString("loc") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void findDeptByDeptnoPrint(int deptno) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행 쿼리 준비
		String sqlQuery = " select * from dept where deptno = ? ";
		//select * from dept where deptno = 30
		//" select * from dept where deptno =  " + deptno;
		//" select * from dept where deptno = 20  ";
		//System.out.printf("여기 %s 여기 %d", "문자", 50);
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				System.out.print( rs.getInt("deptno") + " ");
				System.out.print( rs.getString("dname") + " ");
				System.out.println( rs.getString("loc") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Dept findDeptByDeptno(int deptno) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Dept dept = null;
		
		//실행 쿼리 준비
		String sqlQuery = " select * from dept where deptno = ? ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();
			
			//조회 결과가 1개 행만 나오는 상황
			if(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				//데이터가 있다
				dept = new Dept();
				
				dept.setDeptno( rs.getInt("deptno") );
				dept.setDname( rs.getString("dname") );
				dept.setLoc( rs.getString("loc"));
			}
			//if 가 거짓이면 데이터가 없다...
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dept;
	}
	
	public static Dept findDeptByDname(String dname) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Dept dept = null;
		
		//실행 쿼리 준비
		String sqlQuery = " select * from dept where dname = ?  ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setString(1, dname);
			
			rs = psmt.executeQuery();
			
			//조회 결과가 1개 행만 나오는 상황
			if(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				//데이터가 있다
				dept = new Dept();
				
				dept.setDeptno( rs.getInt("deptno") );
				dept.setDname( rs.getString("dname") );
				dept.setLoc( rs.getString("loc"));
			}
			//if 가 거짓이면 데이터가 없다...
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dept;
	}
	
	public static List<Dept> findDeptList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<Dept> deptList = null;
		
		//실행 쿼리 준비
		String sqlQuery = " select * from dept ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);			
			rs = psmt.executeQuery();
			
			//조회 결과가 1개 행만 나오는 상황
			while(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				//데이터가 있다
				
				
				//dept 조회 한 행 데이터
				Dept dept = new Dept();
				dept.setDeptno( rs.getInt("deptno") );
				dept.setDname( rs.getString("dname") );
				dept.setLoc( rs.getString("loc"));
				
				if(deptList == null) {
					deptList = new ArrayList<Dept>();
				}
				deptList.add(dept); //최종 return 할 dept목록 list에 추가
			}
			//if 가 거짓이면 데이터가 없다...
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return deptList;
	}
	
	public static List<Dept> findDeptList2() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null; //db 연결
		PreparedStatement psmt = null;  //db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<Dept> deptList = new ArrayList<Dept>();
		
		//실행 쿼리 준비
		String sqlQuery = " select * from dept ";
		
		//쿼리 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);			
			rs = psmt.executeQuery();
			
			//조회 결과가 1개 행만 나오는 상황
			while(rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다. 
				//데이터가 있다
				
				//dept 조회 한 행 데이터
				Dept dept = new Dept();
				dept.setDeptno( rs.getInt("deptno") );
				dept.setDname( rs.getString("dname") );
				dept.setLoc( rs.getString("loc"));
				
				deptList.add(dept); //최종 return 할 dept목록 list에 추가
			}
			//if 가 거짓이면 데이터가 없다...
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();  //Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return deptList;
	}
}
