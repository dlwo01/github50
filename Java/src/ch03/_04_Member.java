package ch03;

public class _04_Member {
	// 멤버변수
	// name
	// hobby
	// salary
	// email
	
	private String name;
	private String hobby;
	private String salary;
	private String email;
	
	public _04_Member( ) {
		System.out.println("기본생성자 출력");
	}
	
	
	
	public _04_Member(String name,String hobby,String salary,String email) {
		this.name=name;
		this.hobby=hobby;
		this.salary=salary;
		this.email=email;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
		
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
		
	}
	public String getHobby() {
		return hobby;
		
	}
	public void setSalary(String salary) {
		this.salary = salary;
		
	}
	public String getSalary() {
		return salary;
		
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public String getEmail() {
		return email;
		
	}
	
	
	public void printInfo() {
		System.out.println("name :" + getName());
		System.out.println("hobby :" + getHobby()  +",똥싸기" + ",디비자기");
		System.out.println("salary :" + getSalary());
		System.out.println("email :" + getEmail());
		
	}
}
