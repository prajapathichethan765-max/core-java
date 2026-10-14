class VishalMart{
	public static void main(String[] args){
	System.out.println("mart opeing timing");
	VishalMart.opeingTime();
	VishalMart.opeingTime();
	VishalMart.opeingTime();


	System.out.println("mart closing timing");
    VishalMart.closingTime();
	VishalMart.closingTime();
   	VishalMart.closingTime();


	System.out.println("on which date the new product will come");
	VishalMart.newProductDate();
		VishalMart.newProductDate();
		VishalMart.newProductDate();

	System.out.println("is where any exchange poliscy");
	VishalMart.isThereExchangeOffer();
	VishalMart.isThereExchangeOffer();
	VishalMart.isThereExchangeOffer();

	System.out.println("location of the vishal mart");
	String location=VishalMart.locationOfMart();
	System.out.println(location);
	System.out.println(location);
	System.out.println(location);
	
	
	System.out.println("what is price of  one the belt");
	int pirce=VishalMart.beltPrice();
    System.out.println(pirce);
     System.out.println(pirce);
    System.out.println(pirce);
	    System.out.println("pirce of 5 belts");
		int sum=5*pirce;
		    System.out.println(sum);
			


    

	System.out.println("my bill amount");
    float bill=VishalMart.billAmount();
    System.out.println(pirce);
    System.out.println(pirce);
    System.out.println(pirce);
		
		
		System.out.println("qulatity of the products is??");
	
    		char qulatity=VishalMart.qulatityOfProduct();
			
		System.out.println(qulatity);
		System.out.println(qulatity);

		System.out.println(qulatity);

	
	
	
	}
	static void opeingTime(){
		System.out.println("8:30AM");
	}
	
	static void closingTime(){
	    System.out.println("10:30PM");
	}
	
	static void newProductDate(){
	    System.out.println("13-10-2026");
	}
	static void isThereExchangeOffer(){
	    System.out.println("yes it is avilable");
	}
	static String locationOfMart(){
		String location="yelahanka";
		return location;
	}
	static int beltPrice(){
		return 350;
	}
	static float billAmount(){
		float bill=2000.4f;
		return bill;
	}
	static char qulatityOfProduct(){
		char qulatity='A';
		return qulatity;
	}
}

	