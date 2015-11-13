package Bolum2;



public class PassByValueForPrimitiveTypes {
	
	// Burada yeler bir a değişkeni oluşturulmuştur ve gelen d'nin kopyasıdır.
	// a ve d ayrı değerlerdir, zaten yerleri de heap'te değil stack memory'dedir.
	static void f(double a){
		System.out.println(a + " gönderildi");
		a = 10;
		System.out.println("gönderilen parametrenin değeri 10'a eşitlendi.");
	}
	
	public static void main(String[] args){
		
		// Primitive tipler değerleri kendi üzerlerinde taşırlar.
		// Yordamlara gönderilen parametreler yerel değişken gibidir.
		double d = 5;
		f(d);
		System.out.println("d--->" + d);
	}
}
