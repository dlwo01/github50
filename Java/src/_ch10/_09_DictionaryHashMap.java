package _ch10;
import java.util.*;

public class _09_DictionaryHashMap {
	public static void main(String[] args) {
		// 영어사전 작성하기.. q나Q일 떄 종료
		/*
		 입력 : word
		 school 학교
		 miracle 기적
		 calendar 달력
		 water 물
		 flower 꽃
		 단어가 있으면 의미 출력, 없으면 없는 단어입니다.
		 */
		Map<String, String>map = new HashMap<String, String>();
		map.put("school", "학교");
		map.put("miracle", "기적");
		map.put("calendar", "달력");
		map.put("water", "물");
		map.put("flower", "꽃");
		
		Scanner word = new Scanner(System.in);
		
		do {
			System.out.println("영어사전");
			String dd = word.next();
			if(map.containsKey(dd)) {
				System.out.println(map.get(dd));
				
			}else {
				System.out.println("존재하지 않는 영어단어 입니다.");
				
				
			}
			System.out.println("q나Q를 입력하면 종료합니다.");
			String end = word.next();
			if(end.equals("q")||end.equals("Q")) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("다시돌고");
			}
			
		}while(true);
		
	}

}
