package test;

public class _Manager extends _Emloyee {
		int bonus;
		int salary;

		public _Manager() {}
		
		public int salary(int bonus){
		salary = super.basicSalary + bonus;
		return salary;

		}
		@Override
		
		public void printInfo() {
			System.out.println("사번 :" + sabun + " 이름 :" + name + " 부서명 " + deptName + " 기본급 :" + basicSalary + " 급여 " + salary);
			
		}


}
