package 복습2;
import java.util.*;
public class _08_sdf {
	public static void main(String[] args) {
		Map<String ,String> map = new HashMap<String, String>();
		map.put("park", "park1234");
		map.put("kim", "kim1234");
		map.put("lee", "lee1234");
		map.put("son", "son1234");
		map.put("yang", "yang1234");
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("아이디를 입력하시오");
			String id = input.next();
			if(map.containsKey(id)) {
				System.out.println("비밀번호를 입력하시오");
				String pwd = input.next();
			if(map.get(id).equals(pwd)) {
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("비밀번호가 다릅니다.");
			}
		
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			System.out.println("Q나q를 입력하면 종료합니다.");
			String end = input.next();
			if(end.equals("q")||end.equals("Q")) {
				System.out.println("끝내시오");
				break;
			}
			else{
				System.out.println("다시돌고_");
			}
					
			
		}while(true);
			
		
	}

}
