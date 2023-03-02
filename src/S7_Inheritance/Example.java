package S7_Inheritance;

public class Example {
	
	
	private int a;
	private int b;
	
	
	public int sum (int a, int b) {
		return a+b;
	}
	
	public int otherSum (int a, int b) {
		return this.a + this.b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	

}
