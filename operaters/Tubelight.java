class Tubelight{
	static boolean statusOfTubelight=false;
	public static void main(String[] args){
	System.out.println("check the status of the Charger Tubelight it is off or on");
	boolean status = Tubelight.check();
		System.out.println(status);

Tubelight.trunOn();
		System.out.println(statusOfTubelight);	
Tubelight.trunOff();
		System.out.println(statusOfTubelight);		
		
		
		
		
	}
	static boolean check(){
		return statusOfTubelight;
	}
	static void trunOn(){
		System.out.println("turn on the Tubelight");
		statusOfTubelight = true;
	}
	static void trunOff(){
		System.out.println("trunOff");
		statusOfTubelight = false;
	}
}
