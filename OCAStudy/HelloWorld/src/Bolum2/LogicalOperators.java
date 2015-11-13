package Bolum2;

public class LogicalOperators {

	// Eğer tek karakterli, yani & veya | şeklinde ise, operatörünher iki yanındaki işlemler/karşılaştırmalar kesinkes yapılır.
	// Ancak çift karakterli kullanılırsa , yani && veya ||, işleme soldan başlanır; eğer tüm ifade bitmeden kesin sonuca ulaşılırsa ifadenin geri kalan kısmı gösardı edilir.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
		int c = 6;
		int d = 1;
		
		System.out.println(" (a<b)&(c<d) :" + ((a<b)&(c<d)) );
		System.out.println(" (a<b)&&(c<d) :" + ((a<b)&&(c<d)) );

		System.out.println(" (a<b)|(c<d) :" + ((a<b)|(c<d)) );
		System.out.println(" (a<b)||(c<d) :" + ((a<b)||(c<d)) );
		
		System.out.println(" (a<b)^(c<d) :" + ((a<b)^(c<d)) );
		System.out.println(" !((a<b)&&(c<d)) :" + !((a<b)&&(c<d)) );
	}

}
