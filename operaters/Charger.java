class Charger{
	static boolean statusOfCharger=False;
	public static void main(String[] args){
	System.out.println("check the status of the Charger whether it is off or on");
	boolean status = Charger.check();
		System.out.println(status);

Charger.trunOn();
		System.out.println(statusOfBox);	
Charger.trunOff();
		System.out.println(statusOfBox);		
		
		
		
		
	}
	static boolean check(){
		return statusOfCharger;
	}
	static void trunOn(){
		System.out.println("turn on the Charger");
		statusOfCharger = true;
	}
	static void trunOff(){
		System.out.println("trunOff");
		statusOfCharger = false;
	}
}
