package test;

import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * Demonstration of non atomic incrementation.
 * 
 * Problem: see Airlines.Flight.bookTicket()
 * 
 * 
 * @author zdenek
 * 
 */

public class Airlines {

	static Thread[] threads;

	static Flight flight;
	static volatile int numLoop;
	
	public static void main(String args[]) {

		// control the number of threads in conflict
		int numThreads;
		int capacity;
		long currentTime;
		
		if (args.length < 3) {
			System.out.println(" Airlines X Y Z (X=num_threads, Y=num_loop, Z=flight_capacity)");
			System.out.println("  num_threads = number of threads in conflict");
			System.out.println("  num_loop = how many iterations of noncritic parts (more -> less probability of race");
			System.out.println("  flight_capacity = length of the execution");
			return;
		}
		// get info from args
		try {
			numThreads = Integer.parseInt(args[0]);
			numLoop = Integer.parseInt(args[1]);
			capacity = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {
			System.err.println(" Argument must be an integer.");
			return;
		}

		currentTime = System.currentTimeMillis();

		threads = new Thread[numThreads];

		// make a flight with defined capacity
		flight = new Flight("OK 1222; A320; PRG -> BRU; 3.7.2007 11:00", capacity);

		// start sellers
		for (int i = 0; i < numThreads; i++) {
			threads[i] = new Thread(new TicketSeller(flight));
			threads[i].start();
		}

		// wait for sellers
		for (int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
			} catch (Exception e) {
				System.out.printf("grrrr\n");
			}
		}

		// give info concerning time
		System.out.println(" TIME=" + (System.currentTimeMillis()-currentTime));
		// print the flight status
		System.out.println(flight.getStatus());
	}

	// flight
	static class Flight {

		private final String flightName;

		private final int capacity;

		private int soldSeats;

		private int correctSoldSeats;

		Flight(String name, int numTickets) {
			flightName = name;
			capacity = numTickets;
			soldSeats = 0;
			correctSoldSeats = 0;
		}

		// buggy booking
		boolean bookTicket() {
			synchronized (this) {
				if (0 >= (capacity - correctSoldSeats))
					return false; // sold out
				// soldSeats should be guarded by a lock
				correctSoldSeats++;
			}

			// bug - this is not atomic
			soldSeats++;

			soldSeats = soldSeats + soldSeats - soldSeats;
			
			return true;
		}

		public String getStatus() {
			if (soldSeats == correctSoldSeats){
				return " Flight capacity: " + capacity + "   sold: "
				+ soldSeats + "   sold(correct): " + correctSoldSeats + "    OK";				
			}
			else{
				RaceDetector.setRunAsFail();
				return "Flight capacity: " + capacity + "   sold: "
				+ soldSeats + "   sold(correct): " + correctSoldSeats + "    FAIL";
			}
		}


		String getFlightName(){
			return flightName;
		}
	}
	
	// ticket sellers
	static class TicketSeller extends Thread {
		private final Flight flight;

		TicketSeller(Flight f) {
			flight = f;
		}

		public void run() {
			Boolean booked;

			do {
				// book ticket until sold out
				booked = flight.bookTicket();
				// do some other "useful" work
				for (int i = 0; i < numLoop; i++){
					booked = new Boolean(booked);
					if (booked.hashCode() == System.nanoTime())
						System.out.println("This never happen...");
				}
			} while (booked);

		}
	}
}
