package homework221111;

public class Human {
	String name;
	int height; 
	int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void getinformation() {
		System.out.println(name + " 님의 신장 " +height +", 몸무게" + weight);
	}
}
