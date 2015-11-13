package Bolum3;

public class MethodOverloading {

	// HATA ALIR! DÖNÜŞ DEĞERLERİNE GÖRE AYNI İSİMDEKİ METHODLAR AYIRT EDİLEMEZ!!!
	// Değer döndüren bir metodu döndürdüğü tipe karşılık gelen değişkene atama zorunluluğu yoktur.
	// Bu durumda Java hangi yordamın çağrılacağını bilemez.
	// Bu nedenle Java dilinde dönüş tiplerine göre metodların ayırt edilmesi kabul görmez;
	// ayırt edilmesini sağlayan tek şey parametrelerindeki farklılıktır!!!
	
	public void toplama(){
		System.out.println("toplama metodu.");
	}
	
	public double toplama(){
		System.out.println("double toplama metodu.");
		return 1.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo =  new MethodOverloading();
		double r = mo.toplama();
		mo.toplama();
	}

}
