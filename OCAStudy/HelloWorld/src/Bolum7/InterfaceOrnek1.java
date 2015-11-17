package Bolum7;

/*
 * INTERFACE(ARAYÜZ)
 * 
 * AMAÇ : Birleştirici rol üstlenmek
 * 		  Kendilerine ulaşan normal sınıflara (interface veya abstarct değil) Override'ı zorunlu kılmak
 *        Poliformizm ile esneklik sağlamak.
 *        
 * Inteface'lerden new ile yeni bir instance oluşturulamaz!!!!
 * 
 * İçerisinde iş yapan herhangi bir metod bulunmaz. Bütün metodlar gövdesizdir.
 * 
 * Interface'lere ait gövdesiz metodlar otomatik olarak public'tir ve bu A.M. değiştirilemez!
 * Interface'lere ait global alanlar da 'public final static' özellik içerirler ve müdahale edilemez.
 * 
 * Alt sınıflar Interface'leri 'implements' anahtar kelimesi ile uygularlar ve TÜM soyut metodları override ederler.
 * 
 * interface'ler interface'lerden türeyebilir (extends ile kalıtımdan faydalanabilir), bir arayüz birden çok arayüzden türeyebilir.
 * 
 */


interface C {	
}

interface B {	
}
// interface'ler interface'lerden türeyebilir (extends ile kalıtımdan faydalanabilir), bir arayüz birden çok arayüzden türeyebilir
interface A extends B, C {	
}


interface Calisan {
	
	
	// Interface'lere ait global alanlar da 'public final static' özellik içerirler ve müdahale edilemez.
	public static int MAAS = 5000;
	
	// Interface'teki global alanlarda tanımlamam alanlar (primitive veya nesne) 
	// otomatik olarak 'public final static' özelliğine sahip olurlar ve müdahale edilemez.
	int OCAK=1, SUBAT=2, MART=3, NISAN=4, MAYIS=5;
	
	// Bu alanlara değerler başlangıçta verildiği gibi runtime'da da verilebilir.
	int devirSayisi = (int) (Math.random()*6);
	
	// Interface metodların gövdesi bulunmaz.
	public abstract void calis();
	
}


class Mudur implements Calisan {

	@Override
	public void calis() {
		System.out.println("Müdür çalışıyor.");
	}
}


class Programci implements Calisan {

	@Override
	public void calis() {
		System.out.println("Programci çalışıyor.");
	}
	
	public void zamIste() {
		System.out.println("Programci zamIste");
	}
}

class Pazarlamaci implements Calisan {

	@Override
	public void calis() {
		System.out.println("Pazarlamaci çalışıyor.");
	}


}


public class InterfaceOrnek1 {
	
	public static void mesaiBasla(Calisan[] c){
		for (int i = 0 ; i < c.length ; i ++)
			c[i].calis();
	}
	
	public static void main(String[] args) {
		Calisan[] c = new Calisan[3]; // DİKKAT! Nesne yaratılmadı, array yaratıldı.
		
		// c[0] = new Calisan(); // Interface'ten new ile instance oluşturulamaz.
		c[0] =  new Mudur();
		c[1] =  new Programci();
		c[2] =  new Pazarlamaci();
		
		mesaiBasla(c);
		
		System.out.println("Devir sayısı :" + c[0].devirSayisi);

	}

}
