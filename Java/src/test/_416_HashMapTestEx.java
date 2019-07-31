package test;

import java.util.*;

public class _416_HashMapTestEx {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("hong@naver.com","hong123");
		map.put("lee@korea.com","lee123");
		map.put("park@daum.com","park123");
		map.put("choi@gmail.com","choi123");
		map.put("kim@nate.com","kim123");

		Scanner input = new Scanner(System.in);

		do{
			System.out.println("아이디 입력");
			String id = input.next();
			if(map.containsKey(id)){
				System.out.println("비밀번호입력");
				String pw = input.next();
			if(map.get(id).equals(pw)){
				System.out.println("로그인되었습니다.");
			}else{
				System.out.println("비밀번호가 다릅니다");
			}
			}
			else {
				System.out.println("존재하지 않는 아이디 입니다.");
			}
			
			System.out.println("q나Q를 입력하면 종료합니다.");
			String end = input.next();
			
			if(end.equals("q")||end.equals("Q")){
				System.out.println("종료합니다");
				break;
			}else{
				System.out.println("다시입력");
			}
		}while(true);
		
	}
}

// 오타 좀 있었습니다
//90