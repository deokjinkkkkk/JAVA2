package com.yedam.java.ch0601;

public class Shoes {
	static int totalCount;
	int running;
	int slipper;
	int mule ;
	
	void makeRunning() {
		running += 1;
	}
	void makeSlliper() {
		slipper += 1;
	}
	void makeMule() {
		mule += 1;
	}
	
	void getCount() {
		totalCount =  running + slipper + mule;
	}
}
