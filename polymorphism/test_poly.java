package polymorphism;

public class test_poly {
	public static void main(String[] args) {
		for (int i=0;i<10; i++) {
			Movie myMovie =randomMovie();
			System.out.println("Movie  "+ i + myMovie.getName() + "\n" + "Plot"+ myMovie.plot());
		}
	}

	private static Movie randomMovie() {
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random() * 5 + 1);
		System.out.println("Random Number generated was: " + randomNumber);
		
		switch (randomNumber) {
		case 1:
		return new Jaws();
		case 2:
			return new IndependanceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new SomeMovie();
		}
		return null;
	}
}
