package test;

public class test2 {

public static void main(String[] args) {


	int dan = 9;
	while(dan >=2) {
		System.out.println("-----------");
		System.out.println("---"+ dan + "단----");
		System.out.println("-----------");
	int k = 1;
	while(k<=9) {
		if(dan % 2 == 1) 
			break;// 짝수값을 구하는 방법
		
		System.out.println(dan + "*" + k + "=" + (dan*k));
		k++;
	}			
			System.out.println("-----------");
			dan--;
}
}
}
		


