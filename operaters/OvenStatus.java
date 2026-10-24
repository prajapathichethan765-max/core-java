class OvenStatus{

static boolean ovenStatus = false;

public static void main(String[] args){

System.out.println("check the oven status wheather it is on or off");
boolean status = OvenStatus.check();
System.out.println(status);

OvenStatus.turnOn();
boolean status1 = OvenStatus.check();
System.out.println(status1);

OvenStatus.turnOff();
boolean status2 = OvenStatus.check();
System.out.println(status2);


}
static boolean check(){
	return ovenStatus;
	
}
static void turnOn(){
	System.out.println("oven is on");
	ovenStatus = true; // re initialoition
}
static void turnOff(){
	System.out.println("oven is off");
	ovenStatus = false;
}
}
