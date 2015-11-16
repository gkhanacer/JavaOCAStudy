package Bolum5;


/*
 * Ana sınıfa ait yapılandırıcı çağırma işlemi, default constructor'da otomatik yürütülürken
 * ana sınıfın parametre alan yapılandırıcısı çağırılırken 'super' anahtar kelimesi lkullanılır. 
 */

class Insan {
	public Insan(int par) {
		System.out.println("Insan yapılandırıcısı : " + par);
	}
}

class ZekiInsan extends Insan {
	public ZekiInsan(int par) {
		super(par+1);
		System.out.println("ZekiInsan yapılandırıcısı : " + par);
	}
}

class Hacker extends ZekiInsan {
	public Hacker(int par) {
		/*
		 * super anahtar kelimesi içinde bulunduğu yapılandırıcının ilk satırında çağırılmalıdır!!!
		 */
		super(par+1);
		System.out.println("Hacker yapılandırıcısı : " + par);
		// super(par+1); // Compile-time HATA!! İlk satırda çağırılmalı. 
	}
}
public class IlkDegerVermeSirasiParametreli {

	public static void main(String[] args) {
		Hacker h = new Hacker(5);

	}

}
