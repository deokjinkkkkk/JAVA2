package com.yedam.java.homework;

public class Mart {
	int products;
	int price;
	String product;
	
	
	public void getInfo() {
		System.out.println("=====================");
		System.out.println("상품명 : " + product);
		System.out.println("상품가격 : " + price);
		
	}
	public void analysis() {
		
		System.out.println("=====================");
		System.out.println("최고가격 제품 : " + product);
		System.out.println("나머지 상품의 총합 : " + price);
		
	}
	public void setProducts(int products) {
		this.products = products;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setProduct(String product) {
		this.product = product;
	}
}
