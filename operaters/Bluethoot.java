class Bluethoot{
	static boolean statusOfBluethoot=False;
	public static void main(String[] args){
	System.out.println("check the status of the Charger Bluethoot it is off or on");
	boolean status = Bluethoot.check();
		System.out.println(status);

Bluethoot.trunOn();
		System.out.println(statusOfBluethoot);	
Bluethoot.trunOff();
		System.out.println(statusOfBluethoot);		
		
		
		
		
	}
	static boolean check(){
		return statusOfBluethoot;
	}
	static void trunOn(){
		System.out.println("turn on the Bluethoot");
		statusOfBluethoot = true;
	}
	static void trunOff(){
		System.out.println("trunOff");
		statusOfBluethoot = false;
	}
}
