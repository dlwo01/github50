package ch05;

public class _07_ArrayCopy {
	public static void main(String[] args) {
		
		
		//깊은 복사 : 직접 인스턴스를 만들고 값을 복사해야 한다.
		_04_Book[] bookArray1 = new _04_Book[3];
		_04_Book[] bookArray2 = new _04_Book[3];
		
		//배열초기화
		bookArray1[0] = new _04_Book("태박산맥","조장래");
		bookArray1[1] = new _04_Book("데미안","헤르만 헷세");
		bookArray1[2] = new _04_Book("어떻게 살 것인가","유시민");
		
		//추가시작----------------------
		bookArray2[0] = new _04_Book();
		bookArray2[1] = new _04_Book();
		bookArray2[2] = new _04_Book();
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		//추가종료---------------------------
		// 디폴트 새엉자로 bookArray2 배열인스턴스 생성
		System.out.println("============bookArray2(변경전)======");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		//깊은 복사
		           
		// bookArray1의 첫번째 배열요소의 값을 변경
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("========bookArray1(변경전)=========");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
			
		}	
		System.out.println("=========bookArray2(변경후)=======");
		// bookArray1 배열오소값과 다른 내용이 출력됨 --> 영향을 받지 않는다(주소값이다름)
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}


		
	}


