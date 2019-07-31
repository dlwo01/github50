package ch06;

public class _06_AnimalMain {
	public static void main(String[] args) {
		// 다용성적용
		//부모클래스 참조변수 = new 자식클래스();
		_06_Animal ani = new _06_Animal();
		//오버라이드에 의해 자식 메소드_06_Animal()의 move()호출
		ani.move();
		
		_06_Animal ani1 = new _06_Human();
			ani1.move();
		
		
		_06_Animal ani2 = new _06_Tiger();
			ani2.move();
		
		_06_Animal ani3 = new _06_Eagle();
			ani3.move();
				
	}

}
/*
동물이 움직입니다
사람이 두발로 걷습니다.
호랑이가 네발로 뜁니다
독수리가 하늘을 납니다
*/
//

