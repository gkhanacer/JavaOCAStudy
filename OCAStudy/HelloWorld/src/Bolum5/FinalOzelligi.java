package Bolum5;

/*
 * final ile global alan, metod veya sınıf tanımlanabilir.
 */

class Kutu {
	int i = 0;
}
public class FinalOzelligi {

	/*
	 * final GLOBAL ALAN
	 * final ile tanımlanan global alan sabit değer tanımak için kullanılır.
	 * final değeri compile-time veya run-time'da atanabilir.
	 * Bir kere değer atanabilir ve daha sonra değiştirilemez.
	 * static olabilir, olmayabilir.
	 */
	
	// Compile time'da belli
	final int  X_SABIT_DEGER = 20 ;
	
	// Sabit nesne - Bu referansa asla yeni bir nesne bağlanamaz!!!
	final Kutu k = new Kutu();
	
	// Runtime'da belli
	final int SABIT = (int) (Math.random()*50);
	
	
	/*
	 * final PARAMETRE
	 * Metodlara gönderilen parametre değerinin değişmemesini istiyorsak bu parametreleri final yapabiliriz.
	 */
	public static int topla ( final int a, final int b) {
		// a = 4; hata!
		// b = 3; hata!
		return a + b;
	}
	
	/*
	 * BOŞ final alanlar
	 * Boş global final alanlara ilk değerleri yapılandırıcıarın içerisinde verilmelidir.
	 * Static global alanlar boş final olamaz. Hemen ilk değerleri verilmelidir.
	 */
	//final static int X; hata!
	final static int X = 10; // doğru
	final int Y ;
	final FinalOzelligi finalOzelligi;
	
	public FinalOzelligi() {
		Y = 10; // ilk değeri verilmek zorundadır.
		finalOzelligi = new FinalOzelligi();
	}
	
	public static void main(String[] args) {
		
		FinalOzelligi f = new FinalOzelligi();
		f.k.i = 35; // doğru
		f.k.i = 34; // doğru
		// f.k = new Kutu(); // yanlış
		
		System.out.println(f.X_SABIT_DEGER);
		System.out.println(f.SABIT);
		System.out.println(f.k.i);
	}

}
