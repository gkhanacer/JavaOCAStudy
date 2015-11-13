package Bolum3;


class Kagit {
	
	public Kagit(int i) {
		System.out.println("Kağıt ("+i+")");
	}
}
public class IlkDegerAlmaSirasi {

	
	/*
	 *  Statik alanlar, sınıflara ati olan alanlardır ve static olmayan alanlara(nesne alanları) göre 
	 *  başlangıç değerlerini daha önce alırlar.
	 */
	static Kagit ks1 = new Kagit(101);  //DİKKAT - 1
	
	/*
	 * Nesnelere ait global alanlara değerleri yapılandırıcıdan bile önce verilir.
	 */
	Kagit k1 = new Kagit(1); //Dikkat - 2
	
	public IlkDegerAlmaSirasi() { // dikkat - 3
		System.out.println("Yapılandırıcı");
		// DİKKAT k2 kodda sonradan tanımlansa da derleyisi global alanlara ilk değer 
		// yapılandırıcıdan önce verdiği için tanımlıdır. Hata vermez.
		k2 = new Kagit(33); 
	}
	
	Kagit k2 = new Kagit(2); //Dikkat - 2
	
	static Kagit ks2 = new Kagit(102);  //DİKKAT - 1
	
	public void islemTamam(){
		System.out.println("işlem tamam");
	}
	
	Kagit k3 = new Kagit(3); //Dikkat - 2
	
	static Kagit ks3 = new Kagit(103);  //DİKKAT - 1
	
	public static void main(String[] args) {
		
		IlkDegerAlmaSirasi ini =  new IlkDegerAlmaSirasi();
		ini.islemTamam();
	

	}

}
