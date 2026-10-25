class Heater{
	static boolean statusOfHeater = false;
	
	public static void main(String[] args){
		System.out.println("check wheather the heater is on or off");
		boolean status = Heater.check();
		System.out.println(status);
		
		Heater.turnOn();
		System.out.println(statusOfHeater);
		
		Heater.turnOff();
		System.out.println(statusOfHeater);
		
		
		
	}
	static boolean check(){
		return statusOfHeater;
	}
	static void turnOn(){
		System.out.println("turn on the heater");
		statusOfHeater = true;
	}
	static void turnOff(){
		System.out.println("turn off the heater");
		statusOfHeater = false;
	}
}

		