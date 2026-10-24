class WashingMachineStatus{
	static boolean statusOfTve = false;
public static void main(String[] args){
	System.out.println("check the status of the tv wheather it is off or on");
	boolean status = TVStatus.check();
	System.out.println(status);
	
	TVStatus.turnOn();
	boolean status1 = TVStatus.check();
	System.out.println(status1);
	
	TVStatus.trunOff();
	boolean status2 = TVStatus.check();
	System.out.println(status2);
	
	
}
static boolean check(){
	return statusOfTve;
}
static void turnOn(){
	System.out.println("tv is on");
	statusOfTve = true;
}
static void trunOff(){
	System.out.println("tv is off ");
	statusOfTve = false;

}
}