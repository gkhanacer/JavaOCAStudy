package Bolum5;


class Calisan {
	public void calis(double a) {
		System.out.println("Calisan.calis()");
	}
}

class Mudur {
	// DİKKAT! Burada overriding yok, overloading var. Karıştırma!!!
	public void calis(int a) {
		System.out.println("Mudur.calis()");
	}
}

public class OverridingOverloadedKaristirma {

	public static void main(String[] args) {
		
		Mudur m = new Mudur();
		m.calis(2);

	}

}
