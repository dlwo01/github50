package phonebook;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PhoneBookManager phm = new PhoneBookManager();
		PhoneInfoMeun kl = new PhoneInfoMeun();
		PhoneInfo hou = null; 
		String l,j,d="";
		int i;
		
		do {
			kl.showMenu();
			i = input.nextInt();
		if(i==1) {
			System.out.println("이름을 입력하세요 :");
			l=input.next();
			System.out.println("전화번호를 입력하세용 :");
			j=input.next();
			System.out.println("생일을 입력하세요 :");
			d=input.next();
			System.out.println("입력완료");
			hou = new PhoneInfo(l,j,d);
			phm.inputData(hou);
			
			//break;
		}else if(i == 2) {
			System.out.println("데이터검색");
			System.out.println("검색할 이름");
			String sn = input.next();
			phm.searchData(sn);
			System.out.println("데이터검색완료");
		
			
		}else if(i == 3) {
			System.out.println("데이터삭제");
			System.out.println("삭제할 이름");
			String dn = input.next();
			phm.deleteData(dn);
			System.out.println("데이터삭제완료");
			
			
		}else if(i == 4) {
			System.out.println("종료합니다");
			return;
		}else {
			System.out.println("존재하지 않는 데이터 입니다.");
			
		}

		
		}while(true);
		
		
	
}
}