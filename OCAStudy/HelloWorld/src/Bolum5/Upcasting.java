package Bolum5;


// Upcasting
class KontrolMerkezi {
	public static void checkup(Sporcu s) {
		s.calis();
	}
}

class Sporcu {
	public static void calis() {
		System.out.println("Sporcu çalış");
	}
}

class Futbolcu extends Sporcu {
	public static void calis() {
		System.out.println("Futbolcu çalış");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		Sporcu s = new Sporcu();
		Futbolcu f = new Futbolcu();
		
		KontrolMerkezi.checkup(s);
		KontrolMerkezi.checkup(f);

	}

}
