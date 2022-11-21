package homework221111;

public class Application2 {
	public static void main(String[] args) {
		Human human = new StandardWeightInfo("홍길동",168,45);
		human.getStandardWeight();
		human.getinformation();
		
		human = new ObesityInfo("박둘이",168,90);
		human.getStandardWeight();
		human.getObesity();
		human.getinformation();
		
		
		
		
		
	}	
}	
