package 복습;

public class _40_TakeTransMain {
	public static void main(String[] args) {
		 _40_Student kim = new  _40_Student("김범수",5000);
		 _40_Student park = new  _40_Student("박효신",10000);
		 
		 _40_Bus bus100 = new _40_Bus(100); // 버스번호 :100(100번버스생성)
		 kim.takeBus(bus100);// 김범수가 100번지 버스를 탐
		 kim.showInfo(); // 김범수 정보 출력
		 bus100.showInfo(); // 버스정보 출력
		 
		 
		 
		 
		 System.out.println("--------------------");
		 
		 
		 
		 
		 
		 
		 _40_Subway subwayGreen = new _40_Subway("2호선");//2호선지하철
		 park.takesubway(subwayGreen); // 박효신이 2호선을 탐
		 park.showInfo(); // 박효신 정보 출력
		 subwayGreen.showInfo(); // 지하철 정보 출력
		 
	}

}

/*김범수님의 남은 돈은4000입니다.
버스100번의 승객은1명 입니다.
수입은1000입니다.
--------------------
박효신님의 남은 돈은8500입니다.
2호선의 승객은1명
수입은1500입니다.
*/
