package Qusetion3;

public class RpgGame implements Keypad {
	int currentMode;
	
	public RpgGame(int currentMode){
		this.currentMode = currentMode;
		System.out.println("RPGgame 실행");
	}
	@Override
	public  void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");

	}

	@Override
	public  void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");

	}

	@Override
	public  void rightUpButton() {
		
		if(NORMAL_MODE == currentMode) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}else if(HARD_MODE == currentMode) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
		
	}

	@Override
	public  void rightDownButton() {
		if(NORMAL_MODE == currentMode) {
			System.out.println("캐릭터가 일반 공격");
		}else if(HARD_MODE == currentMode) {
			System.out.println("캐릭터가 HIT 공격");
		}

	}

	@Override
	public  void changeMode() {
		switch(currentMode){
		case 0:
			currentMode = HARD_MODE;
			System.out.println("현재 모드 : " + "HARD_MODE");
			break; 
		case 1:
			currentMode = NORMAL_MODE;
			System.out.println("현재 모드 : " + "NORMAL_MODE");
			break;
		}

	}

}
