package test;

public class _Main {
	public static void main(String[] args) {

		
		_Programmer pro = new _Programmer();
		pro.create(1);


		System.out.println("============");


		_AdvancedLevel adv = new _AdvancedLevel();
		pro.upgradeLevel(adv);
		pro.create(2);


		System.out.println("============");


		
		_HighLevel hi = new _HighLevel();
		pro.upgradeLevel(hi);
		pro.create(3);

	}
}
/*
***BeginnerLevel입니다***
java 할 줄 압니다.
jsp 할줄 모릅니다.
spring을 할줄 모릅니다
============
***AdvancedLevel 입니다***
java 좀 할줄 압니다.
jsp 할줄 압니다.
spring을 할줄 모릅니다
spring을 할줄 모릅니다
============
***Highlevel입니다***
java 매우 잘합니다.
jsp 매우 잘합니다
spring매우 잘합니다
spring매우 잘합니다
spring매우 잘합니다
*/


// 오타가 많았습니다
// 70