package be_study.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO   (Data Access Object)
public class DeptDAO {

	// 필드변수화 ? -> 동시사용시 문제 발생할수 있음.
//	Connection conn;
//	PreparedStatement psmt;
//	ResultSet rs;

	public Dept findDeptByDeptno(int deptno) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		Dept dept = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from dept where deptno = ? ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다
				dept = new Dept();

				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return dept;
	}

	public Dept findDeptByDname(String dname) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		Dept dept = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from dept where dname = ?  ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setString(1, dname);

			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다
				dept = new Dept();

				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return dept;
	}

	public List<Dept> findDeptList() {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		List<Dept> deptList = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from dept ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				// dept 조회 한 행 데이터
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

				if (deptList == null) {
					deptList = new ArrayList<Dept>();
				}
				deptList.add(dept); // 최종 return 할 dept목록 list에 추가
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return deptList;
	}

	// Select -> 실행 -> DB 테이블 조회 정보 -> ResultSet -> 객체변환
	// insert update delete -> 실행 -> 적용된 행의 갯수

	// 저장 Insert
	public int saveDept(int deptno, String dname, String loc) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO dept (deptno, dname, loc) VALUES ( ?, ?, ? ) ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅
			psmt.setInt(1, deptno);
			psmt.setString(2, dname);
			psmt.setString(3, loc);

			// rs = psmt.executeQuery(); select
			// insert, update, delete -> 적용된 행 갯수 -> executeUpdate();
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	// 저장 Insert
	public int saveDept(Dept dept) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO dept (deptno, dname, loc) VALUES ( ?, ?, ? ) ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());

			// rs = psmt.executeQuery(); select
			// insert, update, delete -> 적용된 행 갯수 -> executeUpdate();
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	// 삭제 delete from
	public int removeDept(int deptno) { //PK 컬럼인 deptno 값을 기준으로 삭제
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체
		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " delete from dept where deptno = ? ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			// 파라미터 세팅
			psmt.setInt(1, deptno);
			// rs = psmt.executeQuery(); select
			// insert, update, delete -> 적용된 행 갯수 -> executeUpdate();
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return result;
	}
	
	public int removeDept(Dept dept) { //PK 컬럼인 deptno 값을 기준으로 삭제
		return removeDept(dept.getDeptno());
	}
	
	//Update
	public int modifyDept(Dept dept) { //PK 컬럼인 deptno 값을 기준으로 다른 값들 다 수정
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체
		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " update dept "
						+ " set dname = ? , loc = ? "
						+ " where deptno = ? ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			// 파라미터 세팅
			psmt.setString(1, dept.getDname());
			psmt.setString(2, dept.getLoc());
			psmt.setInt(3, dept.getDeptno());

			// rs = psmt.executeQuery(); select
			// insert, update, delete -> 적용된 행 갯수 -> executeUpdate();
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return result;
	}


}
