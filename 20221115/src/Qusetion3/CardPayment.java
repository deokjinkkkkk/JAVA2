package Qusetion3;

public class CardPayment implements Payment{
	double cardRatio ;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
		System.out.println("*** 카드로 결제 시 할인정보");
	}

	@Override
	public int online(int price) {
		int disscount = price -(price *= (cardRatio + ONLINE_PAYMENT_RATIO));
		
		return disscount;
		
	}

	@Override
	public int offline(int price) {
		int disscount2 =price -(price *= (cardRatio + OFFLINE_PAYMENT_RATIO));
		return disscount2;
	}

	@Override
	public void showInfo() {
		System.out.println("온라인 결제시 총 할인율 : " + (cardRatio + ONLINE_PAYMENT_RATIO)  );
		System.out.println("오프라인 결제시 총 할인율 : " + (cardRatio + OFFLINE_PAYMENT_RATIO));
	}
	
}
