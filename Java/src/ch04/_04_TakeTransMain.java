package ch04;

public class _04_TakeTransMain {
	public static void main(String[] args) {
		_04_Student kim = new _04_Student("김범수",5000);
		_04_Student park = new _04_Student("박효신",10000);
		
		_04_Bus bus100 = new _04_Bus(100); // 버스번호 : 100 (100번 버스 생성)
		kim.takeBus(bus100); // 김범수가 100번지 버스를 탐
		kim.showInfo();		// 김범수 정보 출력
		bus100.showInfo(); // 버스정보 출력
		
		
		
		System.out.println("-----------------");
		
		
		
		
		_04_Subway subwayGreen = new _04_Subway("2호선");// 2호선 지하철
		park.takeSubway(subwayGreen); // 박효신이 2호선을 탐
		park.showInfo(); // 박효신 정보 출력
		subwayGreen.showInfo(); // 지하철 정보 출력
		
		
		
				
	}

}
/*
 * 김범수님의 남은 돈은4000입니다. 
 * 버스 100번의 승객은1명 
 * 수입은1000입니다. 
 * ----------------- 
 * 박효신님의 남은돈은8500입니다. 
 * 2호선의 승객은1명 
 * 수입은1500입니다.
 */
