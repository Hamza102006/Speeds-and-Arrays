import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Hamza Khan 
 * 
 * Date: Spetember 11, 2023
 * 
 *Description: Calculates the average speed of an object based on the distance travelled and time taken
 *
 */
public class SpeedCalc {


	/*
	 * Method to calculate speed
	 */

	public static double calcSpeed(double d, double t) {
		return d/t;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// declare variables for distance, time and average speed

		double distance[]; 
		double time []; 
		double speed [];

		int numOfelements = 0;


		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		//prompt for the number of elements
		System.out.println("Enter the number of calculations");
		numOfelements = Integer.parseInt(input.readLine());

		// create the arrays 

		distance = new double[numOfelements];
		time = new double [numOfelements];
		speed = new double [numOfelements];

		for (int i = 0; i < numOfelements; i++) {

			//prompt for and get the time and distance 
			System.out.println("Enter the distance in metres");
			distance [i]= Double.parseDouble(input.readLine());

			System.out.println("Enter the time in seconds");
			time [i] = Double.parseDouble(input.readLine());


			//calculate the speed (call a method) 

			speed [i] = calcSpeed(distance [i], time [i]);

			//display speed 
			System.out.println("The average speed is : " + speed[i] + "m/s");
		}


	}

}
