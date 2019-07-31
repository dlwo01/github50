package test;
public class _sawon extends _Emloyee {
	int salary;
	int sudang;
	
	public _sawon() {}

	public int salary(int sudang) {
	salary = super.basicSalary + sudang;
	return salary;
	}


	@Override
	public void printInfo() {
		System.out.println("사번 :" + sabun +" 이름 : " + name + " 부서명" + deptName + " 기본급:" + basicSalary + " 급여" + salary);
	

	
	
	}
}



