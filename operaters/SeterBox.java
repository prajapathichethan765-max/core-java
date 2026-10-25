class SeterBox{
	static boolean statusOfBox = false;
	public static void main(String[] args){
	System.out.println("check the status of the seter box whether it is off or on");
	boolean status = SeterBox.check();
		System.out.println(status);

SeterBox.trunOn();
		System.out.println(statusOfBox);	
SeterBox.trunOff();
		System.out.println(statusOfBox);		
		
		
		
		
	}
	static boolean check(){
		return statusOfBox;
	}
	static void trunOn(){
		System.out.println("turn on the box");
		statusOfBox = true;
	}
	static void trunOff(){
		System.out.println("trunOff");
		statusOfBox = false;
	}
}
