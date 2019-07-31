package phonebook;
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
		pi.showphoneInfo();
	}
	//검색
	public boolean searchData(String name) {
		if(map.containsKey(name)){
			PhoneInfo pp = map.get(name);
			pp.showphoneInfo();
			return true;
		}else {
			System.out.println(name + "님이 존재하지 않습니다.");
			return false;
			
		}
		
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
	
	
	//출력
	public void showAllInfo(String name) {
		Iterator<String>iterator = map.keySet().iterator();
		while(iterator.hasNext());
			String key = iterator.next();
			PhoneInfo phi = map.get(key);
			System.out.println(phi);
			}
	
	

}
