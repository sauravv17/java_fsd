package abstract_class;

public class Parrot extends bird{

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"is flying...");
		
	}

}
