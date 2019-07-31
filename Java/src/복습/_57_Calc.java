package 복습;

public abstract class _57_Calc implements _57_Calcmpl{
	// abstract class 인 이유는 나머지 2개의 추상메소드가 구현되지 않았기 때문에
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	} // {}만 있어도 추상메소드가 아니다

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}


}
