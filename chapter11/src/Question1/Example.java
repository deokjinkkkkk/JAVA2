package Question1;

public class Example {
	public static void main(String[] args) {
		Keypad keypad = new RpgGame(0);
		keypad.leftUpButton();
		keypad.rightUpButton();
		keypad.changeMode();
		keypad.rightUpButton();
		keypad.rightDownButton();
		keypad.changeMode();
		keypad.rightDownButton();
		System.out.println("===============");
		keypad = new ArcadeGame(0);
		keypad.leftUpButton();
		keypad.rightUpButton();
		keypad.leftDownButton();
		keypad.changeMode();
		keypad.rightUpButton();
		keypad.leftUpButton();
		keypad.rightDownButton();
	}
}
