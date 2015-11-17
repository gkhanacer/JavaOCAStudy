package Bolum6;

class Xmodel {
	public void sesAc() {
		System.out.println("X model sesAc()");
	}
	public void sesKapa() {
		System.out.println("X model sesKapa()");
	}
	public void kanalDegistir() {
		System.out.println("X model kanalDegistir()");
	}
}

class Ymodel extends Xmodel {
	
	// Override metodlar
	public void sesAc() {
		System.out.println("Y model sesAc()");
	}
	public void sesKapa() {
		System.out.println("Y model sesKapa()");
	}
	public void kanalDegistir() {
		System.out.println("Y model kanalDegistir()");
	}
	
	// Yeni metod
	public void teletext() {
		System.out.println("Y model teletex()");
	}
}

public class UpcastingHata {

	public static void main(String[] args) {
		
		// Upcasting metodları Xmodel'e bağlı referansla çağrılabilir.
		Xmodel xmodel = new Ymodel();
		xmodel.sesAc();
		xmodel.sesKapa();
		xmodel.kanalDegistir();
		

		// HATA : Yeni tanımlanmış metodlar üst sınıfa ait referans ile çağrılamaz!!!!
		xmodel.teletext();
	}

}
