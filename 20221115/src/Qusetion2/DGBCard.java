package Qusetion2;

public class DGBCard extends Card {
	public static final String company = "대구은행";
	String cardStaff;
	
	public DGBCard(String cardNo, int validDate, int cvc,String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		
		super.showCardInfo();
		System.out.println("담당직원 - 신빛용, "+company);
	}

}
