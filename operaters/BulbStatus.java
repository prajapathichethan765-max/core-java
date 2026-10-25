class BulbStatus{
	static boolean statuSOfBuld= false;
public static void main(String[] args){
System.out.println("status of the bulb wheather it is off or on");
boolean status = BulbStatus.check();
System.out.println(status);

BulbStatus.turnOn();
boolean status1 = BulbStatus.check();
System.out.println(status1);

BulbStatus.turnOff();
boolean status2 = BulbStatus.check();
System.out.println(status2);

	
}
static boolean check(){
	return statuSOfBuld;
}
static void turnOn(){
	System.out.println("tuen on the bylb");
	statuSOfBuld = true;
}
static void turnOff(){
	System.out.println("turn off the bulb");
	statuSOfBuld = false;
	
}
}
