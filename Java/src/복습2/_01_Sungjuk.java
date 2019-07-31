package 복습2;

public class _01_Sungjuk {
	//멤버변수
	private int kor;
	private int eng;
	private int math;
	
	//생성자
	public _01_Sungjuk() {}
	
	//매개변수 생성자
	public _01_Sungjuk(int kor,int eng,int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	//getter,setter
	}
	
	public void setKor(int kor) {
		this.kor = kor;
				
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
		
	}
	public int getEng() {
		return eng;
		
	}
	public void setMath(int math) {
		this.math = math;
		
	}
	public int getMath() {
		return math;
		
	}
	public int getTotal() {
		return kor+eng+math;
		
	}
	public double getAvg() {
		return (double)getTotal()/3;
		
	}
	public char getGrade() {
		char grade = ' ';
		switch((int)getAvg()/10) {
		case 10 :
		case 9 : grade = 'A';
			break;
		case 8 : grade = 'B';
			break;
		case 7 : grade = 'C';
			break;
		case 6 : grade = 'D';
			break;
		default  : grade = 'F';
		}
		return grade;
	}
	public void printInfo() {
		System.out.println("국어점수는" + getKor() +"입니다");
		System.out.println("영어점수는" + getEng() + "입니다");
		System.out.println("수학점수는" + getMath()+ "입니다");
		System.out.println("총점은" + getTotal() + "입니다");
		System.out.printf("평균은 %.2f 입니다 \n",getAvg());//printf는 식을 이렇게 써야함
		System.out.println(); // 위에\n을 하면  줄바꿈이 필요없다
		System.out.println("학점은" +getGrade() + "입니다");
	}
			
		
		
		
	}
	
	
	


