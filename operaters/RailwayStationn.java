class RailwayStationn{
	public static void main(String[] args){

		String train1 = "Rajdhani Express";
		String train2 = "Shatabdi Express";
		String train3 = "Vande Bharat";
		String train4 = "Mysore Express";
		String train5 = "Chennai Express";

		String trainNames[] = {train1, train2, train3, train4, train5};

		System.out.println("Train 0 = "+trainNames[0]);
		System.out.println("Train 1 = "+trainNames[1]);
		System.out.println("Train 2 = "+trainNames[2]);
		System.out.println("Train 3 = "+trainNames[3]);
		System.out.println("Train 4 = "+trainNames[4]);

		int trainNumber1 = 12345;
		int trainNumber2 = 23456;
		int trainNumber3 = 34567;
		int trainNumber4 = 45678;
		int trainNumber5 = 56789;

		int trainNumbers[] = {trainNumber1, trainNumber2, trainNumber3, trainNumber4, trainNumber5};

		System.out.println("Number 0 = "+trainNumbers[0]);
		System.out.println("Number 1 = "+trainNumbers[1]);
		System.out.println("Number 2 = "+trainNumbers[2]);
		System.out.println("Number 3 = "+trainNumbers[3]);
		System.out.println("Number 4 = "+trainNumbers[4]);

		trainNumbers[3] = 98765;

		System.out.println("Updated train number = "+trainNumbers[3]);
	}
}