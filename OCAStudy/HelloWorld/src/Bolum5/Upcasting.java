package Bolum5;


// Upcasting
class KontrolMerkezi {
	// Static bir metod!!!
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
	
	
	// Static bir metod!!!
	public static void checkup(Sporcu s) {
		s.calis();
	}
	
	public static void main(String[] args) {
		Sporcu s = new Sporcu();
		Futbolcu f = new Futbolcu();
		
		KontrolMerkezi.checkup(s);
		KontrolMerkezi.checkup(f);
		
		checkup(s);
		checkup(f);

	}

}
