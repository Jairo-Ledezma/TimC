package EncapsulationS8;

public class MainPrinter {

	public static void main(String[] args) {
		PrinterChallenge printer1 = new PrinterChallenge(true);
		
		printer1.printingHistory();
		printer1.checkRemainingToner();
		
		printer1.printPages(11);
		printer1.checkRemainingToner();
		printer1.printingHistory();
		System.out.println("-".repeat(50));
		
		PrinterChallenge printer2 = new PrinterChallenge(false);
		
		printer2.checkRemainingToner();
		
		printer2.printPages(11);
		printer2.checkRemainingToner();
		printer2.printingHistory();
		printer2.addToner(-150);
		printer2.addToner(100);
		printer2.printPages(50);
		printer2.printingHistory();
		System.out.println("-".repeat(50));
		
		
		PrinterChallenge printer3 = new PrinterChallenge(true);
		printer3.printPages(199);
		printer3.checkRemainingToner();
		printer3.printPages(200);
		printer3.checkRemainingToner();
		printer3.printPages(1);
		printer3.addToner(0.5);
		printer3.printPages(1);
		printer3.printPages(1);
		printer3.addToner(100);
		printer3.printPages(3);
		printer3.checkRemainingToner();
		System.out.println("-".repeat(50));
		

	}

}
