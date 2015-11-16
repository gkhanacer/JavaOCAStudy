package Bolum5;


/*
 * Ana sınıfa ait yapılandırıcı çağırma işlemi, default constructor'da otomatik yürütülür.
 */
class Hayvan {
	public Hayvan() {
		System.out.println("Hayvan yaratıldı");
	}
}

class Yarasa extends Hayvan {
	public Yarasa() {
		System.out.println("Yarasa yaratıldı");
	}
}

class UcanYarasa extends Yarasa {
	public UcanYarasa() {
		System.out.println("Uçan Yarasa yaratıldı");
	}
}

public class IlkDegerVermeSirasi {

	public static void main(String[] args) {
		
		/*
		 * Verilen örnekte UcanYarasa nesnesi oluşturulmadan önce UcanYarasa sınıfının
		 * ana sınıfı olan Yarasa sınıfı oluşturulmaya çalışılacaktır.
		 * Yarasa sınıfı oluşturulması için Hayvan sınıfı oluşturulmaya çalışılacaktır.
		 * Hayvan sınıfı oluşturulması için Object sınıfı oluşturulmaya çalışılacaktır.
		 */
		UcanYarasa uy = new UcanYarasa();

	}

}
