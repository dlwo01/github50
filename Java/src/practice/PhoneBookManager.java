package practice;
import java.util.*;



public class PhoneBookManager {
	Map<String,PhoneInfo> map;
	
	
	public PhoneBookManager() {
		map = new HashMap<String,PhoneInfo>();
		
	}
	//입력
	public void inputData(PhoneInfo pi) {
		System.out.println("회원정보입력");
		map.put(pi.getName(), pi);
		
		
		
	}
	
	//삭제
	public boolean deleteData(String name) {
		if(map.containsKey(name)) {
			map.remove(name);
			return true;
		}
		System.out.println(name + "님이 존재하지 않습니다.");
		return false;
		
	}
	//검색
	public void searchData(String name) {
		Iterator<String>iterator = map.keySet().iterator();
		while(iterator.hasNext());
			String key = iterator.next();
			PhoneInfo phi = map.get(key);
			System.out.println(phi);
			}
	
	//종료
	
	

}
