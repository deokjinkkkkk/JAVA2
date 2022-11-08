package com.yedam.java.ch0502_01;

import javax.management.StringValueExp;

public class ReferenceTypeExample {
		
	public static void main(String[] args) {
		//클래스 테스트
		User user = new User();
		user.name = "홍길동";
		user.age = 25;
		user.height = 175.7;
		
		/* 자바스크립트
		let user = {
				name : '홍길동',
				age : 25,
				height : 175.7
		};*/
		
		//배열을 선언 -> 모든 타입을 값으로 가질수 있음
		int[] intAry = null;
		//System.out.println("intAry[0] : " + intAry[0]);
		
		//값을 초기화하면서 배열을 생성
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		//scores 안에 값을 모두 더해라
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		}//인덱스와 크기는 1만큼의 차이가 있기 때문에 같다를 추가하면 안된다.(인덱스는 0부터 시작)
		
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		//주의사항
		//변수를 선언할때만 {}를 통해값을 넣을수 있다.
		//값을 넣기 위해서는 new int[]를 붙인다.
		//크기를 주면 안된다. ex) new int[5] X
		int[] scoreList;
		
		scoreList = new int[]{83, 90, 87};
		
		sum = 0;
		for(int i=0; i <3 ; i++) {
			sum = sum + scoreList[i];
		}
		System.out.println("총합 : " +sum);
		
		sum = add(new int[] {83,90,87});
		
		// new 연산자로 배열 생성
		int [] array = new int[3];
		for(int i=0; i<3 ; i++) {
			System.out.println("array["+i+"] : "+array[i]);
		}
		
		String[] strAry = new String[4];
		for(int i=0; i <strAry.length; i++) {
			strAry[i] = String.valueOf(i);
		}
		
		for(int i=0; i <strAry.length; i++) {
			System.out.println("strAry["+i+"] : " + strAry[i]);
		}
		
//		int add(int[] numList) {
//			sum = 0;
//			for(int i = 0 ; i < numList.length; i++) {
//				sum += numList[i];
//			}
//			return sum;
//		}
		
	}

	private static int add(int[] is) {
		// TODO Auto-generated method stub
		return 0;
	}
}
