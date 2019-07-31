package ch05;



public class _03_ArrayEx {
	public static void main(String[] arsg) {
		
		char[] alphabets = new char[26];
		char ch = 'A'; // A,65 B,66
		
		alphabets[0] = 'A';
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = (char)(65+i);
			System.out.println(alphabets[i] + " : " +(int)alphabets[i]);
			
		}
		
	}

}
