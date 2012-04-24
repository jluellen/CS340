import java.io*;
import java.util.Scanner;

class ParkingLot {
	
		public ParkingLot(int max_cars, int current_cars, time) {
			
			System.out.print("Creating a new parking lot that holds %d of a max %d cars\n", current_cars, max_cars);
			System.out.print("Time spent parking %d /n", time);
			

		}
			
	}

	
class GenLot {
			// Generates a simulation of cars arriving to the lot.
			int randomInt = randomGenerator.nextInt(100);
				if (randomint == 1) {
					// A car has arrived and is attempting to park
					current_cars++;
					if (current_cars >= max_cars) {
						System.out.println("Lot is full");
						time + parkingTime*2; // Adds twice the amount of parking time because you must go through the entire lot and realize
										   // that the lot is currently full
						int carsLeft++;
						}
						
					else if  (current_cars < max_cars) { 
						System.out.println("Car was parked");
						time + parkingTime;						
						}
					}
				if (randomint == 10) {
					// A car is leaving
					current_cars--;
					if (current_cars == 0){
						System.out.println("Parking Lot is empty");
						}
					}

					
public class ParkingLotApp {
		
		int max_cars = 100;
		int current_cars = 0;
		ParkingLot( max_cars, current_cars);
		int parkingTime = 0;
		int time = 0;
		int Arrival = 0;
		int Departure = 0;
		
		public static void main(String[] args) {
			
			String filename = "lot-data.txt";
			String contents = getContents(filename);
			String [] lines = contents.split(System.getProperty("line.seperator"));
				
			ParkingLot lot;
			String [] lot_params = lines[0].split(" ");
			lot = new ParkingLot(Integer.parseInt(lot_params[0]), Integer.parseInt(lot_params[1]));
				for (int i=1; i<lines.length; i++) {
					switch (Integer.parseInt(lines[i])) {
						int info = Integer.parseInt(lines[i]);
						
						case -3:
							System.out.println("-Three");
							Departure--;
							break;
						case -2:
							System.out.println("-Two");
							Departure--;
							break;
						case -1:
							System.out.println("-1");
							Departure--;
							break;
						case 0:
							System.out.println("Zero");
							
							break;
						case 1:
							System.out.println("One");
							time + 43;
							Arrival++;
							break;
						case 2:
							System.out.println("Two");
							time + 24;
							Arrival++;
							break;
						case 3:
							System.out.println("Three");
							time + 31;
							Arrival++;
							break;
						default:
							Systems.out.println("Unknown");
			}
			// Sends ParkingLot the information it needs.
			
			current_cars = Arrival - Departure;
			ParkingLot(max_cars, current_cars, time);
		
		}
	}
	
	// This function takes the filenane and returns it's contents as a string
	
	static public String getContents(String filename) {
		StringBuilder contents = new BufferBuilder;
			try {
				BufferedReader input = new BufferedReader(new FileReader(filename));
				try {
					String line= null;
					while ((line = input.readline()) !=null){
						contents.append(line);
						contents.append(System.getProperty("Line.separator"));
					}
				}
				finally {
					input.close();
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return contents.toString();
		}
		
	}
				
			
				
				
			}
				
					