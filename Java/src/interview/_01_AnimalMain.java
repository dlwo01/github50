package interview;

public class _01_AnimalMain {
	public static void main(String[] args) {
		/*
		 * 면접에 많이 나옴
		 * 상속 : 자식클래스 extends 부모클래스{}
		 * -extends : 확장(파생)의 의미
		 * - 부모클래스의 멤버변수와 메소드를 마치 자기것처럼 사용할 수 있다.
		 * - 공통으로 사용하는 변수와 메소드를 부모클래스에서 정의한다.
		 * - 부모클래스는 일반적이고, 자식클래스는 구체적이다.
		 * - 사용이유 : 부모클래스의 멤버변수와 메소드를 재사용
		 *            중복되는 코드를 줄임으로서 손쉽게 개발, 유지보수 가능
		 * - 부모클래스의 멤버를 private으로 선언한 경우, 자식클래스에서 접근할 수 없다.
		 * 			protected의 경우 자식클래서에서 접근 가능            
		 */
		
		_01_Cat cat = new _01_Cat();
		cat.cry();
		cat.kind = "고양이";
		cat.legs = 4;
		
		cat.eat();
		cat.sleep();
		cat.play();
		cat.print();
		
		System.out.println();
		
		
		_01_Dog dog = new _01_Dog();
		dog.bark();
		dog.kind = "강아지";
		dog.legs = 4;
		dog.eat();
		dog.play();
		dog.sleep();
		dog.print();
		
	}
	
	

}
