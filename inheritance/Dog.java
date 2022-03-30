package inheritance;

public class Dog extends Animal{
	private int eyes;
	private int legs;
	private int tail;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail) {
		super(name, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.foodtype ='x';
	}

	

	}

}
