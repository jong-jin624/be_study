package be_study.quiz.quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.quiz.quiz45.Product;
import be_study.quiz.quiz46.Professor;

public class Quiz46 {

	public static void main(String[] args) {
		Professor f1 = findProfessorListByDeptno(101);
		System.out.println(f1.getProfno() + " " + f1.getName() + " " + f1.getId() + " " + f1.getPosition() + " "
				+ f1.getPay() + " " + f1.getDeptno());

		Professor f2 = findProfessorListByDeptno(102);
		System.out.println(f2.getProfno() + " " + f2.getName() + " " + f2.getId() + " " + f1.getPosition() + " "
				+ f1.getPay() + " " + f2.getDeptno());

		Professor f3 = findProfessorListByDeptno(103);
		System.out.println(f3.getProfno() + " " + f3.getName() + " " + f3.getId() + " " + f1.getPosition() + " "
				+ f3.getPay() + " " + f3.getDeptno());

		Professor f4 = findProfessorListByDeptno(201);
		System.out.println(f4.getProfno() + " " + f4.getName() + " " + f4.getId() + " " + f4.getPosition() + " "
				+ f4.getPay() + " " + f4.getDeptno());

		Professor f5 = findProfessorListByDeptno(202);
		System.out.println(f5.getProfno() + " " + f5.getName() + " " + f5.getId() + " " + f5.getPosition() + " "
				+ f5.getPay() + " " + f5.getDeptno());

		Professor f6 = findProfessorListByDeptno(203);
		System.out.println(f1.getProfno() + " " + f6.getName() + " " + f6.getId() + " " + f6.getPosition() + " "
				+ f6.getPay() + " " + f6.getDeptno());

		Professor f7 = findProfessorListByDeptno(301);
		System.out.println(f7.getProfno() + " " + f7.getName() + " " + f7.getId() + " " + f7.getPosition() + " "
				+ f7.getPay() + " " + f7.getDeptno());
	}

	public static Professor findProfessorListByDeptno(int deptno) {

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

		Professor professor = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from professor where deptno = ? ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다
				professor = new Professor();
				professor.setDeptno(rs.getInt("deptno"));
				professor.setName(rs.getString("name"));
				professor.setProfno(rs.getInt("profno"));
				professor.setId(rs.getString("id"));
				professor.setPosition(rs.getString("position"));
				professor.setPay(rs.getInt("pay"));
			}
			// if 가 거짓이면 데이터가 없다...
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

		return professor;
	}

}
