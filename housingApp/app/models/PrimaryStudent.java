package models;

public class PrimaryStudent implements Student {
	
	private final String name;
	private final int id;
	private final int year;
	private final int draw;
	
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getDraw(){
		return this.draw;
	}
	

}
