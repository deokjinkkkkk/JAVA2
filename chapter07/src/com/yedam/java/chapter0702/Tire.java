package com.yedam.java.chapter0702;

public class Tire {
	public int maxRotation; //최대 회전수
	public int accRotation; //누적 회전수
	public String location; //타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accRotation;
		//누적 회전수 < 최대 회전수
		if(accRotation < maxRotation) {
			System.out.println(location + " Tire 수명:" +
					(maxRotation-accRotation) + "회");
			return true;
		}else {
			System.out.println(" ### " + location + "Tire 펑크 ###");
			return false;
		}
	}
}
