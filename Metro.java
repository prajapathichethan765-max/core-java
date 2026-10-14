class Metro{
	public static void main(String[] args){
		System.out.println("morning times from yelahanka to mysore");
		Metro.morningTimings();
		Metro.morningTimings();
		Metro.morningTimings();
		
		System.out.println("eveing times from mysore to yelahanka");
		Metro.eveingTimings();
		Metro.eveingTimings();
		Metro.eveingTimings();
		
		System.out.println("loction of metro in bangalore");
        Metro.loction();
        Metro.loction();
        Metro.loction();
		
		System.out.println("can metro cross 120km speed");
		Metro.speed();
		Metro.speed();
		Metro.speed();
		
		
	System.out.println("ticket price from yel to mys");
int price Metro.ticketPrice();
System.out.println(price);
System.out.println(price);
System.out.println(price);



		System.out.println("name of the metro");
	String name=Metro.nameOfTheMetro();
	System.out.println(name);
	System.out.println(name);
	System.out.println(name);
	
		System.out.println("metro number");
long number=Metro.metroNumber();
	System.out.println(number);
		System.out.println(number);
	System.out.println(number);


	
		
		
	}
	static void morningTimings(){
		System.out.println("8:30Am");
	}
	
	static void eveingTimings(){
		System.out.println("6:30Am");
	}
	
	static void loction(){
		System.out.println("yelahanka");
	}
	
	static void speed(){
		
	System.out.println("yes it can");
	}
	
    static int ticketPrice(){
	int ticketAmount=20;
	return ticketAmount;
}
    static String nameOfTheMetro(){
		String name="vande bharat";
return name;
	}
	static long metroNumber(){
		long number=287612;
		return number;
	}
	
	
}
