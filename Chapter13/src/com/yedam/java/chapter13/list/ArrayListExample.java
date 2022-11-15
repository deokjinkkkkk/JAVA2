package com.yedam.java.chapter13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		// List<E> list2 = new ArrayList<>();
		// E 는 어떤객체를 넣을지 모를때 여러가지 객체를 쓰겠다는 의미
		
		//객체 저장
		//배열 list[0] = "Java"; 10개의 사이즈 5개
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"DataBase");
		list.add("iBATIS");
		
		//배열 list.length()
		int size = list.size();
		System.out.println("총 객체수 : "+ size);
		System.out.println();
		
		//skill = list[2];
		String skill = list.get(2);
		System.out.println("2: " + skill + "\n");
		
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : " + str);
		}
		System.out.println();
		
		list.remove(2);
		
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : " + str);
		}
		System.out.println();
		
		
		
		
		
		
	}
}
