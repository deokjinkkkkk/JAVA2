package com.yedam.chapter11;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		
		//String 은 같은 데이터는 같은 주소를 가진다.
		
		//HashMap -> Key, Value 데이터를 저장 
		
		HashMap<Key, String> hashmap = new HashMap<>();
		
		//new Key(1) -> 1
		hashmap.put(new Key(1), "홍길동");
		
		
		
		//new Key(1) -> 2
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
		Key key = new Key(1);
		System.out.println(key.toString());
		
	}
}
