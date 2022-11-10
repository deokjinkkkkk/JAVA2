package Bankwork;

public class Customer {
	
	 String name;
	 String bankName;
	 int bankId;
	 int money;
	 int principal;
	 String interestRate = "3.0%";
	 double money2 = money * 0.03;
	public Customer(String name , String bankName, int bankId , int money) {
		this.name = name;
		this.bankName = bankName;
		this.bankId = bankId;
		this.money = money;
	}
	public Customer(int money, String interestRate, double money2) {
		this.money = money;
		this.interestRate = interestRate;
		this.money2 = money2;
	}
	
	void getInfo() {
		
		System.out.println("이름 : " + name );
		System.out.println("은행 : " + bankName);
		System.out.println("계좌 : " + bankId);
		System.out.println("잔액 : " + money);
	}
	void withDraw() {
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 : "+ money);
		System.out.println("금리 : "+ interestRate);
		System.out.println("예상 금액 : " + (money + money2));
	}
}
