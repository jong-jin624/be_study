package be_study.quiz.quiz51;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;


public class ArpltnInforInqireSvcRepository {

	// 1. API 요청하기 -> String Text 응답 받기
	// DAO / Repository
	public String requestApi_getMinuDustWeekFrcstDspth(String searchDate) throws Exception {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth"); /*URL*/
		urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=cPguMSwEy2co%2BYgwiGjJKgpiw6%2FMkZ7ND2dh4qJdWds%2BFakaBARkJH18QzvbqAhTr%2B8AWZ4Qg8k%2BGAdVpzPkWQ%3D%3D"); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
		urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
		urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
		urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode(searchDate, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());

		return sb.toString(); 
	}

	// 2. 응답받은 Text (JSON 포맷) -> JSON 파싱 -> DTO 
	// DTO
	public MinuDustWeek getMinuDustWeekFrcstDspth(String searchDate) {
		MinuDustWeek minuDustWeek = null;
		try {

			//api 요청 텍스트 획득

			String jsonString = requestApi_getMinuDustWeekFrcstDspth(searchDate);


			minuDustWeek = new MinuDustWeek();

			//jsonString 파싱
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject)parser.parse(jsonString);
			
			JSONObject body = (JSONObject)((JSONObject)obj.get("response")).get("body");
			
			JSONObject item = (JSONObject)((JSONArray)body.get("items")).get(0);
			
			//DTO 저장
			minuDustWeek.setPresnatnDt(item.get("presnatnDt").toString());
			minuDustWeek.setFrcstOneCn(item.get("frcstOneCn").toString());
			minuDustWeek.setFrcstTwoCn(item.get("frcstTwoCn").toString());
			minuDustWeek.setFrcstOneDt(item.get("frcstOneDt").toString());
			minuDustWeek.setFrcstTwoDt(item.get("frcstTwoDt").toString());
			
			System.out.println(minuDustWeek);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return minuDustWeek;
	}
}
