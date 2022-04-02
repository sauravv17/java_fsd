package interface_tut;

public class MobilePhone implements ITelephone{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("turning on");
		
	}

	@Override
	public void dial(int PhoneNo) {
		// TODO Auto-generated method stub
		
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
