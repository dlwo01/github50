package test;

public class star {
	public static void main(String[] args) {
		
		for(int j= 1; j<=5; j++) {        //j =1 , 통과 / j = 2/통과/j=3
			for(int i = 1; i<= j; i++) {  //i =1 , 통과 */ i=2 /2통과 **/i=3
			
			System.out.print("*");
		}
			System.out.println();	
	}
		for(int r = 1; r<=4; r++) {
			for(int t = 4; t>=r; t--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
}
}