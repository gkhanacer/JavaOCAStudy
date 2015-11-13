package Bolum3;


class Kopek {
	
	public Kopek(String s) {
		System.out.println(s);
	}
}
public class TopluDegerAtamaStaticNonStatic {

	// static değerlere toplu değer atanması
	static int x;
	static double y;
	static Kopek kp;
	
	static {
		x = 5;
		y = 6.54;
		kp = new Kopek("Hav hav");
	}
	
	// static olmayan alanlara toplu değer atanması
	int k;
	double l;
	Kopek kl;
	
	{
		k = 12;
		l = 12.23;
		kl = new Kopek("Hav hav hav");
	}
	
	
	
	public static void main(String[] args) {

		new TopluDegerAtamaStaticNonStatic();
	}

}
