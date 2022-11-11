package homework221111;

public class Employee {
	//필드
	
	public String name;
	public int pay;
	
	//생성자	
	public Employee(String name,int pay) {
		this.name = name;
		this.pay = pay;
	}
	
	//메소드
	public void getlnformation() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + pay);
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
	//getter
	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}
}
