package be_study.api.test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VilageFcstInfoServiceDAO {


	public int saveVilageDTO(VilageDTO vilageDTO) {
		//DB에 저장..
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = " INSERT INTO VILAGE VALUES( SEQ_VILAGE_PK.nextval, ?, ?, ?, ?, ?, ?) ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅
			psmt.setString(1, vilageDTO.getBaseDate());
			psmt.setString(2, vilageDTO.getBaseTime());
			psmt.setString(3, vilageDTO.getFcstDate());
			psmt.setString(4, vilageDTO.getFcstTime());
			psmt.setString(5, vilageDTO.getCategory());
			psmt.setString(6, vilageDTO.getFcstValue());
			
			

			result = psmt.executeUpdate(); //INSERT 

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}