package be_study.quiz.quiz51;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArpltnInforInqireSvcDAO {


	public int saveMinuDustWeek(MinuDustWeek minuDustWeek) {
		//DB에 저장..
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO MINU_DUST_WEEK VALUES( SEQ_MINU_DUST_WEEK_PK.nextval, ?, ?, ?, ?, ?) ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅
			psmt.setString(1, minuDustWeek.getPresnatnDt());
			psmt.setString(2, minuDustWeek.getFrcstOneCn());
			psmt.setString(3, minuDustWeek.getFrcstTwoCn());
			psmt.setString(4, minuDustWeek.getFrcstOneDt());
			psmt.setString(5, minuDustWeek.getFrcstTwoDt());

			result = psmt.executeUpdate(); //INSERT 

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
