class BusReservation{
	public static void main(String[] args){

		String bus1 = "Volvo";
		String bus2 = "KSRTC";
		String bus3 = "Express";
		String bus4 = "Sleeper";
		String bus5 = "Luxury";

		String busTypes[] = {bus1, bus2, bus3, bus4, bus5};

		System.out.println("Bus 0 = "+busTypes[0]);
		System.out.println("Bus 1 = "+busTypes[1]);
		System.out.println("Bus 2 = "+busTypes[2]);
		System.out.println("Bus 3 = "+busTypes[3]);
		System.out.println("Bus 4 = "+busTypes[4]);

		int seat1 = 40;
		int seat2 = 35;
		int seat3 = 45;
		int seat4 = 30;
		int seat5 = 50;

		int seatAvailability[] = {seat1, seat2, seat3, seat4, seat5};

		System.out.println("Seats 0 = "+seatAvailability[0]);
		System.out.println("Seats 1 = "+seatAvailability[1]);
		System.out.println("Seats 2 = "+seatAvailability[2]);
		System.out.println("Seats 3 = "+seatAvailability[3]);
		System.out.println("Seats 4 = "+seatAvailability[4]);

		seatAvailability[2] = 20;

		System.out.println("Updated seats = "+seatAvailability[2]);
	}
}