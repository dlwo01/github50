package 복습;

public class _06_TypeCasting {
	public static void main(String[] orgs) {
		/*
		 * 형변환 -1 p64
		 * 1. 자동적인 형변환(확대 형변환, 묵시적 형변환)
		 * 	데이터가 손실되지 않거나, 손실이 제한적인 범위내에서 묵시적으로 형변환한다.
		 * 	자료형이 다른 변수에 값을 할당하는 경우 형변환 생각할 수 있다.
		 * 
		 * 	데이터 큰 타입 = 데이터 작은 타입; (예 : float f + 10 // f에 10.0이 대입)
		 * 	자료형이 다른 값을 연산하는 경우; (예 : double d = 10.0 + 20; // d = 10.0 + 20.0)
		 * 
		 * 	2. 강제적인 형 변환(축소 형변환, 명식적 형변환)
		 * 	 명시적으로 형변환하는 것을 캐스팅(Casting)이라고 한다.
		 * 	Casting은 생략할 수 없으며, 생략시 컴파일 에러가 발생하므로 반드시 명시적으로 형변환해야 한다.
		 *  
		 *  
		 *  
		 *   데이터 작은 타입 = (작은타입)데이터 큰타입;
		 *   
		*/
	
	System.out.println("형변환-1 예제===");
	
	int j = (int) 10.9; // 강제 형변환 = int j = 10.9;-> int j = (int) 10.9;
	System.out.println("j : " + j);// 강제 형변환(축소 형변환) : 데이터 작은 타입 = (작은타입)데이터 큰타입;
	
	double d = 10;
	System.out.println("d : " + d);// 자동 형변환(확대 형변환) : 데이터가 큰 타입 = 데이터 작은 타입;
	
	float f = 20.5f + 10; // 20.f + 10.0f
	System.out.println("f : " + f);// f : 30.5
	/*
	 * 형변환-2
	 * 3. int(4바이트)보다 크기가 작은 자료형은 int형으로 형변환후 게산
	 * 예)byte + short -> int + int
	 * 
	 * 4. 두개의 피연산자 중 표현범위가 큰 쪽으로 맞춰서 형변환 후 게산
	 */
	
	System.out.println("=== 형변환-2 예제");
	
	int ii ;
	double ff;
	
	ff = 5 / 4; //자동형변환(double = int; //double =1;)
	System.out.println("ff : " + ff);// ff : 1.0
	
	ff = (double) 5 / 4; // 4번적용.. double / int -> double -> 5.0 / 4.0 ->1.25
	System.out.println("ff : " + ff);
	
	ii = (int) (2.5 + 3.3); // 형변환보다 ()안에 계산이 우선.. ii = (int)(5.8);
	System.out.println("ii : "+ ii);
	
	//ii = (int)2.5 +3.3; //-> 컴파일에러.. 앞에는 인트형이고 뒤에는 더블형이여서 위에나 아래로 바꿔줘야함
	ii = (int)2.5 +(int)3.3; //  형변환이 우선이며, 형변환후 계산
	System.out.println("ii : "+ ii );
	
	int gg = 1000000;
	int hh = 2000000;
	long ll = 2000000L;
	
	int c1 = gg * hh;
	System.out.println("c1 : " + c1); // c1 : -14547459936 // int형 범위(-21억~21억)
	
	long c2 = gg * hh; // long형에 대입하기 전부터 int형 초과
	System.out.println("c2 : "+ c2);// c2 : -1454759936
	
	long c3 = gg * hh;// long형으로 형변환하기 전부터 int형 ㅊ과
	System.out.println("c3 : "+ c3 );// c2 : -1454759936
	
	long c4 = (long)gg * hh; //long * int -> long * long -> long
	System.out.println("c4 : + " + c4);// c4 : 2000000000000
	
	long c5 = gg * ll;
	System.out.println("c5 : " + c5);
	
	
	
	
	
	
	
	
	
	}

}
