package practice;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PhoneBookManager phm = new PhoneBookManager();
		PhoneInfoMeun kl = new PhoneInfoMeun();
		PhoneInfo hou;
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
			hou = new PhoneInfo(l,j,d);
			phm.inputData(hou);
			hou.showphoneInfo();
			//break;
		}else if(i==2) {
			System.out.println("검색할 이름을 입력하세요");
			String name = input.next();
			phm.searchData(name);
			
		}else if(i==3) {
			System.out.println("삭제할 이름을 입력하세요");
			String name = input.next();
			phm.deleteData(name);
		}else if(i==4) {
			System.out.println("종료합니다");
			return;
		}else {
			System.out.println("잘못된 입력입니다");
		}
		
	
		}while(true);
		
		
	}
}
