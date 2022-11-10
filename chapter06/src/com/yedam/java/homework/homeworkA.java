package com.yedam.java.homework;

import java.util.Scanner;

public class homeworkA {
	public static void main(String[] args) {
	// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
	// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
	// 1)상품 수 
	// 2)상품 및 가격입력 
	// 3)분석 
	// 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
	// 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
	int max = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("상품 수 > ");
	int count = Integer.parseInt(sc.nextLine());
	Mart[] num = new Mart[count];
	for(int i = 0 ; i< num.length; i++) {
		Mart num1 = new Mart();
		
		System.out.println("상품 > ");
		String Product =  sc.nextLine();
		num1.setProduct(Product);
		
		System.out.println("가격 > ");
		int price = Integer.parseInt(sc.nextLine());
		num1.setPrice(price);
		
		num[i] = num1;	
	}
	for(int i = 0; i <num.length ; i++) {
		num[i].getInfo();
	}
	for(int i = 0; i <num.length ; i++) {
		
		
		if(max < num[i].price) {
			max = num[i].price;
			
		}
		for (int j = 0; j <num.length ; j++) {
			if (max == num[j].price) {
				System.out.println("최고가격 제품 : " + num[j].product);
			}
		}
		
	
	}


	}

}
