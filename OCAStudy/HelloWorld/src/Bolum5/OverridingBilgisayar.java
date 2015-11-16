package Bolum5;


public class OverridingBilgisayar extends OverridingHesapMakinesi{


	// overriding var, çünkü sınıfımızın OverridingHesapMakinesi sınıfının friendly hesapla metodundan haberi VAR!
	protected void hesapla(double a, double b){
		System.out.println("Bilgisayar - hesapla");
	}
	
	public static void main(String[] args) {
		
		OverridingBilgisayar b = new OverridingBilgisayar();
		b.hesapla(12, 23);
		System.out.println("Yıl : " + b.yil);
		
		
		OverridingHesapMakinesi h = new OverridingHesapMakinesi();
		h.hesapla(12, 3232); // Compile-time  HATA!!! Başka paket içerisinden erişilemez. Çünkü friendly olarak tanımlnmış
		System.out.println("Yıl : " + h.yil);
	}

}