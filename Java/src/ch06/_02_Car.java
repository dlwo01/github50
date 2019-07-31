package ch06;

public class _02_Car {
	private String kind;
	private int speed;
	
	public _02_Car () {}
	
	public void setKind(String kind) {
		this.kind = kind;
		
	}
	public String getKind() {
		return kind;
		
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	public int getSpeed() {
		return speed;
		
	}
	public void printInfo() {
		System.out.println("kind :" + kind + " , " + "speed" + speed);
	}
	

}
