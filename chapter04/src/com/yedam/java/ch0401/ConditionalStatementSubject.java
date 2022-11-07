package com.yedam.java.ch0401;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// 문제1 ) 두 개의 정수가 주어졌을때
		//		 두 정수의 합이 자연수이면 
		//   	 'Natural Number'를 출력하는 코드를 작성하세요
		int A = 3;
		int B = 4;
		
		if(A + B > 0) {
			System.out.println("Natural Number");
		}
		
		//문제 2 ) 두 개의 정수가 주어졌을 때
		// 		 두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요
		
		if(A > B) {
			System.out.println(">");
		}
		else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("=");
		}
		
		//문제 3 ) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분
		// 		  BMI = 체중 / (	키(m) * 키(m) )
		//		  저체중(18.5미만), 정상(18.5 이상 25미만),
		//		  과체중(25이상 30미만), 비만(30이상)
		double KG = 72;
		double m = 1.7;
		double BMI = KG / (m * m);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}
		else if( BMI < 25 ) {
			System.out.println("정상");
		}
		else if (BMI < 30) {
			System.out.println("과체중");
		}
		else {
			System.out.println("비만");
		}
		
		//문제 4 ) 선택한 단의 6번째 값을 출력하는 코드
		//		  예를 들어, 2단일 경우 2 x 6 = 12
		//		  단, 출력문에는 변수를 사용하지 않는다.
		
		int num = (int)(Math.random() * 9)+ 1;
		switch(num) {
		case 1:
			System.out.println(1*6);
			break;
		case 2:
			System.out.println(2*6);
			break;
		case 3:
			System.out.println(3*6);
			break;
		case 4:
			System.out.println(4*6);
			break;
		case 5:
			System.out.println(5*6);
			break;
		case 6:
			System.out.println(6*6);
			break;
		case 7:
			System.out.println(7*6);
			break;
		case 8:
			System.out.println(8*6);
			break;
		default:
			System.out.println(9*6);
			
		}
		//문제5) 다음과 같이 점수 범위에 따라 등급을 구분
		//		해당 점수에 대한 등급을 출력하는 코드
		// 		90점 이상 100점 이하 : A등급
		//		80점 이상 90점 미만 : B등급
		//		70점 이상 80점 미만 : C등급
		//		60점 이상 70점 미만 : D등급
		//		60점 미만 : E등급
		int score = 80;
		switch((int)(score/10)) {
		case 10:
		case 9: 
			System.out.println("A등급");
			break;
		case 8: 
			System.out.println("B등급");
			break;
		case 7: 
			System.out.println("C등급");
			break;
		case 6: 
			System.out.println("D등급");
			break;
		default:
			System.out.println("E등급");
			
		}
		
		
		
			
	}

}
