package Interview.stringProblems;

import java.util.Map;
import java.util.HashMap;

public class NumberOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------------");
		eleminateString("aaba kouq bux", 3);
		
		System.out.println("-------------------------------");
		eleminateString("   asa fsdf das asas", 3);
	}

	public static String eleminateString(String str, int n){
		
		// Gelen string önce trim edilerek başındaki ve sonundaki boşluklar yok edilir.
		str = str.trim();
		System.out.println("Gelen String \t\t:" + str);
		
		// Hangi karakterden kaç adet olduğunu öğrenmek için HashMap kullanıyoruz.
		// HashMap'te key:harf, value:harf sayısı
		Map<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++){
			
			// Eğer bu harfe ilk defa rastlanmışsa hashmap'e bu harfimizi ekliyoruz ve harf sayısına 1 diyoruz.
			// Daha önce eklenmişse harf sayısını 1 arttırıyoruz. Değeri güncelliyoruz.
			if(hashmap.containsKey(str.charAt(i)) == false)
				hashmap.put(str.charAt(i), 1);
			else
				hashmap.put(str.charAt(i), hashmap.get(str.charAt(i)) + 1);
			
				// Eğer bu harfin sayısı eşik değerine eşit veya fazlaysa 
				// bu karakteri X ile yer değiştirerek işaretliyoruz.
				// Eğer boşluk karakteriyse bir işlem yapmıyoruz.
				if((hashmap.get(str.charAt(i)) >= n) && (str.charAt(i) != ' '))
					str = str.replace(str.charAt(i)+"", "X");
		}
		System.out.println("İşaretlenmiş String \t:" + str);
		
		// İşaretlenmiş harfler boş değerle yer değiştirilerek programımızın çıktısı elde edilir.
		str = str.replace("X", "");
		System.out.println("Sonuç  \t\t\t:" + str);
				
		return str;
	}

}
