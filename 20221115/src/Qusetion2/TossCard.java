package Qusetion2;

public class TossCard extends Card {
	public static final String company = "Toss";
	String cardStaff;
	
	public TossCard(String cardNo, int validDate, int cvc,String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, " + getCardNo() +"\n담당직원 - 신빛용, " +company );
		
		
	}
	
	
}
