package ch13;
import java.util.*;

public class _03_Main {
	public static void main(String[] args) {
		_03_Enum cat = new _03_Enum(Animal.CAT,"냐옹이");
		_03_Enum dog = new _03_Enum(Animal.DOG,"가디");
		_03_Enum fish = new _03_Enum(Animal.FISH,"잉어킹");
		
		
		// 리스트에 담는다.
		List<_03_Enum> ani = new ArrayList<_03_Enum>();
		ani.add(cat);
		ani.add(dog);
		ani.add(fish);
		
		
		// 향상된 for문
		for(_03_Enum en : ani) {
			System.out.println(ani);
		}
		
	}
}
