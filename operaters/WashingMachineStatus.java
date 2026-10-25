class WashingMachineStatus{
	static boolean statusOfWashingMachin = false;
public static void main(String[] args){
System.out.println("check the status of the WashingMachine wheather it is off or on");
boolean status = WashingMachineStatus.check();
System.out.println(status);

WashingMachineStatus.turnOn();
System.out.println(statusOfWashingMachin);

WashingMachineStatus.turnOff();
System.out.println(statusOfWashingMachin);	

}
static boolean check(){
return statusOfWashingMachin;
}
static void turnOn(){
System.out.println("turn on the maechin");
statusOfWashingMachin = true;
}
static void turnOff(){
System.out.println("turn off the meachin");
statusOfWashingMachin = false;
}
}
	