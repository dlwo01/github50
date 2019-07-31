package ch08;

public class _04_BookShelf extends _04_Shelf implements _04_QueueImpl{

	@Override
	public void euQueue(String title) {
		shelf.add(title);		 // 배열에 title 추가
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 맨처음 요소를 배열에서 삭제하고 반환
	}

	@Override
	public int getSize() {
		return getCount();		// 배열 요소 개수 반환 
	}

}
