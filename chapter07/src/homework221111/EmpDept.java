package homework221111;

public class EmpDept extends Employee {
	
	
	//필드
	public String team;
	
	//생성자
	public EmpDept(String name, int pay, String team) {
		super(name, pay);
		this.team = team;
	}
	

	
	//getter
	public String getTeam() {
		return team;
	}
	@Override
	public String getName() {
		
		return super.getName();
	}
	@Override
	public int getPay() {
		
		return super.getPay();
	}
	
	@Override
	public void getlnformation() {
		super.getlnformation();
		System.out.println("부서 : " + team);
	}



	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
}
