package 복습;

public class _49_ArrayCopy {
	public static void main(String[] args) {
		
		
		
		//깊은 복사 : 직접 인스턴스를 만들고 값을 복사해야 한다.
		_46_Book[] bookArray1 = new _46_Book[3];
		_46_Book[] bookArray2 = new _46_Book[3];
		
		//배열초기화
		bookArray1[0] = new _46_Book("태백산맥","조장래");
		bookArray1[1] = new _46_Book("데미안","헤르만 헷세");
		bookArray1[2] = new _46_Book("어떻게 살 것인가","유시민");
		
		
		//추가시작-------------------------
		bookArray2[0] = new _46_Book();
		bookArray2[1] = new _46_Book();
		bookArray2[2] = new _46_Book();
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		//추가종료---------------------------
		// 디폴트 생성자로 bookArray2 배열인스턴스 생성
		System.out.println("====================bookArray2(변경전)=============");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			
		}
		
		//깊은 복사
		
		// bookArray1의 첫번째 배열요소의 값을 변경
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		
		System.out.println("==============bookArray1(변경전)============");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[1].showBookInfo();
			
		}
		System.out.println("===============bookArray2(변경후)==========");
		// bookArray1배열요소값과 다른 내용이 출력됨 --> 영향을 받지 않는다(주소값이 다름)
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
	}

}
/*
====================bookArray2(변경전)=============
책 제목 :태백산맥 저자 :조장래
책 제목 :데미안 저자 :헤르만 헷세
책 제목 :어떻게 살 것인가 저자 :유시민
==============bookArray1(변경전)============
책 제목 :데미안 저자 :헤르만 헷세
책 제목 :데미안 저자 :헤르만 헷세
책 제목 :데미안 저자 :헤르만 헷세
===============bookArray2(변경후)==========
책 제목 :태백산맥 저자 :조장래
책 제목 :데미안 저자 :헤르만 헷세
책 제목 :어떻게 살 것인가 저자 :유시민
*/

