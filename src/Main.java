import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create a vehicle called v
		Vehicle v = new Vehicle("Ford", "T812", 2014);

		v.printDetails();
		
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
		}
		
		System.out.println("\n\n");
		
		v.printDetails();
	}

}
