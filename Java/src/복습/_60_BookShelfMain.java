package 복습;

public class _60_BookShelfMain {
	public static void main(String[] args) {
		//다형성
		_60_QueueImpl q = new _60_BookShelf();
		q.euQueue("풋살하고싶다");
		q.euQueue("공부하자");
		q.euQueue("주말빨리와라");
		
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}
/*
풋살하고싶다
공부하자
주말빨리와라
*/