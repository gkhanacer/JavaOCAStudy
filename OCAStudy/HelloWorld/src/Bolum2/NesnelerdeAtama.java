package Bolum2;

class Sayi {
	int i;
}
public class NesnelerdeAtama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// s1 ve s2 ismindeki referanslar Sayi sınıfından nesneleri göstermektedir. 
		Sayi s1 = new Sayi();
		Sayi s2 = new Sayi();
		
		s1.i = 9;
		s2.i = 47;
		System.out.println("1. s1.i : " + s1.i + ", s2.i : " + s2.i);
		
		// Referanslar kopyalanıyor nesneler değil!!!
		// s1 artık s2'nin işaret ettiği nesneyi göstermektedir.
		// s1'in önceki gösterdiği nesne ise garbage collector tarafından temizlenecektir.
		s1 = s2;
		System.out.println("1. s1.i : " + s1.i + ", s2.i : " + s2.i);
		
		// s1 ile s2 aynı nesneyi işaret ettiği için burada aslında memory'deki ilgili nesne üzerinde değişiklik yapılıyor.
		// s1 ve s2 , heap'te yaratılan aynı Sayi nesnesini gösteriyor.
		// s1.i, ilgili nesnenin alanıdır.
		s1.i = 27;
		System.out.println("1. s1.i : " + s1.i + ", s2.i : " + s2.i);
		
		// Eğer referansları değil nesnelerin alanlarını atamak isteseydik :
		// s1.i = s2.i;
	}

}
