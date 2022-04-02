package encapsulation;

public class Printer {
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(boolean duplex) {
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}
	
	public int printPages(int pages) {
		System.out.println("printing "+pages +" pages");
		int pagesToPrint =pages;
		if (this.duplex) {
			pagesToPrint=(pages/2) + (pages%2);
			System.out.println("printing in duplex");
			
		}
		this.pagesPrinted +=pagesToPrint;
		return pagesToPrint;
	}
	public int getPagesPrinted() {
		return this.pagesPrinted;
	}
	
	
}
