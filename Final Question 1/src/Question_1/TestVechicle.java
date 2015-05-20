package Question_1;

public class TestVechicle {
	
	public static void main(String[] args){
		
		Person a = new Person();
		
		car NewCar = new car();
		NewCar.setNumberOFDoors(4);
		NewCar.setOwner(a);
		
		Person b = new Person();
		
		Truck NewTruck = new Truck();
		NewTruck.setNumberOfAxels(2);
		NewTruck.setOwner(b);
		
		NewTruck.transferOwnership(a);
		
		MotorCycle Moto = new MotorCycle();
		Moto.setHasSideCar(false);
		
	}

}
