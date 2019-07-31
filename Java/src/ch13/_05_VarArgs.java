package ch13;

public class _05_VarArgs {
	public void callArg(String ...str) {
		// 출력
		
		for(int i =0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
		for(String s : str) {
			System.out.print(s + " ");
		}
		
		System.out.println();
	}
	
	public void callArg2(String name, int ...score){
		System.out.println(name + " ");
		for(int s : score) {
			System.out.print(s + " ");
		}
		
	}

}
