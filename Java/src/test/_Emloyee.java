package test;

public class _Emloyee {int sabun;
	String name;
	String deptName;
	int basicSalary; // 기본급


	public _Emloyee () {
		this.deptName = "인사";
		this.basicSalary = 10000;
	}


	public void setSabun(int sabun){
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
	public void setDeptName(String Name) {
		this.deptName = deptName;

	}
	public String getDeptName() {
		return deptName;

	}
	public void setBasicSalary(int basicsalary) {
		this.basicSalary = basicSalary;

	}
	public int getBasicSalary() {
		return basicSalary;
	}

		public void printInfo() {
		System.out.println("사번 :" + sabun +" 이름 : " + name + " 부서명" + deptName + " 기본급:" + basicSalary + " 수당 :"); 
		}

	

}
