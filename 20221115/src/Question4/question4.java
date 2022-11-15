package Question4;

public class question4 {
	public static void main(String[] args) {
		int boy = 0;
		int girl = 0;
		String[] arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		for(int i =0; i < 5; i++) {
			  char human = arr[i].charAt(7);
			  switch (human) {
			  case '1':
			  case '3':
				  boy++;
				  break;
			  case '2':
			  case '4':
				  girl++;
				  break;
			  }
				  
		}System.out.println("남 "+boy +" 여 " + girl);
	}
	
}
