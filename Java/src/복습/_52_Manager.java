package 복습;

public class _52_Manager extends _52_Employee {
	private int bonus;
	
	public _52_Manager() {
		
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
		
	}
	public int getBonus() {
		return bonus;
		
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 :" + getBonus());
	}

}
