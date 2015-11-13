package Bolum2;

public class TypeCasting {

	// Temel bir veri tipi diğer bir temel tipe dönüştürülebilir.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		double b = (double) a;
		
		double x = 4.15;
		int y = (int) x;
		
		System.out.println("b : " + b + ", y : " + y);
		
		
		// + operatörü String verilerde birleştirme görevi görür.
		// Eğer bir ifade String ile başlarsa onu izleyen veri tipleri de kendiliğinden String'e dönüştürülür.
		int k = 0, l = 1, m = 2;
		System.out.println("1. Sonuc : " + k+l+m);
		System.out.println("2. Sonuc : " + (k+l+m));
		
	}

}
