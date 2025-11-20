package be_study.cls.cls13;

public class Card {

	int id;
	String type;
	String owner;
	String brand;
	
	public Card(int id, String type, String owner, String brand, Card card) {
		super();
		this.id = id;
		this.type = type;
		this.owner = owner;
		this.brand = brand;
		this.card = card;
	}


	Card card;
	
	public void setCard(Card card) {
		this.card = card;
	}
	
	public Card getCard() {
		return this.card;
	}
	
}
