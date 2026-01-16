package be_study.api.test;

import be_study.api.test.VilageFcstInfoServiceDAO;
import be_study.api.test.VilageFcstInfoServiceRepository;
import be_study.api.test.VilageDTO;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		// 1. API 요청하기 -> String Text 응답 받기
		// DAO / Repository
		
		VilageFcstInfoServiceRepository repository = new VilageFcstInfoServiceRepository();
		//repository.requestApi_getMinuDustWeekFrcstDspth("2026-01-15");
		
		// 2. 응답받은 Text (JSON 포맷) -> JSON 파싱 -> DTO 
		// DTO
		VilageDTO vilageDTO = repository.getVilageFcst("20260115");
		
		// 3. DTO -> DAO -> DB에 저장
		// DAO
		VilageFcstInfoServiceDAO dao = new VilageFcstInfoServiceDAO();
		int result = dao.saveVilageDTO(vilageDTO);
		if(result > 0) {
			System.out.println("vilageDTO 정보 저장 성공~");
		}
		
	}

}