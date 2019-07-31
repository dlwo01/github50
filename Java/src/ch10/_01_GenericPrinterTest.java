
package ch10;

public class _01_GenericPrinterTest {
	public static void main(String[] args) {
		
		_01_GenericPrinter<_01_Powder> powderPrinter = new _01_GenericPrinter<_01_Powder>();
		
		
		powderPrinter.setMaterial(new _01_Powder());
		_01_Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter); //toString()생략
		System.out.println(powderPrinter.toString());
		
		
		
		
		_01_GenericPrinter<_01_Plastic> plasticPrinter = new _01_GenericPrinter<_01_Plastic>();
		
		plasticPrinter.setMaterial(new _01_Plastic());
		_01_Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);// toString()생략
		System.out.println(plasticPrinter.toString());
		
		
		
	}
}
/*
재료는 Powder입니다.
재료는 Powder입니다.
재료는 Plastic입니다.
재료는 Plastic입니다.
*/
