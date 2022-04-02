package interface_tut;

public interface ITelephone {
	void powerOn();
	void dial(int PhoneNo);
	void answer();
	boolean callPhone(int PhoneNo);
	boolean isRinging();
	
}
