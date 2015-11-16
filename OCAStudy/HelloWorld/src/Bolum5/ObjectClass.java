package Bolum5;

public class ObjectClass {

	public static void main(String[] args) {

		// Bütün sınıflar Object sınıftan türer. Gizli bir kalıtım vardır.
		ObjectClass oc1 =  new ObjectClass();
		ObjectClass oc2 =  new ObjectClass();
		
		
		// toString() ve equal() metodlaı tanımlanmamasına kullanılabildi,
		// çünkü tüm sınıflar gibi ObjectClass sınıfımız da Object sınıfından türedi
		// ve Object sınıfının global alanlarına ve metodlarına erişebiliyor.
		System.out.println("ObjectClass.toString() " + oc1.toString());
		System.out.println("ObjectClass.toString() " + oc2.toString());
		
		System.out.println("oc1.equals(oc2) : " + oc1.equals(oc2));
		
		
		// clone :  Nesnenin(this) aynısını klonlar ve yeni nesne döndürür.
		ObjectClass oc3 = (ObjectClass)((obj oc1.clone());
	}

}
