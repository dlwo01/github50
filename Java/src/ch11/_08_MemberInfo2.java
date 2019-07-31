package ch11;

public class _08_MemberInfo2 {
	//멤버변수
	private String name;
	private int age;
	
	
	//기본생성자
	public _08_MemberInfo2() {}
	
	//매개변수 생성자
	public _08_MemberInfo2(String name,int age) {
		this.name = name;
		this.age =age;
	}
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showMemberInfo() {
		System.out.println("이름 :" + name + "\n나이 :" + age); // 이름 , 나이 출력
	}

}
