package be_study.quiz.quiz51;

public class Quiz51 {

	public static void main(String[] args) throws Exception {
		
		// 1. API 요청하기 -> String Text 응답 받기
		// DAO / Repository
		
		ArpltnInforInqireSvcRepository repository = new ArpltnInforInqireSvcRepository();
		//repository.requestApi_getMinuDustWeekFrcstDspth("2026-01-15");
		
		// 2. 응답받은 Text (JSON 포맷) -> JSON 파싱 -> DTO 
		// DTO
		MinuDustWeek minuDustWeek = repository.getMinuDustWeekFrcstDspth("2026-01-15");
		
		// 3. DTO -> DAO -> DB에 저장
		// DAO
		ArpltnInforInqireSvcDAO dao = new ArpltnInforInqireSvcDAO();
		int result = dao.saveMinuDustWeek(minuDustWeek);
		if(result > 0) {
			System.out.println("minuDustWeek 정보 저장 성공~");
		}
		
	}

}
