package ch02;

public class _25_ForEx {
	public static void main(String[] args) {
		/*
		 * break문 예제
		 * 반목문에서 break문을 사용하면 그 지점에서 더 이상 수행문을 반복하지 않고 반목문을 빠져나온다.
		 * 중첩 반복문일 경우 모든 반목문을 빠져나오는 것이 아니고, break문을 감싸고 있는 해당 반복문만 빠져나온다.
		 * 이 때 외부반목문은 계속 수행된다.
		 * 
		 * contiune문은 반복문을 계속 수행하지만 특정 조건에서 수행문을 생략하는 경우에 사용하고.
		 * break문은 반목문을 더 이상 수행하지 않고 빠져나올때 사용한다.
		 */
		//합계가 100이상일 때 출력
		int sum = 0;
		int num = 0;
		
		for(num = 0; ;num++) { // 조건식을 생략하는 대신 break문을 사용
			sum += num;
			if(sum >= 100) { // sum이 100이상일 때 종료조건
				break;  //반복문 중단
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
	}

/*num : 14
*sum : 105
*/