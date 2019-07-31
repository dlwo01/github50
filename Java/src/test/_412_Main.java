package test;

public class _412_Main {
	public static void main(String[] args) {
		
	
	_412_CompanyLisy cpy = new _412_CompanyLisy();
	
	cpy.insertcom(new _412_Company(1001,"삼성"));
	cpy.insertcom(new _412_Company(1002,"lg"));
	cpy.insertcom(new _412_Company(1003, "두산"));
	cpy.insertcom(new _412_Company(1004,"롯데"));
	cpy.showComanyInfo();


	cpy.deleteCompany(1004);
	cpy.showComanyInfo();
	}
}
/*
삼성의 아이디는 1001입니다.
lg의 아이디는 1002입니다.
두산의 아이디는 1003입니다.
롯데의 아이디는 1004입니다.

삼성의 아이디는 1001입니다.
lg의 아이디는 1002입니다.
두산의 아이디는 1003입니다.

*/
//회사 삭제하는거 틀렸습니다