package ch06;

import java.util.ArrayList;

public class _07_AninalTest {
	ArrayList<_07_Animal> aniList = new ArrayList<_07_Animal>();
	
	
	public static void main(String[] args) {
		_07_AninalTest aTest = new _07_AninalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운캐스팅");
		aTest.testCasting();
	
	}
	
	public void addAnimal() {// 
		// add() : ArrayList에 추가
		aniList.add(new _07_Human());
		aniList.add(new _07_Tiger());
		aniList.add(new _07_Eagle());
		
		//향상된 for문
		for(_07_Animal animal : aniList) {
			animal.move(); // 오버라이드에 의해서 자식메소드 move() 호출
			// 출력결과
			// 사람이 두발로 걷습니다.
			// 호랑이가 네발로 뜁니다
			// 독수리가 하늘을 납니다
		}
	}
	
	public void testCasting() {
		for(int i =0; i< aniList.size(); i++) {
			// get() : ArrayList에서 가져옴
			_07_Animal animal = aniList.get(i); // new _07_Humun(); // 다형성적용
			if(animal instanceof _07_Human) {// animal이 _07_Human 타입인지 확인
				 _07_Human hum = (_07_Human)animal;
				 hum.readBook();
			}else if(animal instanceof _07_Tiger) {
				_07_Tiger ti = (_07_Tiger)animal;
				ti.hunting();
			}else if(animal instanceof _07_Eagle) {
				_07_Eagle ea = (_07_Eagle)animal;
				ea.flying();
		}
		else {
			System.out.println("지원되지 않는 형입니다.");
		}
			/*
				사람이 책을 읽습니다.
				호랑이가 사냥을 합니다.
				독수리가 날개를 쭉 펴고 멀리 날아갑니다.
			 */
		}
		
	}

}
