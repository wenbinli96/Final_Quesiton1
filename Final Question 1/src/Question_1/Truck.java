package Question_1;

public class Truck extends Vechicle{
	
	public int NumberOfAxels;
	
	
	public int getNumberOfAxels() {
		return NumberOfAxels;
	}


	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}


	public void transferOwnership(Person newOwner) {
		this.transferOwnership(newOwner);
		
	}
	
	

}
