package ch07;

public class _03_Main {
	public static void main(String[] args) {
		_03_Cumputer cum = new _03_DeskTop();
		cum.display();
		cum.typing();
		cum.turnOn();
		cum.turnOff();
		
		System.out.println("****-----/////////===---00");
		
		_03_Cumputer nt = new _03_MyNoteBook();
		nt.display();
		nt.typing();
		nt.turnOn();
		nt.turnOff();
				
	}

}
