package ch07;

public class _02_SubCalculator extends _02_Calculator {

	@Override
	//body{}가 있기때문에 abstract가 빠져있음
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public void subtract(int a, int b) {
		System.out.println(a-b);
	}

	@Override
	public double average(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i ++ ) {
			
			sum += arr[i];
			
		}
		return sum / arr.length;
	}

}
