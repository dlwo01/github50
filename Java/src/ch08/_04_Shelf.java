package ch08;

import java.util.ArrayList;

// 부모클래스
public class _04_Shelf {
	protected ArrayList<String> shelf; // 자료 순서대로 저장할 ArrayList 선언
	
	//기본생성자
	public _04_Shelf() {
		shelf = new ArrayList<String>();
		
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}
