package Bolum6;

abstract class Sporcu {
	
	// Abstract metodlar 'abstract' sözcüğü ile tanımlanır ve gövdesi bulunmaz.
	public abstract void calis();
	
	// Soyut sınıfa ait yapılandırıcı.
	public Sporcu() {
		System.out.println("calis() çağrılmadan önce" );
		
		// DİKKAT! Soyut sınıfın yapılandırıcısından soyut bir metodun çağrıldı!!! 
		calis();
		
		System.out.println("calis() çağrıldıktan sonra" );
	}
}

class Futbolcu extends Sporcu {
	
	int antremanSayisi = 3;
	
	public Futbolcu() {
		System.out.println("Futbolcu yapılandırıcısı");
		calis();
	}
	
	@Override
	/*
	 *  Buradaki calis fonksiyonu:  
	 *  1. Futbolcu sınıfından nesne yaratılırken önce Sporcu sınıfından nesne yaratmak istecektir 
	 *     ve Sporcu yapılandıcırısı içerisinden çağrılacaktır.
	 *     
	 *  2. Sporcu yapılancıdırısı çağrıldıktan sonra Futbolcu yapılandıcırısı çağrılacaktır. Bu sefer de
	 *     buradan çağrılacaktır.
	 *     
	 *  Yani toplamda 2 kere çağırılmış olacaktır!!!!
	 *  
	 *  HATA : Soyut bir sınıfa ait yapılandırıcı içerisinden soyut metodun çağırılmasıdır!
	 *  
	 */
	
	public void calis() {
		System.out.println("Futbolcu calis() " + antremanSayisi);
	}
}

public class AbstractConstructorHata {

	public static void main(String[] args) {
		Futbolcu f = new Futbolcu();

	}

}
