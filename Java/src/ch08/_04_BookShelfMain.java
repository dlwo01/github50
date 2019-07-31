package ch08;

public class _04_BookShelfMain {
	public static void main(String[] args) {
		// 다형성
		_04_QueueImpl q = new _04_BookShelf();
		q.euQueue("풋살하고싶다");
		q.euQueue("하지만 공부해야지");
		q.euQueue("평일은 참자");
		
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
		
		
	}

}
