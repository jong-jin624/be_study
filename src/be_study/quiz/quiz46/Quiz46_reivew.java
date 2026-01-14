package be_study.quiz.quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.Dept;

import be_study.quiz.quiz46.Professor;

public class Quiz46_reivew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 참조테이블 : professor

		// DB 의 professor 테이블에서 profno, name, id, position, pay, deptno 정보를
		// 조회하는 메소드를 생성하시오.
		// main 에서 호출하며 조회 결과를 출력하는 기능을 제공한다.
		// 단 쿼리는 WHERE 조건을 deptno = 를 비교하여 조회하는 형태로 작성하시오.
		// 필요한 deptno 는 해당 메소드의 파라미터로 전달 받아서 쿼리에 활용하시오.

		// ex) findProfessorListByDeptno(int deptno)

		List<Professor> pList = findProfessorListByDeptno(101);

		if (pList.size() > 0) {
		}
		for (Professor p : pList) {
			System.out.println(p);
		}
	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
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

		List<Professor> professorList = new ArrayList<>();;

		// 실행 쿼리 준비
		String sqlQuery = " select profno, name, id, position, pay, deptno from professor where deptno = ? ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				// dept 조회 한 행 데이터
				Professor p = new Professor();
				p.setProfno(rs.getInt("profno"));
				p.setName(rs.getString("name"));
				p.setId(rs.getString("id"));
				p.setPosition(rs.getString("position"));
				p.setPay(rs.getInt("pay"));
				p.setDeptno(rs.getInt("deptno"));

				professorList.add(p);

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

		return professorList;
	}
}
