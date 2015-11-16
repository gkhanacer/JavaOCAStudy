package Bolum5;

class Kitap {
	public int getSayfaSayisi(){
		System.out.println("Kitap - sayfa sayısı");
		return 400;
	}
	
	public double getFiyat(){
		System.out.println("Kitap - fiyat");
		return 250000;
	}
	
	public String getYazar(){
		System.out.println("Kitap - yazar");
		return "Ahmet Ümit";
	}
	
	// AM : friendly
	void deneme(){
		System.err.println("deneme");
	}
}

/*
 * Ana sınıf içerisinde tanımlanmış bir metod, ana sınıftan türeyen bir alt sınıfın içerisinden iptal edilebilir.(overriding)
 * 
 */
class Roman extends Kitap{
	public int getSayfaSayisi(){
		System.out.println("Roman - sayfa sayısı");
		return 300;
	}
	
	public double getFiyat(){
		System.out.println("Roman - fiyat");
		return 10000;
	}
	
	/*
	 * İptal eden metodun, iptal edilen metodun erişim belirleyicisi ile aynı veya daha erişebilir 
	 * bir erişim belirleyicisine sahip olması gerekir.
	 * En erişilebilirden en erişilemeze : public, protected, friendly, private
	 * 
	 *  deneme metodu Kitap sınıfında friendly olarak tanımlandığı için Roman sınıfnda iptal eilebilmesi için
	 *  friendly, protected veya public olmak zorundadır!!!!!!!
	 *  
	 *  Compile time hatası 
	 */
	// AM : friendly
//	private void deneme(){
//		System.out.println("roman - deneme");
//	}
}

public class Overriding {

	public static void main(String[] args) {
		Roman roman = new Roman();
		int sayfaSayisi = roman.getSayfaSayisi();
		double fiyat = roman.getFiyat();
		String yazar =  roman.getYazar();
		
	}

}
