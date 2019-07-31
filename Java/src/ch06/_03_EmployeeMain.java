package ch06;

public class _03_EmployeeMain {
	public static void main(String[] args) {
		_03_Sawon saw = new _03_Sawon();
		saw.setSabun(25135);
		saw.setName("이재동");
		saw.setDeptName("불편담당부");
		saw.setSalary(151321);
		saw.setSudang(15132);
		saw.printInfo();
		
		System.out.println();
		
		_03_Manager man = new _03_Manager();
		
		man.setSabun(4151);
		man.setName("김건");
		man.setDeptName("이재동 전문 선생님");
		man.setSalary(2000000000);
		man.setBonus(1512);
		man.printInfo();
		
	}

}
