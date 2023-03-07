package EncapsulationS8;

public class MainPrinter {

	public static void main(String[] args) {
		PrinterChallenge printer1 = new PrinterChallenge(true);
		
		printer1.printingHistory();
		printer1.checkRemainingToner();
		
		printer1.printPages(11);
		printer1.checkRemainingToner();
		printer1.printingHistory();
		
		PrinterChallenge printer2 = new PrinterChallenge(false);
		
		printer2.checkRemainingToner();
		
		printer2.printPages(11);
		printer2.checkRemainingToner();
		printer2.printingHistory();
		printer2.addToner(-150);
		printer2.addToner(100);
		printer2.printingHistory();
		
		
		PrinterChallenge printer3 = new PrinterChallenge(true);
		printer3.printPages(199);
		printer3.checkRemainingToner();
		printer2.printingHistory();
		printer1.addToner(50);
		printer2.addToner(50);
		

	}

}
