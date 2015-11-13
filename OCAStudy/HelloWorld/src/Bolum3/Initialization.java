package Bolum3;

/*
 *  int x;  	// declaration
 *  x = 12; 	// defination
 *  int x = 12;	// intialization
 */
public class Initialization {

	/*
	 * Nesnelere ait global alanlar primitive tip olması durumdunda ilk değerleri verilmezse bile şu değerleri alırlar :
	 * boolean : false
	 * char [] : 0
	 * byte	   : 0
	 * short   : 0
	 * int     : 0
	 * long    : 0
	 * float   : 0.0
	 * double  : 0.0
	 * 
	 * Nesnelere ait global alanlar sınıf tipinde olması durumdunda başlangıç değeri olarak "null" atanır.
	 * Eğer bu alanlar bu içeriğiyle kullanılmaya çalışılırsa çalışma anı(run-time) hata ile karşılaşılır.
	 * String  : null
	 * 
	 * 
	 * "Sınıflara ait" global alanlara (statik alanlara) değer atamakla nesnelere ait global alanlara dğer atamak arasında bir fark yoktur.
	 * Static olması bir şeyi değiştirmez.
	 */
    int i_int;                      
    double d_double;        
    float f_float;               
    String str;
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String  : null
		Initialization ini = new Initialization();
		System.out.println(ini.str);
		
		// Run-time error!!
		ini.str =  ini.str.trim();
		
		
		/*
		 *  Yerel değişkenlere başlangıç değerleri programcı tarafından kullanılan yerel değişkenlere
		 *  ilk tepki derleme anında (compile-time) verilir.
		 */
		
		int x;
		
		// Eğer kod try bloğundan catch bloğuna geçerse x'ye değer atanamaz ve x'nin değeri daha sonraki satırlarda kullanılamaz.
		try {
			x = 12/4;
		}
		catch(ArithmeticException exc){
			System.out.println("Sıfırıa Bölme Hatası");
		    System.exit(1);
		}
		
		// Hata mesajı: "The local variable x may not have been initialized"
		//System.out.println(x);
		
		
		
		
		int y;
		int k = 5;
		
		// Eğer k'nın değeri 2'den büyük değilse y'ye değer atanamaz ve y'nin değeri daha sonraki satırlarda kullanılamaz.
		if (k > 2)
			y = 12;
		
		// Hata mesajı: "The local variable y may not have been initialized"
		//System.out.println(y);
		
	}

}
