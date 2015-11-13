package Bolum3;


/* Yapılandırıcılardan this ifadesi ile diğer bir yapılandırıcı çağırırken dikkat edilmesi kurallar şunlardır :
 * 1.  Yapılandırıcılar içerisinden this ifadesi ile her zaman başka bir yapılandırıcı çağrılabilir.
 * 2.  Yapılandırıcı içerisinden, diğer bir yapılandırıcıyı çağırırken this ifadesi her zaman ilk satırda yazılmalıdır.
 * 3.  Yapılandıcırılar içerisinde birden fazla this ifadesi ile başka yapılandırıcı çağrılamaz.
 */
public class ContructorCallOtherConstructor {

	int sayi;
	String malzeme;
	public ContructorCallOtherConstructor() {
		this(5); 
		// this(5, "sucuklu"); // HATA! Bir constructor'da iki this kullanılamaz!!! 
		System.out.println("parantezsiz yapılandırıcı.");
	}
	
	
	public ContructorCallOtherConstructor(int sayi) {
		this(sayi, "Sucuklu");
		this.sayi = sayi;
		System.out.println("ContructorCallOtherConstructor(int sayi)");
	}


	public ContructorCallOtherConstructor(int sayi, String malzeme) {
		this.sayi = sayi;
		this.malzeme = malzeme;
		System.out.println("ContructorCallOtherConstructor(int sayi, String malzeme)");
	}

	public void siparisGoster() {
		// this(5, "Kaşarlı"); //  HATA! this yalnızca constructor'larda kullanılır!!!
		System.out.println("Tost sayisi = "+sayi+ " malzeme = " + malzeme);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContructorCallOtherConstructor tost =  new  ContructorCallOtherConstructor();
		tost.siparisGoster();

	}

}
