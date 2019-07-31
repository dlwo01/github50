package test;

public class _NoteBook extends _ElectroProduct {

	private String mname;
	private double salePoint;
	
	public _NoteBook() {}
	
	public _NoteBook(String brand,int price,double bonusPoint,String mname) {
		super(brand,price,bonusPoint);
		this.mname = mname;
		this.salePoint = 0.1;
		//private은 super.으로 접근을 못함
		//protected인 매개변수로경우는 접근 가능..매개변수앞에는 항상 public가 붙는다 그래서 가능
	}
	@Override// 자식의 계산이 중요해서 메모리에 자식꺼가 올라가있음
	public int CalcPrice(int price) {
		price = price - (int)(price*salePoint);
			return price;
	}
	public int CalcPrice2(int price) {
		price = (int)(price*bonusPoint);
			return price;
			//return (int)(price*bonusPoint); 이렇게 하면 간단하게 할 수 있음
	}
	@Override
	public void printInfo() {
	System.out.println("브랜드:" + brand + " 가격:" + price + " 적립비율 :" + bonusPoint + " 모델명:" + mname + " 세일가격:" + CalcPrice(price) + " 적립가격 :" + CalcPrice2(price));
	}// 지금 나는 protected여서 brand 로 출력이 가능하지만 private이면 get으로 출력해야함 get앞에 super.가 생력되어있음
	// 출력 CalcPrice(price)는 CalcPrice 계산값에 매개변수로 price를 이떄 이 price는 부모클래스에 있는 price 넣었다
}

