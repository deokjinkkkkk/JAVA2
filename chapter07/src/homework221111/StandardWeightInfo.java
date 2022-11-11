package homework221111;

public class StandardWeightInfo extends Human{
	double standardweight;
	
	public StandardWeightInfo(String name, int height, int weight) {
		super(name,height,weight);
	}
	
	public double getStandardWeight() {
		standardweight = (height - 100) * 0.9;
		System.out.println("표준 체중 :" + standardweight);
		return standardweight;
		
	}
	@Override
	public void getinformation() {	
		super.getinformation();
		System.out.println("표준 체중 " + standardweight);
		
	}
}
