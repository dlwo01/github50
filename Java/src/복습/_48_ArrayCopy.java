package 복습;

public class _48_ArrayCopy {
	public static void main(String[] args) {
		
		
		// 배열 선언 및 생성
		_46_Book[] bookArray1 = new _46_Book[3];
		_46_Book[] bookArray2 = new _46_Book[3];
		
		
		// 배열 초기화
		bookArray1[0] = new _46_Book("태백산맥","조정래");
		bookArray1[1] = new _46_Book("데미안","헤르만 헤세");
		bookArray1[2] = new _46_Book("어떻게 살 것인가","유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		
		
		for(int i = 0; i<bookArray2.length; i++) {
				bookArray2[i].showBookInfo();
		}
		/*
		 책 제목 :태백산맥 저자 :조정래
		 책 제목 :데미안 저자 :헤르만 헤세
		 책 제목 :어떻게 살 것인가 저자 :유시민
		 */
		
		
		/* 얕은 복사 : 객체 배열을 복사하면 항상 인스턴스 주소가 복사되어 주소가 동일하므로, 
		            원래의 배열값이 변경시 copy된 배열의 값도 변경된다.(공유한다)
		            */
		// bookArray1의 값을 변경
		bookArray1[0].setBookName("나무");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==================bookArray1(변경전)==============");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[1].showBookInfo();
			
		}
		System.out.println("=================bookArray2(변경후)=============");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}

}
/*
책 제목 :태백산맥 저자 :조정래
책 제목 :데미안 저자 :헤르만 헤세
책 제목 :어떻게 살 것인가 저자 :유시민
==================bookArray1(변경전)==============
책 제목 :데미안 저자 :헤르만 헤세
책 제목 :데미안 저자 :헤르만 헤세
책 제목 :데미안 저자 :헤르만 헤세
=================bookArray2(변경후)=============
책 제목 :나무 저자 :박완서
책 제목 :데미안 저자 :헤르만 헤세
책 제목 :어떻게 살 것인가 저자 :유시민
*/
