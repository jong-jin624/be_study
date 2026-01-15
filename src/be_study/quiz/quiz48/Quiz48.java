package be_study.quiz.quiz48;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz48 {

//	JSON 파싱하기 연습
//
//	아래 json 포맷의 텍스트를 분석하여, 각 키값에 해당하는 데이터들을
//	확인할 수 있도록 적절하게(알아서 적당히) 배치해서 출력해보세요.

	public static void main(String[] args) {

		String jsonString = "{" + "\"도서관\": {\r\n" + "\"위치\": \"서울특별시 강남구\",\r\n" + "\"운영시간\": {\r\n"
				+ "\"평일\": [\"09:00\", \"21:00\"],\r\n" + "\"주말\": [\"10:00\", \"18:00\"]\r\n" + "},\r\n"
				+ "\"책목록\": [\r\n" + "{\r\n" + "\"제목\": \"자바 프로그래밍\",\r\n" + "\"저자\": \"홍길동\",\r\n"
				+ "\"출판연도\": 2023,\r\n" + "\"가격\": 25000,\r\n" + "\"대출가능\": true,\r\n"
				+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]\r\n" + "},\r\n" + "{\r\n" + "\"제목\": \"데이터 분석 입문\",\r\n"
				+ "\"저자\": \"김철수\",\r\n" + "\"출판연도\": 2022,\r\n" + "\"가격\": 28000,\r\n" + "\"대출가능\": false,\r\n"
				+ "\"카테고리\": [\"데이터\", \"분석\"]\r\n" + "}\r\n" + "],\r\n" + "\"특별서비스\": {\r\n" + "\"키오스크\": true,\r\n"
				+ "\"스터디룸\": {\r\n" + "\"개수\": 5,\r\n" + "\"예약 가능\": true,\r\n" + "\"비용\": {\r\n"
				+ "\"1시간당\": 5000,\r\n" + "\"하루\": 30000\r\n" + "}\r\n" + "}\r\n" + "}\r\n" + "}\r\n" + "}";

		
		try {
			
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject)parser.parse(jsonString);
			
			JSONObject library = (JSONObject)jsonObj.get("도서관");
			System.out.println(library.get("위치"));
			
			JSONObject openHour= (JSONObject)library.get("운영시간");
			
			JSONArray weekday = (JSONArray)openHour.get("평일");
			JSONArray weekend = (JSONArray)openHour.get("주말");
			
			System.out.println("평일 : " + weekday.get(0) + "~" + weekday.get(1));
			System.out.println("주말 : " + weekend.get(0) + "~" + weekend.get(1));
			
			JSONArray bookList = (JSONArray)library.get("책목록");
			for(int i= 0; i<bookList.size(); i++) {
				
				System.out.println("---------book--------" + i);
				JSONObject book = (JSONObject)bookList.get(i);
				System.out.println("제목 : " + book.get("제목"));
				System.out.println(book.get("저자"));
			}
			
			JSONObject special = (JSONObject)library.get("특별서비스");
		
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
