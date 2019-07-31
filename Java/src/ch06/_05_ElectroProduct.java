package ch06;

public class _05_ElectroProduct {

	protected String brand;
	protected int price;
	protected double bonusPoint;


	public _05_ElectroProduct() {
		this.brand = "LG";
		this.price = 500000;
		this.bonusPoint = 0.01;
		System.out.println("ElectroProduct() 기본생성자 출력)");
	}

	public _05_ElectroProduct(String brand,int price,double bonusPoint){
		this.brand = brand;
		this.price = price;
		this.bonusPoint = bonusPoint;
		System.out.println("NoteBook() 매개변수 생성자 출력)");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;

	}
	public String getBrand() {
		return brand;

	}
	public void setBonusPoint(double bonuspoint) {
		this.bonusPoint = bonusPoint;
				
	}
	public double getBonusPoint() {
		return bonusPoint;
		
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	public int getPrice() {
		return price;
		
	}
	public int CalcPrice(int price) {
		this.price = price;
			return this.price;
	}
	public int CalcPrice2(int price) {
		price = price - (int)(price*bonusPoint);
			return price;
	}
	// 다른기능을 추가하려면 price get,set을 추가한다.
	public void printInfo() {
	System.out.println("브랜드 :" + brand + " 가격 :"+ price + " 적립비율 :" + bonusPoint);


	}
	
}



