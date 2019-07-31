package ch07;

public class _05_Main {
	public static void main(String[] args) {
		_05_Player player = new _05_Player();//**** 초보자 레벨입니다. ***
		player.play(1);// _05_BeginnerLevel
		/*
		천천히 달립니다.
		Jump 못함
		Turn 못함
		*/
		
		System.out.println("==========");
		
		_05_AdvancedLevel adv = new _05_AdvancedLevel();
		//_05_PlayerLevel = adv
		//_05_PlayerLevel level = new _05_PlayerLevel()//다형성적용
		player.updateLevel(adv);//***중급자 레벨입니다.***
		player.play(2);
		/*
		 빨리 달린다.
		 높이 jump합니다.
		 높이 jump합니다.
		 Turn 못함
 		*/
		 
		
		System.out.println("===========");
		_05_SuperLevel sup = new _05_SuperLevel();
		//_05_PlayerLevel = sup
		player.updateLevel(sup);//***고급자 레벨입니다.***
		player.play(3);
		
		/*	엄청 빨리 달립니다.
			아주 높이 jump합니다.
			아주 높이 jump합니다.
			아주 높이 jump합니다.
			한 바퀴 돕니다.
		*/
	}

}
