package composition;

public class MotherBoard {
	private String model;
	private String manufacturer;
	
	
	public MotherBoard(String model, String manufacturer) {
		
		this.model = model;
		this.manufacturer = manufacturer;
	}


	public void loadProgram(String prog) {
		
		System.out.println("program" + prog +"loading...");
		
	}

}
