package oopChallenge;

public class Main {

	public static void main(String[] args) {
		Hamburger hamburger = new RegularHamburger("regular" , 3);
		
		Hamburger plus = new PlusHamburger("plus",2);
		
		System.out.println(hamburger.getPrice());
		System.out.println(plus.getPrice());
		

	}

}
