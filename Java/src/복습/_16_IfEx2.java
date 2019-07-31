package 복습;

public class _16_IfEx2 {
	public static void main(String[] args) {
		
		String medal = "Gold";
		//문자열 비교 ==> 변수명.equals("문자열")을 사용
		if(medal.equals("Gold")) { //문자열일때는 ==이 아니고 equals
			System.out.println("금메달입니다.");
		}else if(medal.equals("Silver")) {
			System.out.println("은메달입니다. ");
		}else if(medal.equals("Bronze")) {
			System.out.println("동메달입니다" );
		}else {
			System.out.println("없음");
			}
		System.out.println(medal);
	}

}
//금메달입니다.
//Gold