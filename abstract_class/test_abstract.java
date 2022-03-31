package abstract_class;

public class test_abstract {
	public static void main(String[] args) {
		
		Animal animal=new dog("doggy");
		animal.eat();
		animal.breathe();
		
		bird parrot =new Parrot("parrot");
		parrot.breathe();
		parrot.eat();
		
	
}
}
