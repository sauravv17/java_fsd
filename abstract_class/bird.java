package abstract_class;

public abstract class bird extends Animal{

	public bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is pecking");
		
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("breathe...");
		
	}
	public abstract void fly();
		
}


