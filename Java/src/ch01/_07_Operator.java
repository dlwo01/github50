package ch01;

public class _07_Operator {
	public static void main(String[] args) {
		/*
		 * 연산
		 * 1. 사직연산자
		
	}*/
		 System.out.println("===사칙연산자 예제===");
		 int i = 4;
		 int j = 2;
		 
		 int sum = i + j;
		 int sub = i - j;
		 int mul = i * j;
		 int div = i / j;
		 int mod = i % j;
		 
		 
		System.out.println("sum = " + sum);
		System.out.println("sub = " + sub);
		System.out.println("mul = " + mul);
		System.out.println("div = " + div);
		System.out.println("mod + " + mod);
		
		/*
		 * 연산
		 * 2.관계연산자 : 같다(==), 같지않다(!=),>,<,>=,<=
		 * cf) = : 대입연산자
/
 
 */
		System.out.println("===관계연산자 예제===");
		int c1 = 5;
		int c2 = 10;
		
		System.out.println("c1 == c2 : " + (c1 == c2)); // false
		System.out.println("c1 != c2 : " + (c1 != c2)); // ture
		System.out.println("c1 > c2 : " + (c1 > c2)); // false
		System.out.println("c1 < c2 : " + (c1 < c2)); // ture
		System.out.println("c1 >= c2 : " + (c1 >= c2)); // false
		System.out.println("c1 <= c2 : " + (c1 <= c2)); // ture
		
		/*
		 * 연산
		 * 3. 대입연산자
		*/
		System.out.println("===복합 대입연산자 예제===");
		
		int x = 5;
		
		x += 10; // x = x +10; 마지막 계산으로 계산한다 
		System.out.println("x=" + x); // x = 15
		
		x -= 10; //x = x -10;
		System.out.println("x =" + x); // x = 5
		
		x *= 10;//x = x * 10;
		System.out.println("x = " + x ); // x = 50
		
		x /= 10; // x = x / 10; 
		System.out.println("x = " + x); // x = 5
		
		x %= 10; // x = x % 10;
		System.out.println("x =" + x); // x = 5
		/*
		 * 연산
		 * 4. 증감연산자
		 * 1) 전위연산자 : y = ++x; ==> ++x; y=x; (증가를 먼저 시킴)
		 * 	1. x값을 1증가한 후 2. 증가값을 y에 대입한다
		 * 
		 * 2) 후위연산자 y = x++; ==> y=x; x++;
		 * 	1. x값을 먼저 y에 대입한 후 2. 대입후 x값을 증가시킨다. 
		 */
	
		System.out.println("증감연산자 예제===");
		
		int a = 5;
		int nextA = ++a; // 전위연산자
		System.out.println("a : " + a); // a = 6
		System.out.println( "nextA  = " + nextA); // nextA = 6
		
		int b = 5;
		int nextB = b++; // 후위연산자
		System.out.println("b :" + b); // b = 6
		System.out.println("nextB = " + nextB ); //nextB = 5
		
		int c = 2, d = 3, result = 0;
		System.out.println(++c + --d * c--); // 3 + 2  * 3 = 9
		System.out.println("c = " + c); // c = 2
		System.out.println("d = " + d); // d = 2
		
		result = ++c + --d * c--;
		System.out.println("result = " + result); // 6 = 3 + 1 * 3
		System.out.println("c = " + c); // c = 2
		System.out.println("d = " + d); // d = 1
		/*
		 * 연산
		 * 5. 논리연산자
		 * &&(논리곱) : x && y ==> x와 y 모두 참이면 참, 그렇지 않으면 거짓
		 * ||(논리합) : x || y ==> x나 y중에서 하나만 참이면 참, 모두 거짓이면 거짓
		 */
		 System.out.println("===논리연산자 예제===");
		 int x1 = 3, y1 = 4;
		 
		 System.out.println((x1 == 3) && (y1 == 4)); //  T && F ==> T
		 System.out.println((x1 == 3) && (y1 == 7));// T && F ==> F
		 
		 System.out.println((x1 == 6) || (y1 == 6));// F || F ==> F
		 System.out.println((x1 == 3) || (y1 == 7));// T || F ==> T
		
		 /*
		  * 연산
		  *  6. 삼항연산자 : 항이 3개인 연산자를 의미한다.
		  *  			  조건식 ? 결과1 : 결과2;
		  *  			 조건식이 참이면 수식1을 수행하고, 거짓이면 수식2를 수행한다
		  */
		System.out.println("===삼항연산자===");
		
		int x2, y2, z2;
		x2 = 10;
		y2 = 20;
		
		z2 = (x2 > y2) ? x2 : y2;
		System.out.println("z2 : " + z2);// z2 : 20;
		
		// 6-1. 삼항연산자
		//score가 60이상이면 "합격" 그렇지 않으면 "불합격"을 result2 번수에 출력
		
		int score = 60; //조건식 ? 결과1 : 결과2;
		String result2 = (score>=60) ? "합격" : "불합격";
		System.out.println("result2 : " + result2);
		
		// 6-2. 삼항연산자
		// score가 60점 이상이면"합격" 60점 미만이면 "불합격", 40점 미만이면 "과락"을 result3변수에 출력
		String result3 = (score>=60) ? "합격" : ((score>=40) ? "불합격" : "과락");
		System.out.println("result3 : " + result3);
		
		
				
	}
}
		
		
		


