package be_study.quiz;

public class Quiz22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다.
//		이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을 작성하세요.
//
//		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
//
//		최고 점수와 최저 점수를 출력하세요.
//		평균 점수를 출력하세요.
//		80점 이상인 학생의 수를 출력하세요.
//
//		출력 예)
//
//		최고 점수: 100
//		최저 점수: 63
//		평균 점수: 82.5
//		80점 이상 학생 수: 6명
		int[] scores = { 88, 92, 75, 63, 95, 70, 85, 90, 100, 67 };

		int sum = 0;
		int count80 = 0;
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < scores.length; i++) {
			
			sum += scores[i]; // 평균 구하기
			
			if(max > scores[i]) { //최솟값
				min = scores[i];
			}
			
			if(max < scores[i]) { //최댓값
				max = scores[i];
			}
			
			if(scores[i] >= 80) { //80점 이상 카운트
				count80++;
			}
		}

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("평균 점수 : " + (double)sum/scores.length);
		System.out.println("80점 이상 학생 수 : " + count80 + "명");
		
		
		
	}

}
