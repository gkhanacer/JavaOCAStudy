package Interview.forLoopProblems;

import java.util.Scanner;

/*
 * row=5 için
 *  x
 *  xx
 *  xxx
 *  xxxx
 *  xxxxx
 */

public class Star1 {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanner = new Scanner(System.in);
		int row;
		
		System.out.print("Sayır sayısını giriniz : ");
		
		while(true){
			if (scanner.hasNextInt()){
				row = scanner.nextInt();
				break;
			}
			else {
				System.out.print("Lütfen geçerli bir sayı girinis :");
				scanner.nextLine();
			}
		}
		
		/*
		 *  x
		 *  xx
		 *  xxx
		 *  xxxx
		 *  xxxxx
		 */
		for(int i=1; i<=row; ++i){
			for(int j=1; j<=i; ++j){
				System.out.print("x");
			}
			System.out.println();
		}
		
		/*
		xxxxx
		xxxx
		xxx
		xx
		x
		*/
		for(int i=row; i>0; --i){
			for(int j=i; j>0; --j){
				System.out.print("x");
			}
			System.out.println();
		}
		
		/*
		    x
		   xx
		  xxx
		 xxxx
		xxxxx
		*/
		for(int i=1; i<=row; ++i){
			for(int j=1; j<=(row-i); ++j){
				System.out.print(" ");
			}
			for(int k=1; k<=i; ++k){
				System.out.print("x");
			}
			System.out.println();
		}
		
		/*
		xxxxx
		 xxxx
		  xxx
		   xx
		    x
		*/
		for(int i=row; i>0; --i){
			for(int j=1; j<=(row-i); ++j){
				System.out.print(" ");
			}
			for(int k=1; k<=i; ++k){
				System.out.print("x");
			}
			System.out.println();
		}		
		
		
		
		
	}

}
