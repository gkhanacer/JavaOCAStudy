package Bolum3;

public class Arrays {

	/*
	 * Diziler nesnedir.
	 * Dizilerin referansları vardır.
	 * Dizileri oluşturmak için new anahtar kelimesi kullanılır.
	 * Dizilerin tüm elamanları aynı türdendir. (double, float, herhangi bir sınıf tipi...)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] dd;
		double de[];
		float [] fd;
		Object [] ao;
		
		double[] d = new double[20]; // 20 elemanlı double tipindeki dizi
		double [] e = new double[20];// 20 elemanlı double tipindeki dizi
		float f[] = new float[20]; // 20 elemanlı float tipindeki dizi
		Object o [] = new Object[20]; // 20 elemanlı Object sınıfı tipindeki dizi
		String s [] =  new String[20]; // 20 elemanlı String tipindeki dizi
		
		// Primitive Tiplerden Oluşan Dizi
		// getiriler dizi referansı stact'te, referansın bağlı olduğu dizi nesnesi heap'te tutulur.
		double[] getiriler  = {3.23, 23.23, 0.23 };
		
		
		// Nesnelerden Oluşan Dizi
		// Dizinin elemanları herbir nesnenin referansıdır.
		// Dizinin referansı stact'te, dizinin elemanı olan referanslar ve referanslara ait nesneler heap'te tutulur.
		
		
		// Dizi boyutu
		// Dizinin boyutu bir kez verildikten sonra değiştirilemez. Immutable
		int [] liste = new int[20];
		liste = new int[25]; // Yeni nesne oluşturuldu, 'new int[20]' olan nesne GC tarafından temizlenir.
		
		// ArrayIndexOfBoundsException
		// Olmayan bir indise erişilmeye çalışılırsa run-time'da hata alınır.
		// Bu exceptionla hata yakalanır.
		//double ddd = getiriler[78];
		//getiriler[78] = 78.8;
		
		// Dizileri küçükten BÜYÜĞE sıralamak için java.util paketindeki Arrays sınıfı kullanılabilir.
		java.util.Arrays.sort(getiriler);
		for(int i=0; i<getiriler.length; i++)
			System.out.println("getiriler["+i+"] : " + getiriler[i]);

		
		// Dizilerin koplayalanması : System.arraycopy
		int[] dizi1 = {1,2,3,4};
		int[] dizi2 = {100,90,34,13,45,46,1};
		System.arraycopy(dizi1, 0, dizi2, 0, dizi1.length);
		for(int i=0; i<dizi2.length; i++)
			System.out.println("dizi2["+i+"] : " + dizi2[i]);
		
		// ÇOK BOYUTLU DİZİLER
		int [][] cb = {
				{2, 4, 5},
				{4, 5, 7}
		};
		
		int [][] cb2 = new int[3][4];
		// int [][] cb2 = new int[][4]; // HATA!
		
		System.out.println("ÇB Dizinin row (satır) sayısı : " + cb.length);
		for (int i = 0 ; i < cb.length ; i++ ){
			for (int j = 0 ; j < cb[i].length ; j++ ){
				System.out.println("cb[" + i + "][" + j + "] = " + cb[i][j]);
			} 
		}
		
		// length fonksiyonu çb dizinin ilk tanımlanan boyutunun uzunluğunu verir. 
		int [][][][] cb3 = new int[3][4][5][6];
		System.out.println("ÇB Dizinin row (satır) sayısı : " + cb3.length); 			// 1. Boyutun Uzunluğu
		System.out.println("ÇB Dizinin row (satır) sayısı : " + cb3[0].length);			// 2. Boyutun Uzunluğu
		System.out.println("ÇB Dizinin row (satır) sayısı : " + cb3[0][0].length);		// 3. Boyutun Uzunluğu
		System.out.println("ÇB Dizinin row (satır) sayısı : " + cb3[0][0][0].length);	// 4. Boyutun Uzunluğu
		
		
		// Dizilere bağlı dizilerin aynı uzunlukta olma zorunluluğu yoktur.
		// 3 elamanlı bir dizilerin dizisi tanımlanıyor
		int tl [][] =  new int[3][]; // 2. BOYUTUN UZUNLUĞU VERİLMİYOR.
		// Dizilerin dizisinin ilk elamanı 2 elemanlı bir dizi.
		tl[0] = new int[2];
		tl[1] = new int[3];
		tl[2] = new int[4];
	}

}
