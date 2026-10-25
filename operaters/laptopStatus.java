class laptopStatus{
	static boolean statusOfLaptop = false;
	public static void main(String[] args){
		System.out.println("check the status of the  laptop whether it is off or on");
		boolean status = laptopStatus.check();
        System.out.println(status);		
		
		laptopStatus.tuenOn();
		System.out.println(laptopStatus.statusOfLaptop);
		
		laptopStatus.turnOff();
		System.out.println(laptopStatus.statusOfLaptop);
		
	}
	static boolean check(){
		return statusOfLaptop;
	}
	static void tuenOn(){
		System.out.println("turn on the laptop");
		statusOfLaptop = true; // re initilaization
	}
	static void turnOff(){
		System.out.println("turn off the laptop");
		statusOfLaptop = false;  // re initilaization
	}
}
	
		
		
		