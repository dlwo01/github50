package 복습;

import java.util.ArrayList;

public class _54_AnimalTest {//1
	ArrayList<_54_Animal> aniList = new ArrayList<_54_Animal>();
	
	public static void main(String[] args) {//4
		_54_AnimalTest aTest = new _54_AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운캐스팅");
		aTest.testCasting();
		
	}
	

	public void addAnimal() {//2
		// add() : ArrayList에 추가
		aniList.add(new _54_Human());
		aniList.add(new _54_Tiger());
		aniList.add(new _54_Eagle());
		// add가 빨개지면 해당 자식클래스에서 상속이 되어있는지 확인
		
		//향상된 for문
		for(_54_Animal animal : aniList) {
			animal.move(); // 오버라이드에 의해서 자식메소드 move() 호출
			// 출력결과
			// 사람이 두발로 걷습니다.
			// 호랑이가 네발로 뜁니다.
			// 독수리가 하늘을 납니다.
		}
		
	}
	public void testCasting() {//3
		for(int i =0; i < aniList.size(); i++) {
			// get() : ArrayList에서 가져옴
			_54_Animal animal = aniList.get(i);// new _54_Humun();// 다형성적용
			if(animal instanceof _54_Human) {// animal이 _54_Humun 타입인지 확인
				_54_Human hum = (_54_Human)animal;
				hum.readBook();
			}else if(animal instanceof _54_Tiger) {
				_54_Tiger ti = (_54_Tiger)animal;
				ti.hunting();
			}else if(animal instanceof _54_Eagle) {
				_54_Eagle ea = (_54_Eagle)animal;
				ea.flying();
			}
			else {
				System.out.println("지원되지 않는 형입니다.");
				
			}
			}
	}
}
/*
사람이 책을 읽습니다.
호랑이는 사냥을 합니다.
독수리가 날개를 쭉 펴고 날아갑니다.
*/