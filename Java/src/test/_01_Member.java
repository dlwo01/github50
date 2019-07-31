package test;

public class _01_Member {
	// 클래스 디지인 객체 힙메모리공간
	// 참조변수에 멤버변수,멤버메소드가들어있음
	// 참조변수는 주소값

	String name;
	int height;
	double weight;
	int age;
	char gender;
	boolean married;

	public  _01_Member(){}

	public void showMemberInfo( ) {

	System.out.println("name :" + name);
	System.out.println("heigth :" + height);
	System.out.println("weight :" + weight);
	if(age<=19) {
		System.out.println("미성년자이므로 술,담배금함");
	}else {
		System.out.println("성ㅇ인이므로 가능");
	}
	if(gender=='M') {
		System.out.println("남성");
	}else{
		System.out.println("여성");
	}
	if(married==true) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}