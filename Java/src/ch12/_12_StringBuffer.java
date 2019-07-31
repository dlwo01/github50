package ch12;

public class _12_StringBuffer {
	public static void main(String[] args) {
		/*
		 * StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.
		 * - 추가 : append()
		 * - 삽입 : insert(시작위치, 문자열) : 특정위치에 원하는 문자열을 삽입한다.
		 * - substring(시작위치. 끝위치) : 시작위치에서 끝위치 -1 까지의 문자열을 추출한다. 공백포함
		 * 								인덱스는 0부터 시작하며, < 끝위치(보다 작다)
		 * - toString() : 메소드를 이용해서 String 자료형으로 변경한다
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("절박함이");
		sb.append("기적을");
		sb.append("만든다.");
		
		
		
		System.out.println("sb :" + sb);
		System.out.println("sb :" +sb.toString());
		
		sb.insert(0, "개같은");
		System.out.println("sb :" + sb);
		
		//절박함
		
		System.out.println(sb.substring(3, 6));
		
		//기적
		System.out.println(sb.substring(7, 9));
	}	

}
