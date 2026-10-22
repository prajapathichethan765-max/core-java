class Train{
	static int noOfEnigen=1;
	static String railWayNmae="indian railway";
	static String trainRunsOn="train track";
	static byte noOflocoPilot=2;
	public static void main(String[] args){
		int numberOfWheels=2000;
		int numberSeats=1000;
		long trainNumber=72354;
		String trainName="karnataka express";
		int speedLimite=120;
		System.out.println("no Of Enigen in train="+Train.noOfEnigen);
		System.out.println("railway name is ="+Train.railWayNmae);
		System.out.println("train runs on="+Train.trainRunsOn);
		System.out.println("number of loco pilots are="+Train.noOflocoPilot);
		System.out.println("number Of Wheels="+numberOfWheels);
		System.out.println("number seats="+numberSeats);
		System.out.println("train number="+trainNumber);
		System.out.println("train Name="+trainName);
		System.out.println("speed limit="+speedLimite);
		Train.passangersAreConfortable();
		Train.doWeNeedTicket();
		Train.startTrain();
		Train.stopTheTrain();
		Train.speedUp();
		
	}
		static void passangersAreConfortable(){
		System.out.println("yes passangers Confortable");
		}
static void doWeNeedTicket(){
		System.out.println("we need tickets to travel in train");
}
static void startTrain(){
			System.out.println("train is starting");
}
static void stopTheTrain(){
			System.out.println("stop the train");
}
static void speedUp(){
			System.out.println("increase the speed of the train");
}
}




	

		
		
		
		
		
		
		