package homework221111;

public abstract class Human {
	String name;
	int height; 
	int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void getinformation() {
		System.out.print(name + " 님의 신장 " +height +", 몸무게 " + weight);
	}
	protected abstract double getStandardWeight();
	protected abstract double getObesity();
	
	
}