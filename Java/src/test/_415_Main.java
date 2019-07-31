package test;

public class _415_Main {
	public static void main(String[] args) {
	_415_BankHashMap bhm = new _415_BankHashMap();

	_415_Bank shinhan = new _415_Bank(1001,"신한은행", 110222444);
	_415_Bank IBK = new _415_Bank (1002,"기업은행", 52150541);
	_415_Bank NH = new _415_Bank (1003,"농협은행", 541631351);
	_415_Bank KAKAO = new _415_Bank (1004,"카카오뱅크", 152123574);
	
	bhm.addBN(shinhan);
	bhm.addBN(IBK);
	bhm.addBN(NH);
	bhm.addBN(KAKAO);

	bhm.getBankInfo();	

	System.out.println("=========삭제후===========");
	bhm.removeBN(1004);
	bhm.getBankInfo();

	}
}

/*
은행명신한은행은행변호1001계좌번호:110222444
은행명기업은행은행변호1002계좌번호:52150541
은행명농협은행은행변호1003계좌번호:541631351
은행명카카오뱅크은행변호1004계좌번호:152123574

=========삭제후===========
은행명신한은행은행변호1001계좌번호:110222444
은행명기업은행은행변호1002계좌번호:52150541
은행명농협은행은행변호1003계좌번호:541631351

*/
// 오타몇개있었습니다
//90점