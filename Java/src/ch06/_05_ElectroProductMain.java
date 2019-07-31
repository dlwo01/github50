package ch06;

public class _05_ElectroProductMain {
	public static void main(String[] args) {

		_05_ElectroProduct ele = new _05_ElectroProduct();
		ele.setBrand("LG");
		ele.CalcPrice(500000);
		ele.printInfo();

		System.out.println();

		_05_ElectroProduct not = new _05_NoteBook("LG",500000,0.01,"그램");
		
		not.printInfo();
		// 다형성 적용으로 상위클래스로(부모)선언 하위클래스(자식)로생성
		// 선언된 부모클래스의 참조변수로 멤버변수나 멤버메소드 접근
		// 메모리에는 하위클래스(자식)가 생성된다.
	}
	}

	// 매개변수 생성자로 생성안했다.
	// 다형성적용으로 생성안했다.
	// 많은 오타.
	

	/*
ElectroProduct() 기본생성자 출력)
브랜드LG가격500000

NoteBook() 매개변수 생성자 출력)
브랜드: LG 가격: 500000모델명: 그램세일가격: 450000
*/


		
				