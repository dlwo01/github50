package test;
import java.util.*;
public class _415_BankHashMap {
	private Map<Integer, _415_Bank> hashmap;
	//기본생성자
		public _415_BankHashMap() {
			hashmap = new HashMap<Integer, _415_Bank>();
		}
	//추가
		public void addBN(_415_Bank nember){
			hashmap.put(nember.getBankNO(),nember);
		}
	//삭제
		public boolean removeBN(int bankNO){
			if(hashmap.containsKey(bankNO)){
				hashmap.remove(bankNO);
				return true;
		}
			System.out.println(bankNO + "가 존재하지 않습니다");
			return false;
		}
		
	//출력
		public void getBankInfo() {
		Iterator<Integer> iterator = hashmap.keySet().iterator();
		while(iterator.hasNext()){
			int key = iterator.next();
			_415_Bank number = hashmap.get(key);
			System.out.println(number);
		}
		System.out.println();
	
		}
}