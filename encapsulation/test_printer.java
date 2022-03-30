package encapsulation;

public class test_printer {
	public static void main(String[] args) {
		
		Printer printer = new Printer(true);
		System.out.println("Initial Page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());
		
	}
}
