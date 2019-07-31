package ch05;

public class _04_ArrayEx {
	public static void main(String[] args) {
		//1권의 책만 출력
		_04_Book boo = new _04_Book("태백산맥","조정래");
		boo.showBookInfo();
	
		//5권의 책을 출력
		//배열 선언 및 생성
		_04_Book[] library = new _04_Book[5];
		
		//배열 초기화
		library[0] = new _04_Book("한강","조정래");
		library[1] = new _04_Book("데미안","헤르만 헤세");
		library[2] = new _04_Book("어떻게 살 것인가","유시민");
		library[3] = new _04_Book("토지","박경리");
		library[4] = new _04_Book("어린왕자","생택쥐 페리");
		
		
		// 주소값 호출
		for(int i = 0; i < library.length; i++) {
		library[i].showBookInfo();
		}
		for(int i = 0; i< library.length; i++) {
		System.out.println(library[i]);// 배열명의 주소값이 들어있음
		}
		
	}
}
/*
책 제목 :태백산맥 저자 :조정래
책 제목 :한강 저자 :조정래
책 제목 :데미안 저자 :헤르만 헤세
책 제목 :어떻게 살 것인가 저자 :유시민
책 제목 :토지 저자 :박경리
책 제목 :어린왕자 저자 :생택쥐 페리
ch05._04_Book@15db9742
ch05._04_Book@6d06d69c
ch05._04_Book@7852e922
ch05._04_Book@4e25154f
ch05._04_Book@70dea4e
*/

