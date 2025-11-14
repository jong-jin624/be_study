package be_study.cls.cls05;

public class GalaxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정적: " + Galaxy.madeBy);
		
		
		Galaxy g1 = new Galaxy();
		g1.owner = "엄마";
		g1.model = "갤럭시10";
		g1.showInfo();
		g1.showMadeBy();
		
		Galaxy g2 = new Galaxy();
		g2.owner = "아빠";
		g2.model = "갤럭시24";
		System.out.println(g2.madeBy);
		g2.showInfo();
		g2.showMadeBy();
	}

}
