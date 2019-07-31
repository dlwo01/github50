package _ch10;

import java.util.*;

public class _08_LoginHashMap {
	public static void main(String[] args) {
		/*
		 * *중요*
		 * 1. id , pwd 5건을 hashtable에 저장(HashMap에 저장)
		 * 2. 콘솔로부터 id,pwd를 입력받는다(로그인)
		 * 		1과2를 비교해서
		 * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다."출력
		 * 4. 아이디가 있으면 비밀번호와 비교해서 일치시"로그인되었습니다." 출력
		 * 								불일치시"비밀번호가 일치하지 않습니다."출력
		 * 5.q또는Q면 종료
		 */
		Map<String, String> map = new HashMap<String, String>();

		map.put("park", "park1234");
		map.put("kim", "kim1234");
		map.put("lee", "lee1234");
		map.put("son", "son1234");
		map.put("yang", "yang1234");
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("아이디 입력 :");
			String id = input.next();
			if(map.containsKey(id)){
				System.out.println("비밀번호 입력 :");
				String pwd = input.next();
			if(map.get(id).equals(pwd)) {
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("비밀번호가 틀립니다.");
			}
				
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			System.out.println("q나Q를 입력하면 종료합니다.");
			String end = input.next();
			
			if(end.equals("q")||end.equals("Q")) {
				System.out.println("끝내시오");
				break;
			}else {
				System.out.println("다시돌고");
			}
		}while(true);
	}

}
