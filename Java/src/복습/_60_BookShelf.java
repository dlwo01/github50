package 복습;

public class _60_BookShelf extends _60_Shelf implements _60_QueueImpl {

	@Override
	public void euQueue(String title) {
		shelf.add(title);  //  배열에 title 추가
		
	}

	@Override
	public String deQueue() {
		
		return shelf.remove(0); // 맨처음 요소를 배열에서 삭제하고 반환
	}

	@Override
	public int getSize() {
		
		return getCount(); // 배열 요소 개수 반환
	}
	

}
