package be_study.quiz.LikeTest;

public class FoodTruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodTruck ft = new FoodTruck("대박분식");
		
		ft.addMenu("김밥", 4000);
		ft.addMenu("떡볶이", 6000);
		ft.addMenu("순대", 7000);
		
		ft.startSales();
		
		
	}

}
