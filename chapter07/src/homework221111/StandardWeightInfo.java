package homework221111;

public class StandardWeightInfo extends Human{
	double standardweight;
	double obesity;
	public StandardWeightInfo(String name, int height, int weight) {
		super(name,height,weight);
	}
	
	public double getStandardWeight() {
		standardweight = (height - 100) * 0.9;
		
		return standardweight;
		
	}
	@Override
	public void getinformation() {	
		super.getinformation();
		System.out.println("표준 체중 " + standardweight);
		
	}

	@Override
	protected double getObesity() {
		obesity = (weight - standardweight)/standardweight * 100;
		return obesity;
	}

	

	

	
	
}
