package abstract_class;

public class dog extends Animal{

	public dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName() +"is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("breathe....");
		
	}

}
