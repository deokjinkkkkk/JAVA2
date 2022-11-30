package com.yedam.java.ch01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVSBufferExample {
	
	public static void main(String[] args) throws Exception {
		String originalFilePath1
		= NonBufferVSBufferExample.class.getResource("1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		InputStream fis1 = new FileInputStream(originalFilePath1);
		OutputStream fos1 = new FileOutputStream(targetFilePath1);
		
		long nonBufferTime = copy(fis1, fos1);
		System.out.println("버퍼를 사용하지 않았을 때" + nonBufferTime + "ns");
		
		fis1.close();
		fos1.close();
		
		String originalFilePath2
		= NonBufferVSBufferExample.class.getResource("1.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		InputStream fis2 = new FileInputStream(originalFilePath2);
		OutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long bufferTime = copy(bis,bos);
		System.out.println("버퍼를 사용했을 때 " + bufferTime + "ns");
		
		bis.close();
		bos.close();
	}
	
	
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return ( end - start);
				
	}
	
}
