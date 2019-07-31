package ch06;

public class _03_Employee {
	private int sabun; // 사번
	private String name; // 이름
	private String deptName;//부서명
	private int salary; // 급여
	
	
	public _03_Employee() {}
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
		
	}
	public int getSabun() {
		return sabun;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
		
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
		
	}
	public String getDeptName() {
		return deptName;
		
	}
	public void setSalary(int salary) {
		this.salary = salary;
				
	}
	public int getSalary() {
		return salary;
		
	}
	public void printInfo() {
		System.out.println("사변 :" + sabun);
		System.out.println("이름 :" + name);
		System.out.println("부서명 :" + deptName);
		System.out.println("급여 :" + salary);
		
	}
	
	

}
