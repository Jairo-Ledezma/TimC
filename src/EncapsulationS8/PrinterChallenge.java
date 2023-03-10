package EncapsulationS8;

public class PrinterChallenge {

	private  double tonerLevel = 100;
	private  int pagesPrinted = 0;
	private boolean duplex;

	public PrinterChallenge(boolean duplex) {
		
		this.duplex = duplex;

	}

	public void addToner(double tonerAmount) {

		if (tonerAmount <= 0) {
			System.out.println(tonerAmount + " can't be added");
			checkRemainingToner();
		} else if ((tonerLevel + tonerAmount) > 100) {
			System.out.println("Printer toner level was " + tonerLevel + " only "
					+ ( 100 - tonerLevel) + "% was taken");
			tonerLevel = 100;
			checkRemainingToner();
		} else {
			tonerLevel += tonerAmount;
			checkRemainingToner();
		}
	}

	public void printPages(int printedSheets) {
		if (doesPrinterHaveEnoughToner(printedSheets)) {

			if (printedSheets == 1) {
				System.out.println(printedSheets + " sheet has been printed");
				pagesPrinted += printedSheets;
			} else if (duplex) {
				int actualPrintedPages = (int) Math.ceil((double) printedSheets / 2);
				System.out.println("since Duplex feature is active " + printedSheets
						+ " pages were sent to be printed but only " + actualPrintedPages + " were printed");
				pagesPrinted += actualPrintedPages;
			} else {
				System.out.println(printedSheets + " pages were printed");
				pagesPrinted += printedSheets;
			}
		} else {
			return;
		}
	}

	public void printingHistory() {
		System.out.println("this printer trough all its instances has printed " + pagesPrinted + " pages");
	}

	

	public void checkRemainingToner() {
		System.out.println("you have " + tonerLevel + "% toner left");
	}

	private boolean doesPrinterHaveEnoughToner(int sheets) {
		double tonerUsed = (double)sheets / 2;
		
		if(tonerLevel == 0.0) {
			System.out.println("please add more toner before printing");
			return false;
		}else if (tonerUsed > tonerLevel) {
			System.out.println("There is not enough toner in the printer, try sending less sheets to print");
			return false;

		} else {
			tonerLevel-=tonerUsed;
			return true;
		}

	}

}
