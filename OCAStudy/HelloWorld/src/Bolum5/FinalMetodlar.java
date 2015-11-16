package Bolum5;


/*
 * final METODLAR
 * Türetilen alt sınıflar tarafından override edilmesini engellemek istediğimiz metodu final tanımlarız.
 */

class A {
	public final void ekranabas () {
		System.out.println("A ekranabas");
	}
	
	/*
	 *  final ve private bir metod, başka bir metod tarafından override ediliyormuş gibi görünür ama 
	 *   override söz konusu değildir.
	*/
	private final void sucluYakala() {
		System.out.println("A suclu yakala");
	}
}

class B extends A {
	public final void ekranabas () {
		System.out.println("A ekranabas");
	}
	
	// override yok!!!
	public void sucluYakala() {
		System.out.println("A suclu yakala");
	}
}
public class FinalMetodlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
