package ch10;
import java.util.*;
public class _05_LoginHashMap2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();

		map.put("park", "park1234");
		map.put("kim", "kim1234");
		map.put("lee", "lee1234");
		map.put("son", "son1234");
		map.put("yang", "yang1234");
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("아이디를 입력하시오 :");
			String id = input.next();
			if(id.equals("Q")||id.equals("q")) {
				System.out.println("종료합니다");
				break;
			}
		
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}else {
				do {
					System.out.println("비밀번호를 입력하시오 :");
					String pwd = input.next();
					
					//hashMap.get(id) : key에 해당하는 비밀번호를 가져온다.
					//가져온 비밀번호.equals(입력받은 비밀번호)...equals는 값비교
					// 가져온 비밀번호 == 입력받은 비밀번호 ... 주소값 비교
					if(!map.get(id).equals(pwd)) {
						System.out.println("비밀번호가 일치하지 않습니다");
					}else {
						System.out.println("로그인성공");
						break;
					}
				
				}while(true);
					break;
					
				}
				while(true);
				break;
		
		}
			
	
	
	
}


