

// PAKET : Aynı amacayönelik iş yapan sınıfların bir çatı altında toplanması amaçlanmaktadır.
// Buraya paket ismi yazılır.
// Herhangi bir paket ibaresi yerleştirilmediğinde Java bu sınıfları default package olarak algılayacaktır.
// PackageSample.java dosyası işletim sisteminin bu paket ismiyle paralel olan bir dizin yapısına kayıt edilmesi gerekir.
// Paket isimleri internet alan adlarının tersten yazılmış halleridir. Örn : www.kou.edu.tr --> tr.edu.kou.math
package Bolum4;

import java.util.ArrayList;

// Java uzantılı dosya ile public sınıf ismi birebir aynı olmalıdır.
// Bu dosya javac komutu ile derlendiğinde PackageSamples.class ve Test.class olan 2 adet .class dosyası elde edilir.
public class PackageSamples {

	public static void main(String[] args) {
		
		// Eğer bir sınıf aynı isimde farklı paketlerde iki sınıfı aynı anda kullanmak istiyorsa o sunufun içinde bulunduğu
		// paketin ismini açık bir şekilde yazmalıdır.
		java.util.ArrayList arraylist = new java.util.ArrayList();
		// tr.edu.kou.ArrayList arraylist = new tr.edu.kou.ArrayList();
		
		
	}

}


class Test {
	public void kos(){
		
	}
}
