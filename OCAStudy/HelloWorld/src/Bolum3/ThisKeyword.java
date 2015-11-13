package Bolum3;



// Bir metodtan diğer metodun çağrılması basittir, derleyici arkada ilgili metodun önüne this anahtar kelimesini koyar.
public class ThisKeyword {

	// Global değişkenlere nesne içerisindeki her statik olmayan metod tarafından doğrudan erişilebilinir!!!
	int gun, ay, yil;
	
	public void gunEkle(int gun){
		// Eğer this anahtar kelimesi kullanılırsa ilgili sınıfın ilgili nesnesinin global gun değişkenine ulaşılır.
		// Parametre olarak gelen gun değişkeni ise yerel değişkendir ve metod işlevini yerine getirdikten sonra scope alanı biter ve yok olur.
		this.gun +=  gun;
		
		// Eğer this kullanılmazsa yalnızca gelen gun değeri üzerinde işlem yapılır ve bu değer de metodun sonunda yok olacağı için
		// global gun değeri sıfır (0) değerinde kalır.
		// gun += gun;
	}
	
	public void gunuEkranaBas(){
		System.out.println("Gun : "+ gun);
	}
	
	public static void main(String args[]){
		
		ThisKeyword tk =  new ThisKeyword();
		tk.gunEkle(2);
		tk.gunEkle(4);
		tk.gunuEkranaBas();
	}
}
