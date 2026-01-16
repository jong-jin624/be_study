package be_study.api.test2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class VilageFcstInfoServiceRepository {

	// 1. API 요청하기 -> String Text 응답 받기
	// DAO / Repository
	    public String requestApi_getVilageFcst(String searchDate) throws Exception {
	        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=d1c4e68b68cb1e4be9fef9fa699dc40064660b4b6502ef4f06c469085d8a75e6"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
	        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
	        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(searchDate, "UTF-8")); /*‘21년 6월 28일발표*/
	        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0500", "UTF-8")); /*05시 발표*/
	        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /*예보지점의 X 좌표값*/
	        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /*예보지점의 Y 좌표값*/
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
	public VilageDTO getVilageFcst(String searchDate) {
		VilageDTO vilageDTO = null;
		try {

			//api 요청 텍스트 획득

			String jsonString = requestApi_getVilageFcst(searchDate);


			vilageDTO = new VilageDTO();

			//jsonString 파싱
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject)parser.parse(jsonString);
			
			JSONObject body = (JSONObject)((JSONObject)obj.get("response")).get("body");
			JSONObject items = (JSONObject)body.get("items");
			
			JSONObject item = (JSONObject)((JSONArray)items.get("item")).get(0);

			//DTO 저장
			vilageDTO.setBaseDate(item.get("baseDate").toString());
			vilageDTO.setBaseDate(item.get("baseTime").toString());
			vilageDTO.setFcstDate(item.get("fcstDate").toString());
			vilageDTO.setFcstDate(item.get("fcstTime").toString());
			vilageDTO.setCategory(item.get("category").toString());
			vilageDTO.setFcstValue(item.get("fcstValue").toString());
			
			System.out.println(vilageDTO);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vilageDTO;
	}
}

