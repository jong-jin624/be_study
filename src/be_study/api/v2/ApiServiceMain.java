package be_study.api.v2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiServiceMain {

	public static void main(String[] args) {
		
		
		//API 데이터 요청 -> 결과 값 응답
		MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();
		
		
		MidTaDTO midTaDTO = repository.getMidTa("202601150600", "11B10101");
		//202601150600 시간 기준, 11B10101 서울 날씨 
		
		//midTaDTO 활용
		System.out.println(midTaDTO);
		
		MidTaDTO midTaDTO2 = repository.getMidTa("202601150600", "11B20201");
		//202601150600 시간 기준, 11B20201 인천 날씨 
		
		//midTaDTO 활용
		System.out.println(midTaDTO2);
		
		
		//파싱한 DTO 객체 -> DB 저장
		
	}

}
