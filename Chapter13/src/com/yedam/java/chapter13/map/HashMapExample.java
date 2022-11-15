package com.yedam.java.chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String , Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //덮어 써진다.
		
		System.out.println("총 Entry 수 : " + map.size());
		
		int score = map.get("홍길동");
		System.out.println("\t홍길동 " + score);
		System.out.println();
		
		//모든 key값 가져오기
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while(keyInterator.hasNext()) {
			String key = keyInterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println(map.size());
		
		//모든 k,v(Map.entry) 가져와서 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry .getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		for(Map.Entry<String, Integer> temp : map.entrySet()){
			String key = temp.getKey();
			Integer value = temp.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		
		System.out.println();
		
		map.clear();
		
		System.out.println("총 entry 수 : " + map.size());
	}
}
