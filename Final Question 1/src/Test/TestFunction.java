package Test;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Test;

import Question_1.Vechicle;
import Question_1.Truck;
import Question_1.car;
import Question_1.MotorCycle;
import Question_1.Person;

public class TestFunction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void UnitTest(){
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
