package Bolum2;

public class CompareObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer s1 = new Integer(47);
		Integer s2 = new Integer(47);
		
		// s1==s2 : s1 ve s2 referanslarının işaret etmiş oldukları nesneler aynı mı?
		// Cevap tabii ki false. İki nesne de aynı değeleri taşısada bunlar farklı iki nesnedir, bellekte yerleri farklıdır.
		System.out.println(s1==s2);
		
		
		int s3 = 47;
		int s4 = 47;
		
		// s3==s4: Primitive tipler değerleri doğrudan kendi üzerlerinde taşırlar. Bu nedenle cevap true döner.
		System.out.println(s3==s4);
	}

}
