package com.yedam.java.ch01;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/Temp/test1.db");
		
		byte a =10;
		byte b = 20;
		byte c =30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		byte[] byteAray = {40,50,60};
		os.write(byteAray);
		
		os.flush();
		os.close();
		
		
		Writer writer = new FileWriter("c:/Temp/test2.txt");
		
		char ca ='A';
		char cb ='B';
		
		writer.write(ca);
		writer.write(cb);
		
		char[] charAray = {'C' ,'D', 'E'};
		writer.write(charAray, 1, 2);
		
		String str = "\nHello World!";
		writer.write(str);
		
		writer.flush();
		writer.close();
		
		
		
		
		
	}
}
