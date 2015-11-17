package Bolum6;


/*
 * Abstract Classes and Methods
 * 
 * Abstract(soyut) sınıflardan new ile nesne yaratılamaz.
 * Birleştirici üst sınıf özelliği vardır, bunun için kullanılıyor.
 * Abstract sınıftan türemiş alt sınıflara ait nesneler bu soyut sınıf türündeki referanslara bağlanabilir.
 * (Poliformizm ve late binding)
 * 
 * AMAÇ : Birleştirici rol üstlenmek
 * 		  Kendilerine ulaşan normal sınıflara (interface veya abstarct değil) Override'ı zorunlu kılmak
 *        Poliformizm ile esneklik sağlamak.
 *        
 *  Bir sınıfın soyut olabilmesi için içerisinde en az 1 adet abstract metodun olmaı gerekir.
 *  Abstract(soyut) metodların gövdesi bulunmaz, içi boş hiçbir şey yapmayan metoddur.
 *  
 *  Soyut bir sınıftan türetilmiş alt sınıfla, bu soyut sınıfın içerisindeki soyut yordamları 
 *  kesin olarak iptal etmek zorundadır. Eğer override edilmezse compile-time'da hata alınır.
 *  
 *  Soyut sınıfların içerisinde soyut olmayan ve gövdesi olan metodlar da bulabilir.
 */


abstract class Calisan {
	
	public String pozisyon = "Calisan";
	
	// Abstract metodların gövdesi bulunmaz.
	public abstract void calis();
	
	// Abstract sınıfların içerisinde abstract olmayan metodlar bulunabilir.
	public void zamIste() {
		System.out.println("Çalışan zamIste");
	}
}


class Mudur extends Calisan {

	public Mudur() {
		pozisyon =  "Müdür";
	}

	@Override
	public void calis() {
		System.out.println("Müdür çalışıyor.");
	}
}


class Programci extends Calisan {

	public Programci() {
		pozisyon =  "Programci";
	}

	@Override
	public void calis() {
		System.out.println("Programci çalışıyor.");
	}
	
	public void zamIste() {
		System.out.println("Programci zamIste");
	}
}

class Pazarlamaci extends Calisan {

	public Pazarlamaci() {
		pozisyon =  "Pazarlamaci";
	}

	@Override
	public void calis() {
		System.out.println("Pazarlamaci çalışıyor.");
	}
}


public class AbstactClasses {

	public static void mesaiBasla(Calisan[] c){
		for (int i = 0 ; i < c.length ; i ++)
			c[i].calis();
		
		for (int i = 0 ; i < c.length ; i ++)
			c[i].zamIste();
	}
	
	
	public static void main(String[] args) {
		Calisan[] c = new Calisan[3]; // DİKKAT! Nesne yaratılmadı, array yaratıldı.
		
		// c[0] = new Calisan(); // Soyut sınıflardan new ile instance oluşturulamaz.
		c[0] =  new Mudur();
		c[1] =  new Programci();
		c[2] =  new Pazarlamaci();
		// c[3] =  new Pazarlamaci(); // Runtime 'da ArrayIndexOutOfBoundsException verir
		
		mesaiBasla(c);
		
	}

}
