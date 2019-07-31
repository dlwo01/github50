package ch13;

public class _01_StringEx {
	public static void main(String[] args) {
		String proverb = "A Barking dog";  // 리터럴 상수풀에 저장된다.
		String s1 ,s2 ,s3, s4;
		
		//문자열 길이 : length()
		System.out.println("문자열 길이 :" + proverb.length());
		
		//문자열 결함 : concat()
		s1 = proverb.concat(" naver Bites!!");
		System.out.println("s1 :" + s1);
		
		
		//문자열 교환 : replace(oldChar, newChar)
		s2 = s1.replace('B', 'b');
		System.out.println("s2 :" + s2);
		
		// 부분문자열 : substring(beginIndex,endIndex)
		s3 = s2.substring(14, 19);
		System.out.println("s3 :" + s3);
		
		// 대문자로 변경 : toUpperCase()
		s4 = proverb.toUpperCase();
		System.out.println("s4 :" + s4);
	}

}
