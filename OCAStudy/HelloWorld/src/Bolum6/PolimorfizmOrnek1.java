package Bolum6;


class Asker{
	public void selamVer() {
		System.out.println("Asker selam ver");
	}
}

class Er extends Asker{
	// Overriding
	public void selamVer() {
		System.out.println("Er selam ver");
	}
}

class Yuzbasi extends Asker{
	// Overriding
	public void selamVer() {
		System.out.println("Yuzbasi selam ver");
	}
}
public class PolimorfizmOrnek1 {

	// Upcasting  (is - a)
	// Asker tipinde parametere kabul eden metodu Er ve Yuzbasi tipinde referanslarla ilişkilendirebiliriz.
	public static void hazirOl(Asker a){
		a.selamVer();
	}
	public static void main(String[] args) {
		
		// Polimorfizm 
		// Bir nesnenin referansına birçok farklı sınıfın nesnesinin bağlanabilmesidir.
		// Sınıflar arasında is-a ilişkisi yani kalıtım olmak zorundadır.
		Asker a = new Asker();
		Asker e = new Er();
		Asker y = new Yuzbasi();
		
		// Burada sıkıntı yok Asker nesnesi Asker sınıfının selamVer() metodunu çağıracak.
		hazirOl(a);
		
		/*
		 * Late Binding (Geç Bağlama)
		 * Parametre olarak Asker türünde nesne kabul eden hazirOl metoduna Er nesnesi gönderebildik.
		 * Çünkü Er bir Asker'dir.
		 * Ama a.selamVer() satırına gelindiğinde Asker nesnesinin değil Er nesnesinin selamVer() metodu çağırılır.
		 * Çünkü Asker tipindeki yerel değişken a heap' alanında Er nesnesine bağlanmıştır. 
		 * Eğer Er nesnesinin selamVer() metodu olmasaydı Asker nesnesinin selamVer() metodu çağırılacaktı.
		 * Çünkü Er sınıfı, Asker sınıfının selamVer() metodunu override etmiştir!!!!
		 * 
		 * 
		 * Bir metodun hangi nesneye ait olduğu çalışma anında belirleniyorsa bu olaya late binding denir. (tam tersi early binding)
		 * Çalışma anında metoda hangi tür nesnenin bağlanacağı belirlenir. (RUNTIME)
		 */ 
		hazirOl(e);
		hazirOl(y);
	}

}
