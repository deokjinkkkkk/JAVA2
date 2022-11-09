package com.yedam.java.ch0604;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas( ) {
		if(this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}//return이 있기 때문에 if 문에서 끝이 난다.
		
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(this.gas > 0) {
				System.out.println("달립니다. (gas 잔량 :"+ this.gas + ")");
				this.gas--;
			}else {
				System.out.println("멈춥니다. (gas 잔량 :"+ this.gas + ")");
				return;
				//리턴뒤에는 실행 X ex) exit
				//메소드는 서로 호출할수 있다.
			}
		}
	}
}
