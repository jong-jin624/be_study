package be_study.quiz.quiz49;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz49 {

	public static void main(String[] args) throws Exception {

		String jsonString = "{"
				+ "\"employees\": [\r\n" + "		{\r\n" + "		\"id\": 1,\r\n"
				+ "		\"name\": \"홍길동\",\r\n" + "		\"position\": \"개발자\",\r\n" + "		\"salary\": 50000,\r\n"
				+ "		\"skills\": [\"Java\", \"Python\", \"SQL\"]\r\n" + "		},\r\n" + "		{\r\n"
				+ "		\"id\": 2,\r\n" + "		\"name\": \"김철수\",\r\n" + "		\"position\": \"디자이너\",\r\n"
				+ "		\"salary\": 40000,\r\n" + "		\"skills\": [\"Photoshop\", \"Illustrator\"]\r\n"
				+ "		}\r\n" + "		],\r\n" + "		\"company\": {\r\n" + "		\"name\": \"주식회사 ABC\",\r\n"
				+ "		\"address\": \"서울시 강남구\",\r\n" + "		\"established\": \"1990-01-01\",\r\n"
				+ "		\"departments\": [\r\n" + "		{\r\n" + "		\"name\": \"개발부\",\r\n"
				+ "		\"employees\": [1, 3, 5]\r\n" + "		},\r\n" + "		{\r\n" + "		\"name\": \"디자인부\",\r\n"
				+ "		\"employees\": [2, 4]\r\n" + "		}\r\n" + "		]\r\n" + "		},\r\n"
				+ "		\"projects\": [\r\n" + "		{\r\n" + "		\"title\": \"사내 시스템 개발\",\r\n"
				+ "		\"budget\": 100000,\r\n" + "		\"team\": [1, 3]\r\n" + "		},\r\n" + "		{\r\n"
				+ "		\"title\": \"웹 디자인 프로젝트\",\r\n" + "		\"budget\": 80000,\r\n" + "		\"team\": [2, 4]\r\n"
				+ "		}\r\n" + "		]"
				+ "}";
		
		
		try {
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);
			JSONArray employees = (JSONArray) jsonObj.get("employees");
//			JSONArray company = (JSONArray) jsonObj.get("company");
			JSONArray departments = (JSONArray) jsonObj.get("departments");

			System.out.println("직원정보");
			for (Object obj : employees) {
				JSONObject emp = (JSONObject) obj;
				System.out.println("ID: " + emp.get("id"));
				System.out.println("이름: " + emp.get("name"));
				System.out.println("직무: " + emp.get("position"));
				System.out.println("급여: " + emp.get("salary"));
				System.out.println("기술: " + emp.get("skills"));
				System.out.println("------------------");
			}
			System.out.println("회사정보");
			
			for (Object obj : departments) {
				JSONObject dept = (JSONObject) obj;
				System.out.println("부서명: " + dept.get("name"));
				System.out.println("직원ID: " + dept.get("employees"));
				System.out.println("------------------");
			}
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
