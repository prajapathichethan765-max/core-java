class FanStatus{
	static boolean statusOfFan = false;
public static void main(String[] args){
	System.out.println("check the status of the fan wheather it is off or on");
	boolean status = FanStatus.check();
	System.out.println(status);
	
	FanStatus.turnOn();
	
	System.out.println(statusOfFan);
	
	FanStatus.turnOff();
	System.out.println(statusOfFan);	
	
	
	
	
}
static boolean check(){
return statusOfFan;
}
static void turnOn(){
	System.out.println("turn on the fan");
	statusOfFan = true;
}
static void turnOff(){
	System.out.println("turn off the fan");
	statusOfFan = false;
}
}

	
	