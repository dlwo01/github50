package ch02;

public class _13_WhilEx {
	public static void main(String[] args) {
		//1~10까지 합(1+2+3+4+...10=55)
		int i =1;
		int j =0;
		
		while(i <= 10) {
			
			j += i; //j = i+j
			i++; // i = i + 1;
		
		}
		System.out.print("1부터 10까지의 합은" + j + "입니다");
	}

}
