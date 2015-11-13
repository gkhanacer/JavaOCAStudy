package Bolum2;


class Harf {
	char c;
}
public class PassByReferanceForObject {

	// Gelen Harf nesnesi kısa süreli olarak metodun parametresindeki h-Harf referansına atanır.
	// Yani artık gelen nesneye ait iki referans bulunmaktadır. (harf ve h)
	// h referansı ise metod bittiğinde scope alanının sonuna gelir ve yok olur.
	// Ancak h nesnesinin ömrü bitene kadar h'nin gösterdiği nesne üzerinde çoktan değişiklik yapılmıştır.
	static void f(Harf h){
		h.c = 'z';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Harf harf = new Harf();
		harf.c = 'a';
		System.out.println("1. harf.c : " + harf.c);
		
		
		f(harf); // Harf nesnesinin kendisi değil referansı gönderildi.
		System.out.println("2. harf.c : " + harf.c);
	}

}
