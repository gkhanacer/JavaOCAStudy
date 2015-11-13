package Bolum2;

public class UclüIfElse {

	public static void main(String[] args) {
		// mantıksal-ifade ? deger0 : deger1;  
		// Eğer mantıksal ifade true ise değer 0 hesaplanır, false ise değer1 hesaplanır.
		
		int x = 3;
		int y = 4;
		
		int a = (x==y) ? 1 :0; 
		System.out.println(a);
		
		
		
		String string1 = "I love Java very much.";
		String string2 = (string1.matches(".*Java.*")) ?
		                  string1 : "I love nothing.";
		System.out.println(string2);
	}
}
