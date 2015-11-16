package Bolum4;

/*
 * Access Modifiers : public, protected, friendly, private
 * Global alanlar ve metodlar ( static veya değil) için kullanılır.
 * Sınıflar (dahili sınıflar-inner class hariç) için yalnızca public ve friendly kullabilabilir.
 */

/*
 * friendly : friednly olan global alana, metoda veya sınıfa aynı paketteki sınıflar erişebilir,
 * 			  diğer paketlere ait sınıflar erişemez.
 * 
 * Bir global alan veya sınıfa hiç bir Acc.Mod. konulmazsa friendly olur.
 * 
 * 
 * Eğer sınıfların paketleri belitilmemişse default package altındadır ve bu sınıflar friendly ise 
 * birbirlerine erişebilir
 * 
 * public : public olan sınıflara, global alanalara ve metodlara herkes her yerden erişebilir.
 * 			public global alanlar ve metodlar dış dünya ile sınıf arasında arabirim rolünü üstlenir.
 * 
 *  private : private global alanlara ve metodlara ( sınıflar private olamaz, inner class hariç) aynı paketten
 *  		  veya farklı paketlerden erişilemez, ancak ait olduğu sınıfın içerisinden erişilebilir. 
 *  		  private metodlar : Devamlı değiştirilebilecek / geliştirilebilecek kodlar yazılmalıdır.
 *  
 *  protected : protected global alanlara ve metodlara ( sınıflar private olamaz, inner class hariç) sahip sınıflardan
 *  	        türeyen sınıflar erişebilir. 
 *  			Aynı paketteki sınıflar protected alanlara erişebilir, ayrı pakettekiler erişmez.
 *  			Türeyen sınıfılar ise farklı paketlerde bulunabilir ve protected alanlara erişebilir.
 *  
 *  Encapsulation : Dışarıdaki başka bir uygulamanın bizim nesnemiz ile arabirimler(public) sayesinde iletişim kurması gerektiğini
 *  				ancak, arka planda işi yapan esas kısmın gizlenmesi gerektiğini söyler. getter ve setter ile yapılır.
 *  
 *  Nesneler 2 bölüme ayrılır :
 *  	1. Nesnenin dış dünya ile iletişim kurabilmesi için gerekli arabirimler.
 *      2. Gemiyi yürüten kısım.
 */
class AccessModifiers {

	private int alinan = 0;
	private int geridondurulen = 0;
	
	public int getGeriDondurulen(){
		return geridondurulen;
	}
	
	public void setAlinan(int alinan) {
		this.alinan = alinan;
	}
	
	private void calis (){
		for(int j = 0 ;  j < alinan ; j++)
			System.out.println("sonuc : " + j);
		geridondurulen = alinan *2 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
