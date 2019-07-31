package test;

import java.util.ArrayList;

public class _AnimalTest {
	
	ArrayList<_Animal> aniList = new ArrayList<_Animal>();
	
		public static void main(String[] args) {
			
			_AnimalTest aTest = new _AnimalTest();
			aTest.addAnlmal();
			System.out.println("다운캐스팅");
			aTest.testCasting();
		}

	public void addAnlmal() {
		
		aniList.add(new _Human());
		aniList.add(new _Tiger());
		aniList.add(new _Eagle());

		for(_Animal animal : aniList) {
			animal.move();
		}
	}

	public void testCasting() {
		for(int i =0; i < aniList.size(); i++) {
			_Animal ani = aniList.get(i);
			if(ani instanceof _Human){
					_Human hum = (_Human)ani;
					hum.readBook();
			}else if(ani instanceof _Tiger) {
					_Tiger ti = (_Tiger)ani;
					ti.hunting();
			}else if(ani instanceof _Eagle) {
					_Eagle ea = (_Eagle)ani;
					ea.flying();
			}
			else {
			System.out.println("지원되지않는 형입니다");
			}
		}
	}
}	
/*	
사람이 두발로 걷습니다.
호랑이가 네발로 뜁니다.
독수리가 하늘을 납니다.
다운캐스팅
사람이 책을 읽습니다
호랑이가 사냥을 합니다.
독수리가 날아갑니다.
*/
// 다운캐스팅 문법틀렸습니다
// 줄맞추는걸 이상하게했습니다.
//70
