package 복습;

public class _24_ForEx {
	public static void main(String[] args) {
		int dan =2;
		
		while(dan <= 9) {
			System.out.println("-------");
			System.out.println("***" + dan + "단***");
			System.out.println("-------");
			int i = 1;
			while(i <= 9) {
				i++;
				System.out.println(dan + " * " + i + " = " + (dan*i));
				
			}
			System.out.println("-------");
			dan++;
		}
	}
}
		