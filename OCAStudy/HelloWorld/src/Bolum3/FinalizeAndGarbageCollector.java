package Bolum3;


class Elma {
	
	int i = 0;
	
	Elma(int y) {
		this.i = y;
		System.out.println("Elma nesnesi oluşturuldu : " + i);
	}
	
	/*
	 *  finilize()
	 *  Garbage collector bir nesne kullanılmadığında onu bellekten siler ve bunu programcıdan bağımsız yapar.
	 *  GC, bir nesneyi bellekten silmeden önce o nesnenin finilize() metodunu çağırır.
	 *  Böylelikle bellekten silinecek olan nesnenin yapması gereken son işlemler varsa bu işlemler finalize metodu içerisinde yapılır.
	 */
	public void finalize(){
		System.out.println("Elma nesnesi yok ediliyor : " + i);
	}
}

public class FinalizeAndGarbageCollector {
	

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			Elma e = new Elma(i);
		}
		
		
		// Bu komut ile GC tetiklnir ve gereksiz olan nesneler bellekten silinir.
		System.gc();
		
		for(int i=10; i<21; i++) {
			Elma e = new Elma(i);
		}
		

		// DİKKAT!Çöp toplayıcı herhangi bir referansa bağlı olmayan nesneleri bellekten siler.
		Elma el = new Elma(100);
		new Elma(101);
		System.gc();
		

	}

}
