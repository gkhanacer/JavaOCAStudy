package Bolum7;

/*
 * Java'da overloaded olabilmesi dönüş tipinden bağımsızdır.(hatırlatma)
 * 
 * Interface'lerin içerisinde dönüştipleri dışında herşeyleri aynı olan gövdesiz/soyut metodlar varsa bu
 * çakışmaya neden olur.
 */

interface A1 {
	public void hesapla();
}

interface A2 {
	public void hesapla(int d);
}

interface A3 {
	public int hesapla();
}

/*
 * Sorunsuz çalışıyor. Çünkü A1 ve A2 interface'lerinin hesapla metodlarının parametreleri farklı.
 * overloaded.
 */
class S1 implements A1, A2 {

	//Overloaded.
	@Override
	public void hesapla(int d) {
		System.out.println("S1.hesapla");
		
	}
	
	//Overloaded.
	@Override
	public void hesapla() {
		System.out.println("S1.hesapla");
		
	}
}

/*
 * HATA :
 * A1 ve A3 interface'lerinin hesapla metodları adaştır. Bu nedenle overloaded değil çakışmıştır.
 * Dönüş tipleri farklı olması overloaded durumunu etkileyen bir husus değildir!!!!!
 */
class S2 implements A1, A3 {

	@Override
	public int hesapla() {
		// TODO Auto-generated method stub
		return 0;
	}


}

public class InterfaceCakisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
