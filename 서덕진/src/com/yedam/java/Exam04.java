package com.yedam.java;

public class Exam04 {
	public static void main(String[] args) {
		for(int i =1; i<=9; i++) {
			for(int j =1; j<=9; j++) {
				if(i >=j) {
					int result = i*j;
					System.out.println(i+ "*" + j +" "+result);
				}
			}
		}
	}
}
