package 복습;

public class _62_GenericPrinterTest {
	public static void main(String[] args) {
		_62_GenericPrinter<_62_Powder> powderPrinter = new _62_GenericPrinter<_62_Powder>();
		
		powderPrinter.setMaterial(new _62_Powder());
		_62_Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);//toString()생략
		System.out.println(powderPrinter.toString());
		
		
		
		
		_62_GenericPrinter<_62_Plastic> plasticprinter = new _62_GenericPrinter<_62_Plastic>();
		
		plasticprinter.setMaterial(new _62_Plastic());
		_62_Plastic plastic = plasticprinter.getMaterial();
		System.out.println(plasticprinter);//toString()생략
		System.out.println(plasticprinter.toString());
				
	}

}
/*
재료는 Powder입니다.
재료는 Powder입니다.
재료는 plastic입니다.
재료는 plastic입니다.
*/