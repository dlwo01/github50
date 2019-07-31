package test;

public class AgeAvg {
	public static void main(String[] args) {
		/*
		====================나이 평균=======================
			1번	2번	3번	4번 	합계	평균	등급
		=================================================
		1반	65	40	53	54
		2반	45	40	43	47
		3반	32	38	29	35	
		4반	12	25	23	28
		5반	14	15	16	17
		==================================================
		*/


			int ban[][] = {
					{65,40,53,54}
					,{45,40,43,47}
					,{32,38,29,28}
					,{12,25,23,28}
					,{14,15,16,17}
				};

			System.out.println("===============나이평균==================");
			System.out.println("\t1번\t2번\t3번\t4번\t합계\t평균\t등급");
			
			System.out.println("=======================================");
			int oneTot = 0;
			int twoTot = 0;
			int thrTot = 0;
			int fouTot = 0;
			for(int i = 0; i<ban.length; i++) {
				oneTot += ban[i][0];
				twoTot += ban[i][1];
				thrTot += ban[i][2];
				fouTot += ban[i][3];
				System.out.println();
				System.out.print(i+1+"\t");
				int tot = 0;
				double avg = 0; 
				String grade;
				for(int number = 0; number<ban[i].length; number++) {
					tot += ban[i][number];
					
					System.out.print(ban[i][number]+ "\t");
				}
						avg = (double)tot/4;
						switch((int)avg/10) {
						
						case 0 :
						case 1 : grade="급식";
							break;
						case 2 : grade = "학식";
							break;
						case 3 : grade = "구내식";
							break;
						case 4 : grade = " 집밥";
							break;
						default : grade = "눈치밥";

						
					
				}
				System.out.printf(tot + "\t" + "%.1f"+"\t"+grade,avg );

				}
				System.out.println();
				System.out.println("총합계"+oneTot+"\t"+twoTot+"\t"+thrTot+"\t"+fouTot+"\t");
				System.out.printf("총평균"+oneTot/ban.length+"\t"+twoTot/ban.length+"\t"+thrTot/ban.length+"\t"+fouTot/ban.length+"\t");
			}
			}
// 오타 줄바꾸는거 틀렸습니다.
/*
===============나이평균==================
1번	2번	3번	4번	합계	평균	등급
=======================================

1	65	40	53	54	212	53.0	눈치밥
2	45	40	43	47	175	43.8	 집밥
3	32	38	29	28	127	31.8	구내식
4	12	25	23	28	88	22.0	학식
5	14	15	16	17	62	15.5	급식
총합계168	158	164	174	
총평균33	31	32	34	
	*/


