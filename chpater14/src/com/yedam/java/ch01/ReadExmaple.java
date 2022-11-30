package com.yedam.java.ch01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReadExmaple {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/Temp/test1.db");
		
		while(true){
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
		System.out.println();
		
		is.close();
		
		is = new FileInputStream("c:/Temp/test1.db");
		byte[] buffer = new byte[100];
		while(true) {
			int readByteNum = is.read(buffer);
			if(readByteNum == -1)break;
			for(int i =0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
		
		System.out.println();
		
		Reader reader = new FileReader("C:/Temp/test2.txt");
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.print((char)data);
		}
		reader.close();
		
		System.out.println();
		
		reader = new FileReader("C:/Temp/test2.txt");
		
		char[] charBuffer = new char[100];
		while(true) {
			int readCharNum = reader.read(charBuffer);
			if(readCharNum == -1) break;
			for(int i=0; i < readCharNum; i++) {
				System.out.print(charBuffer[i]);
			}
		}
		reader.close();
	}
}
