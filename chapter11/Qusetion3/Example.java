package Qusetion3;

import java.util.Random;
import java.util.Scanner;





public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Keypad keypad = null;
		
	
			int Game =(int)(Math.random()*2)+1;
			if (Game == 1) {
				keypad = new RpgGame(0);				
			}else {
				keypad = new ArcadeGame(0);	
			}
		
	
		boolean run =true;
		while(run) {		
			System.out.println("============================================================================================");
			System.out.println(" 1.LeftUp | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange| 0.GameChange | 9.EXIT>>");
			System.out.println("============================================================================================");
			System.out.print("choice> ");
			int selectNo = Integer.parseInt(sc.nextLine());	
			
			if(selectNo == 1) {
				keypad .leftUpButton();
			}else if(selectNo == 2) {
				keypad.leftDownButton();
			}else if(selectNo == 3) {
				keypad.rightUpButton();
			}else if(selectNo == 4) {
				keypad.rightDownButton();
			}else if(selectNo == 5) {
				keypad.changeMode();
			}else if(selectNo == 0) {
				if(keypad instanceof RpgGame) {
					keypad = new ArcadeGame(0);
				}else {
					keypad = new RpgGame (0);
				}
			}else if(selectNo == 9) {
				run =false;
			}else {
				System.out.println("번호를 잘못 입력하였습니다.");
			}
		}System.out.println("EXIT");
		
		
	}
}
