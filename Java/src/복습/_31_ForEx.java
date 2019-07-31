package 복습;

public class _31_ForEx {
	public static void main(String[] args) {
		//2~20까지의 짝수(i)의 합계 (sum) => 출력값 i=?,sum=?
		
		int sum = 0;
		for(int i =2; i<=20; i++) {
			sum+=i;
			System.out.println("i =" + i + "sum =" + sum );
		}
	}

}
/*i =2sum =2
*i =3sum =5
*i =4sum =9
*i =5sum =14
*i =6sum =20
*i =7sum =27
*i =8sum =35
*i =9sum =44
*i =10sum =54
*i =11sum =65
*i =12sum =77
*i =13sum =90
*i =14sum =104
*i =15sum =119
*i =16sum =135
*i =17sum =152
*i =18sum =170
*i =19sum =189
*i =20sum =209
*/