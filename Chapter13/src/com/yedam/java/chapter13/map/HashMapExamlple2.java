package com.yedam.java.chapter13.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamlple2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95);
		
		System.out.println("총 entry 수 : " + map.size());
	}
}
