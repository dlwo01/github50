package ch10;
import java.util.*; 
public class _10_HashMapEx {
	public static void main(String[] args) {
		String[] sample = {"apple" , "watermelon" ,"mango" , "banana" ,"cherry","apple","grape","banana","apple"};
		// Map 선언 및 생성
		Map<String , Integer> map = new HashMap<String, Integer>();
		//방법1)
		for(String str : sample) {
			Integer freq = map.get(str);
			System.out.println("freq :" + freq); // Integer는 클래스이므로 초기값이 null
			map.put(str, (freq==null) ? 1 : freq + 1); // 중복안된 단어는 null이므로 1, 중복단어는 freq  + 1증가
		}
		System.out.println("단어개수 :" + map.size());
		System.out.println(map.containsKey("apple"));
		// map.toString();
		System.out.println(map);
		System.out.println("==================");
		
		
		
		//방법2)
		for(int i = 0 ; i < sample.length; i++) {//{banana=2, apple=3, cherry=1, watermelon=1, grape=1, mango=1}
			if(!(map.containsKey(sample[i]))) {
				map.put(sample[i], 1);
			}else {
				map.put(sample[i], map.get(sample[i]) + 1);
			}
			
		}
		Iterator <String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " : " + map.get(key));
					
		}
		// banana 개수 출력
		
		
		// apple 개수 출력
		//map출력
	}

}
