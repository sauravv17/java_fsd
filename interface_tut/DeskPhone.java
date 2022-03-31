package interface_tut;

public class DeskPhone implements ITelephone{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("always on");
		
	}

	@Override
	public void dial(int PhoneNo) {
		// TODO Auto-generated method stub
		System.out.println("dialing" + PhoneNo +".....");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean callPhone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}

}
