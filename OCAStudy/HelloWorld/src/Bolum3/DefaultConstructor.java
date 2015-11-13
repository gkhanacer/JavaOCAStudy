package Bolum3;


class Kedi {
	int i;
}

class Araba {
	int kapiSayisi;
	int vitesSayisi;
	
	public Araba(int adet){
		kapiSayisi =  adet;
	}
	
	public Araba(int adet, int sayi){
		kapiSayisi =  adet;
		vitesSayisi = sayi;
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Burada Java Kedi sınıfın Kedi() constructor'unu bulamadığı için default constructor devreye girer.
		Kedi kedi = new Kedi();
		
		// Biz Araba sınıfı için ayrı iki tane constructor tanımladık.
		// Yani javaya dedik ki "sen default constructor oluşturma, ben kendi işimi kendim halledeceğim."
		// Biz bu kararı verdiğimiz için Araba() constructor'unu kullanmak istiyorsak tanımlamak zorundayız.
		// Aksi halde hata alınır.
		// Diğer iki constructor'dan biri çağrılmalıdır.
		
		// HATA!!!
		Araba ar = new Araba();
		
		// Hata yok...
		Araba ar1 =  new Araba(2);
		Araba ar2 =  new Araba(2, 4);

	}

}
