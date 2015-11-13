package Interview.forLoopProblems;

// 0 1 1 2 3 5 8 13 21 .. fibb(n) = fibb(n-1) + fibb(n-2)
public class Fibbonacci {

	public static final int N = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibb(N));
	}
	
	public static int fibb(int n){
		
		int prev=0, next=1, result=0;
		
		for (int i=0; i<N; ++i){
			result = next + prev;
			prev = next;
			next = result;
		}
		
		return result;
			
	}

}
