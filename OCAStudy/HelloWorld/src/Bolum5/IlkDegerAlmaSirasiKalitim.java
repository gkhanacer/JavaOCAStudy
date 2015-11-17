package Bolum5;

/*
 * Eğer bir sınıfa ait statik global alan veya statik metod çağrılırsa, 
 * bu sınıf , Class loader tarafından yüklenir.
 * 
 * Eğer bir nesne oluşturulmak istenirse yine Class Loader bu sınıfı yükler.
 * 
 * Eğer bir sınıf  yüklenecekse önce o sınıfın türediği sınıflar Class Loader tarafından yüklenir.
 * 
 * Aşağıdaki örneği "java Bocekcik" komutuyla çalıştırdığımızda :
 * 1. Bocekcik sınıfına ait statik metod olan main metodu çağırılıyor.
 * 2. Class Loader Bocekcik.class fiziksel dosyasını bulur ve Bocek sınıfından türediğini tespit eeder.
 * 3. Kalıtım kavramından dolayı Class Loader sırayla en tepedeki sınıftan en alttaki sınıfa doğru sınıfları yükler.
 * 4. Class Loader tarafından sınıflar yüklenirken statik global alanlara hemen ilk değerleri verilir. 
 *    Değer verme işlemi en yukarıdaki sınıftan başlar ve türemiş alt sınıflara doğru devam eder.
 */

// 2. Bocekcik sınıfı Bocek sınıfından önce türediği için Class Loader önce Bocek sınıfını yükler.
class Bocek {
	
	// 8. Bocek sınıfından nesne oluşturulurken global alanlara ilk değerler verilir. Sonra yapılandırıcı çağırılır.
	int a = 10;
	int b;
	
	// 9. Yapılandırıcı çalışır.
	public Bocek() {
		ekranaBas("a = " + a + ", b = " + b );	
		b = 19;
	}

	// 3. Sınıf yüklenirken statik global alanlara hemen ilk değer verilir.
	static int x1 = ekranaBas("static Bocek.x1 değeri verildi.");
	
	static int ekranaBas(String string) {
		System.out.println(string);
		return 10;
	}
}

// 4. Bocekcik sınıfı Class Loader tarafından yüklenir.
class Bocekcik extends Bocek {
	
	// 10. Bocek sınıfından sonra Bocekcik sınıfından nesne oluşturulur ama önce global alanlara ilk değerleri verilir.
	int k =  ekranaBas("Bocekcik.k ilk değeri verildi.");
	
	
	// 11. Yapılandırıcı çağırılır.
	public Bocekcik() {
		ekranaBas("k = " + k);
		ekranaBas("b = " + b);
	}
	
	// 5. Sınıf yüklenirken statik global alanlara hemen ilk değer verilir.
	static int x2 = ekranaBas("static Bocekcik.x2 değeri verildi.");
	
	
	// 1. main fonksiyonu çağrılır ve Class Loader sınıfları yükler.
	public static void main(String[] args) {
		
		// 6. main fonksiyonu çağırılır.
		ekranaBas("Bocekcik -  basla..");
		
		// 7. Bocekcik sınıfından bir nesne oluşturulmaya çalışılır. Ama önce Bocek sınıfından nesne oluşturulur.
		Bocekcik b = new Bocekcik();

	}
}

public class IlkDegerAlmaSirasiKalitim {

}
