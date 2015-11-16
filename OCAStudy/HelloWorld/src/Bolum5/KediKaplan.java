package Bolum5;

public class KediKaplan {

	public static void main(String[] args) {
		Kaplan kaplan = new Kaplan();
		kaplan.yakalaAv();
		System.out.println("Ayak sayısı : " + kaplan.ayakSayisi);
	}

}

class Kedi {
	protected int ayakSayisi =  4;
	
	public void yakalaAv(){
		System.out.println("Kedi av yakaladı");
	}
	
	// Sınıflar standalone çalışabilir.
	// Her sınıfa main fonksiyonu tanımlayım test edebiliriz.
	public static void main(String[] args) {
		Kedi kedi = new Kedi();
		kedi.yakalaAv();
	}	
	
}


// Kaplan sınıfına ait hiçbir şey tanımlanmamıştır.
// Bütün her şeyini türediği Kedi sınıfından alır.
class Kaplan extends Kedi {

}