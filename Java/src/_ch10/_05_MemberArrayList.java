package _ch10;

import java.util.*;
public class _05_MemberArrayList {
	private ArrayList<_05_Member> arrList; //ArrayList선언
	
	//디폴트생성자
	public _05_MemberArrayList() {
		arrList = new ArrayList<_05_Member>(); // _05_Member형으로 선언한 ArrayList 생성
	}
	
	//회원추가 메소드
	public void addMember(_05_Member member) {// addMember(클래스명 참조변수)
		arrList.add(member); // member정보를 추가
		
	}
	// 회원 삭제 메소드
	public boolean removeMember(int memberId) {
		for(int i =0; i < arrList.size(); i++) {
			_05_Member member = arrList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrList.remove(i);
				return true;
			}//if
		}//for
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	//전체 회원 출력메소드
	public void showAllMember() {
		//향상된 for문 : for(자료형 변수 : 배열명) {} => 배열안의 자료를 순서대로 변수에 담아 출력=> 배열안에 건수만큼 반복
		for(_05_Member mem : arrList) {
			System.out.println(mem);
		}
		System.out.println();
	}

}
