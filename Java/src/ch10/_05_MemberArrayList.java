package ch10;


import java.util.ArrayList;

public class _05_MemberArrayList {
	
	private ArrayList<_05_Member> arrayList; //ArrayList선언
	
	//디폴트생성자
	public _05_MemberArrayList() {
		arrayList = new ArrayList<_05_Member>(); // _02_Member형으로 선언한 ArrayList 생성
		
	}
	
	// 회원추가 메소드
	public void addMember(_05_Member member) { // addMember(클래스명 참조변수)
		arrayList.add(member); // member정보를 추가
	}
	// 회원 삭제 메소드
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			_05_Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}//if
		}//for
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원 출력 메소드
	public void showAllMember() {
		//향상된 for문 : for(자료형 변수 : 배열명) {} => 배열안의 자료를 순서대로 변수에 담아 출력=> 배열안에 건수만큼 반복
		for(_05_Member member : arrayList) {
			System.out.println(member); // = member.toString()/toString()이 생략되있다
		}
		System.out.println();
		
		
	}
	
	

}
