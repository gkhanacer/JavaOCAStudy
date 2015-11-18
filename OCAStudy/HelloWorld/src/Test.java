

abstract class Aa {
	
}

class A {

	void doMore() {
		B b = new B();
		b.setBadBoy("Levent");
		System.out.println(b.getBadBoy());

	}
}

class B {
	private String badBoy;

	public String getBadBoy() {
		return badBoy;
	}

	public void setBadBoy(String badBoy) {
		this.badBoy = badBoy;
	}
}

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 19;
		
		A a =  new A();
		a.doMore();
		
		boolean b = false;
		int i = 7;
		double d = 1.23;
		float f = 4.56f;
		
		System.out.printf(" %b", b); 
		System.out.printf(" %d", i); 
		System.out.format(" %f", d); 
		System.out.format(" %d", i); 
		System.out.format(" %f", f);
	}
	
	
}
