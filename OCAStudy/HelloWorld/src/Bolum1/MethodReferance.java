package Bolum1;

public class MethodReferance {

	// global değişkenlere ilk değerler atanmazsa default değerlerini alırlar.
	static int yas;
	static String ad;
	
	
	public static void main(String[] args) {
		
		System.out.println("ad: " + ad + " yas : "+ yas);
	}
	
	public int yasAta() {
		// Method'larda yerel değişkenlere ilk değerin atanması zorunludur!
		int a;
		//a++;
		yas = 10;
		return yas;
	}
}
