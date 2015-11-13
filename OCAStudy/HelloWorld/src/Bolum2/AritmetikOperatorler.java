package Bolum2;

public class AritmetikOperatorler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 15;
		double b = 20.23;
		// Eğer bir int ile bir double bir işleme tabii tutulursa sonuç double olur. int otomatik double'a dönüşür.
		System.out.println("a * b = " + a*b);
		
		// Operatörlern veri tipini etkilemesi veya dönüştürmesi.
		
		// sonuç long ise değişkenler float veya double'dan farklıdır ve en az bir değişken long'tur.
		// sonuç int  ise değişkenler float veya double'dan farklıdır ve long'tan da farklıdır.
		// sonuç double ise en az bir değişken double'dır.
		// sonuç float ise değişlenlerin hiçbiri double değildir ve en az biri float'tır.
		
		// + operatörü char, byte veya short tipindeki değeri int'e dönüştürür.
		// - operatörü değişkenin değerini eksi yapar (-1 ile çarpar).
		char kr = 'A';
		System.out.println("kr :" + kr);
		int c =+ kr;
		System.out.println("c: " + c);
		int d =- kr;
		System.out.println("d: " + d);
		
	}

}
