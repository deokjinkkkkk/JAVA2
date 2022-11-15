package Qusetion3;

public class SimplePayment implements Payment{
	double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
		System.out.println("*** 간편결제 시 할인정보");
	}
	@Override
	public int online(int price) {
		int disscount = price - (price *= (simplePaymentRatio + ONLINE_PAYMENT_RATIO));
		return disscount;
	}

	@Override
	public int offline(int price) {
		int disscount2 = price -(price *= (simplePaymentRatio + OFFLINE_PAYMENT_RATIO));
		return disscount2;
	}

	@Override
	public void showInfo() {
		System.out.println("온라인 결제시 총 할인율 : " + (simplePaymentRatio + ONLINE_PAYMENT_RATIO)  );
		System.out.println("오프라인 결제시 총 할인율 : " + (simplePaymentRatio + OFFLINE_PAYMENT_RATIO));
		
	}
	
}
