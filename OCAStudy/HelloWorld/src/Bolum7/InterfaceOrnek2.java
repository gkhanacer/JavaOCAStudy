package Bolum7;

interface Hayvan {
	public void avlan();
}

/*
 * Interface'i implement eden bir Abstract(soyut) sınıf, interface'in metodlarını override etmek zorunda değildir.
 * Normal sınıflar zorunludur!!!!
 */
abstract class Kedi implements Hayvan {
	public abstract void takipEt();
}

/* 
 * Kaplan sınıfı hem interface'i implement etmiş sayılır hem de abstract sınıftan türemiş sayılır.
 * Bu nedenle hem avlan() hem de takipEt() metodlarını override etmek zorundadır.
 */
class Kaplan extends Kedi {

	@Override
	public void avlan() {
		System.out.println("Kaplan avlanıyor...");
	}

	@Override
	public void takipEt() {
		System.out.println("Kaplan takip ediyor...");
	}
	
}


public class InterfaceOrnek2 {

	public static void main(String[] args) {
		Kaplan k = new Kaplan();
		k.avlan();
		k.takipEt();
		System.out.println();
		
		Kedi ke = new Kaplan();
		ke.avlan();
		ke.takipEt();
		System.out.println();
		
		Hayvan h = new Kaplan();
		h.avlan();
		//h.takipEt(); // hata!

	}

}
