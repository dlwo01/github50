package interview;

public class _03_Manager extends _03_Employee {
	private int bonus;
	
	public _03_Manager() {
		
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
		//이렇게 해도 됌
	
	}

}
