package interface_tut;

public class test_interface {
	public static void main(String[] args) {
		ITelephone tele = new DeskPhone();
		tele.powerOn();
		tele.dial(4556);
	}

}
