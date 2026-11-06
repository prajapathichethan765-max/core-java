class AirportDetailss{
	public static void main(String[] args){

		String airport1 = "Kempegowda";
		String airport2 = "Heathrow";
		String airport3 = "Dubai";
		String airport4 = "Changi";
		String airport5 = "Indira Gandhi";

		String airportNames[] = {airport1, airport2, airport3, airport4, airport5};

		System.out.println("Airport 0 = "+airportNames[0]);
		System.out.println("Airport 1 = "+airportNames[1]);
		System.out.println("Airport 2 = "+airportNames[2]);
		System.out.println("Airport 3 = "+airportNames[3]);
		System.out.println("Airport 4 = "+airportNames[4]);

		long passenger1 = 500000L;
		long passenger2 = 750000L;
		long passenger3 = 900000L;
		long passenger4 = 650000L;
		long passenger5 = 800000L;

		long passengerCounts[] = {passenger1, passenger2, passenger3, passenger4, passenger5};

		System.out.println("Passengers 0 = "+passengerCounts[0]);
		System.out.println("Passengers 1 = "+passengerCounts[1]);
		System.out.println("Passengers 2 = "+passengerCounts[2]);
		System.out.println("Passengers 3 = "+passengerCounts[3]);
		System.out.println("Passengers 4 = "+passengerCounts[4]);

		passengerCounts[1] = 1000000L;

		System.out.println("Updated passengers = "+passengerCounts[1]);
	}
}