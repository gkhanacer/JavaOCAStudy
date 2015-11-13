package Bolum3;

public class Static {

	/*
	 * Global alanlar 2'ye ayrılır:
	 * 1.  Statik alanlar
	 * 2.  Nesneye ait alanlar
	 */
	
	// Statik değişken x
	public static int x;
	
	// Global değişken y
	public int y;
	
	/* Statik metod
	 * Nesnelerden bağımsız metodlardır
	 * Statik bir metodu çağırmak için bir nesne oluşturulmak zorunda değildir.
	 * Statik olmayan metodlardan statik metodlar çağrılabilir.
	 * Statik metodlardan nesne metodları doğrudan çağrılamaz.
	 * 
	 * Nesne metodları
	 * Nesnenin durumuna ilişkin işlemleri yapmak için kullanılır.
	 */
	public static void ekranaBas(Static s){
		
		System.out.println("x : " + s.x + ", y : "+ s.y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HATA! static değişkenler global alanda yer alır, yerel değerler için geçerli değildir.
		// static int t = 10; 
		
		Static s1 = new Static();
		Static s2 = new Static();
		
		x = 10;
		/*
		 * Bu ifade şu işlemlerle aynıdır :
		 * s1.x = 10;
		 * s2.x = 10;
		 */
		
		s1.y = 2;
		s2.y = 8;
		
		// Statik metodlar çağrılıyor. Herhangi bir nesne oluşturulmadı.
		ekranaBas(s1);
		ekranaBas(s2);
		
		
		
	}

}
