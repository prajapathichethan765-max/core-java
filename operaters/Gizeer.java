class Gizeer{
	static boolean statusOfGizeer=false;
	public static void main(String[] args){
	System.out.println("check the status of the Charger Gizeer it is off or on");
	boolean status = Gizeer.check();
		System.out.println(status);

Gizeer.trunOn();
		System.out.println(statusOfGizeer);	
Gizeer.trunOff();
		System.out.println(statusOfGizeer);		
		
		
		
		
	}
	static boolean check(){
		return statusOfGizeer;
	}
	static void trunOn(){
		System.out.println("turn on the Gizeer");
		statusOfGizeer = true;
	}
	static void trunOff(){
		System.out.println("trunOff");
		statusOfGizeer = false;
	}
}
