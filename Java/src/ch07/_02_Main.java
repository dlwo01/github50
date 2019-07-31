package ch07;

public class _02_Main {
	public static void main(String[] args) {
		
	//호출, 출력
	_02_Calculator cal = new _02_SubCalculator();
	System.out.println(cal.add(5, 2));
	cal.subtract(5, 5);
	
	int array [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	System.out.println(cal.average(array));
	
	// 자효형을 먼저 선언하고, 따로 초기화하는 경우에는 new int[] 초기화 할 수 없다.
	}

}
