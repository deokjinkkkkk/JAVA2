package Qusetion3;

public class ArcadeGame implements Keypad {
	int CurrentMode;
	
	public ArcadeGame(int CurrentMode) {
		this.CurrentMode = CurrentMode;
		System.out.println("Arcadegame 실행");
	}
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
		

	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤족으로 이동한다.");

	}

	@Override
	public void rightUpButton() {
		if(NORMAL_MODE == CurrentMode) {
			System.out.println("캐릭터가 일반 공격");
		}else if(HARD_MODE == CurrentMode) {
			System.out.println("캐릭터가 연속 공격");
		}

	}

	@Override
	public void rightDownButton() {
		if(NORMAL_MODE == CurrentMode) {
			System.out.println("캐릭터가 HIT 공격");
		}else if(HARD_MODE == CurrentMode) {
			System.out.println("캐릭터가 Double HIT 공격");
		}

	}

	@Override
	public void changeMode() {
		switch(CurrentMode){
		case 0:
			CurrentMode = HARD_MODE;
			System.out.println("현재 모드 : " + "HARD_MODE");
			break;
		case 1:
			CurrentMode = NORMAL_MODE;
			System.out.println("현재 모드 : " + "NORMAL_MODE");
			break;
		}

	}

}
