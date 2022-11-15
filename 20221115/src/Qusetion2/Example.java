package Qusetion2;

public class Example {
	public static void main(String[] args) {
		Card card = new Card("5432-4567-9534-3467",20251203,253);
		card.showCardInfo();
		card = new TossCard("5432-4567-9534-3467",20251203,253,"신빛용");
		card.showCardInfo();
		card = new DGBCard("5432-4567-9534-3467",20251203,253,"신빛용");
		card.showCardInfo();
	}
	
}
