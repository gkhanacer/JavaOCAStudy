package Bolum5.math;


//OverridingHesapMakinesi'ne erişmek için eklendi.
import Bolum5.OverridingHesapMakinesi;



public class OverridingBilgisayar extends OverridingHesapMakinesi{


	// overriding yok, çünkü sınıfımızın OverridingHesapMakinesi sınıfının friendly hesapla metodundan haberi yok.
	protected void hesapla(double a, double b){
		System.out.println("Bilgisayar - hesapla");
	}
	
	public static void main(String[] args) {
		
		OverridingBilgisayar b = new OverridingBilgisayar();
		// Kendi sınıfının hesapla metodu çağrılır overriding yok.
		b.hesapla(12, 23);
		System.out.println("Yıl : " + b.yil);
		
		
		
		OverridingHesapMakinesi h = new OverridingHesapMakinesi();
		h.hesapla(12, 3232); // Compile-time  HATA!!! Başka paket içerisinden erişilemez. Çünkü friendly olarak tanımlnmış
		System.out.println("Yıl : " + h.yil);
	}

}
