package 복습;

public class _34_ForEX {
	public static void main(String[] args) {
		
		String str = "no pani no gain";// o가 몇개가 나오는지 구한다
		int count = 0;
		
		// str 문자열 중에서 'o'가 나오면 count를 증가시킨다.
		// str 길이, 문장에서 발견된 o의갯수
		for(int i=0; i<str.length(); i++) { //<=해버리면 0~15까지 여서 16이 된다 그래서 <이렇게 해야함
			
			if(str.charAt(i) != 'o') {
				continue; // 반복문에서 조건이 만족하지 않으면 아래 문장을 스킵하고, for문으로 올라거서 계속 반복한다.
			}
			count++;
			}
		System.out.println("str의 길이: " + str.length());
		System.out.println("문장에서 발견된 'o'의 갯수" + count);
	}
	
}
//str의 길이 : 15
//문장에서 발견된 'o'의 갯수2

/*str의 길이: 15
문장에서 발견된 'o'의 갯수2
 */


