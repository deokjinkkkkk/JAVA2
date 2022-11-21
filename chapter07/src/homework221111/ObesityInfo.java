package homework221111;

public class ObesityInfo extends StandardWeightInfo{
	double obesity;
	
	
	public ObesityInfo(String name, int height, int weight ) {
		super(name,height,weight);
		
	}
	@Override
	public void getinformation() {
		
		super.getinformation();
		if(obesity < 18.5) {
			System.out.println(", 저체중");
		}else if (obesity <23) {
			System.out.println(", 정상");
		}else if (obesity < 25) {
			System.out.println(", 과체중");
		}else if (obesity < 30) {
			System.out.println(", 비만");
		}else if (obesity < 35) {
			System.out.println(", 고도비만");
		}else if (obesity >35) {
			System.out.print(", 초고도비만");
		}
	}

	public double getObesity() {
		obesity = (weight - standardweight)/standardweight * 100;
		return obesity;
		
	}
}
