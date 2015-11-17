package Bolum7;

/*
 * Java'da çoklu kalıtım özelliği direkt yoktu.
 * Ancak çoklu kalıtım interface ve inner class'lar ile gerçekleştiriliyor.
 */

interface BuzUstundeKayabilme {
	public void buzUstundeKay();
}

interface SuAtabilme {
	public void suAt();
}

public class InterfaceMultipleInheritance implements BuzUstundeKayabilme, SuAtabilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void suAt() {
		System.out.println("su at");
		
	}

	@Override
	public void buzUstundeKay() {
		System.out.println("buzda kay");
		
	}

}
