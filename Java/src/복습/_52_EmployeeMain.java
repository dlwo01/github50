package 복습;

public class _52_EmployeeMain {
	public static void main(String[] args) {
		
	
		_52_Sawon saw = new _52_Sawon();
		saw.setSabun(10001);
		saw.setName("이재동");
		saw.setDeptName("인사");
		saw.setSalary(10000);
		saw.setSudang(1000);
		saw.printInfo();
		
		System.out.println();
		
		
		_52_Manager man = new _52_Manager();
		
		man.setSabun(100001);
		man.setName("이경재");
		man.setDeptName("경리");
		man.setSalary(1000000);
		man.setBonus(100);
		man.printInfo();
	
	}
}
/*
 사번 :0
이름 :이재동
부서명 :인사
급여 :10000
수당 :1000

사번 :0
이름 :이경재
부서명 :경리
급여 :1000000
보너스 :100
*/
