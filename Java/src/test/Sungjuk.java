package test;

public class Sungjuk {

	int java;
	int jsp;
	int spring;

	public Sungjuk() {}


	public Sungjuk(int java, int jsp, int spring) {
		System.out.println("매개변수 생성자 출력");
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
	}
	public void setJava(int java) {
		this.java = java;

	}
	public int getJava() {
		return java;

	}
	public void setJsp(int jsp) {
		this.jsp = jsp;

	}
	public int getJsp() {
		return jsp;

	}
	public void setSpring(int spring) {
		this.spring=spring;

	}
	public int getSpring() {
		return spring;

	}
	public int getTotal() {
		return java + jsp + spring;

	}
	public double getAvg() {
		return (double)getTotal()/3;

	}
	public char getGrd() {
		char grade = ' ';
		switch((int)getAvg()/10){
		case 10 :
		case 9 : grade = 'A';
			break;
		case 8 : grade = 'B';
			break;
		case 7 : grade = 'C';
			break;
		case 6 : grade = 'D';
			break;
		default : grade = 'F';
	}
		return grade;
	}

	public void printSungjukInfo() {

		System.out.println("java : " + getJava() + "입니다.");
		System.out.println("jsp : " + getJsp() + "입니다.");
		System.out.println("spring : " + getSpring() + "입니다.");
		System.out.println("총점은 : " + getTotal() + "입니다.");
		System.out.printf("평균은 %.1f입니다 \n",getAvg());
		System.out.println("학점은 : " + getGrd() + "입니다.");

	// 평균구하는거 f를 안넣어서 틀렸습니다
	// 스펠링 몇개 틀렸습니다
	}

}
