
	class Malls{
	public static void main(String[] args){
		System.out.println("do mall have bike parking");
		Mall.doMallHaveParking();
		Mall.doMallHaveParking();
		Mall.doMallHaveParking();

		
		System.out.println("is there movie theater");
        Mall.istheretheater();
	    Mall.istheretheater();
	    Mall.istheretheater();

		
		System.out.println("is there any entry fee to enter the mall");
		Mall.isThereEntryFee();
		Mall.isThereEntryFee();
		Mall.isThereEntryFee();

		
		
		System.out.println("is there is any games to play");
		Mall.isThereGames();
	    Mall.isThereGames();	
		Mall.isThereGames();
		
		
		System.out.println("address of the mall");
		String address=Mall.addressOfTheMall();
		System.out.println(address);
		System.out.println(address);
		System.out.println(address);
		
		
		
		System.out.println("how many shopes are there in mall");
		int shopsCount=Mall.noOfShops();
		System.out.println(shopsCount);
		System.out.println(shopsCount);
		System.out.println(shopsCount);
	
		
		
		System.out.println("how many floors are in the mall");
		byte floorsCount=Mall.noOfFloors();
		System.out.println(floorsCount);
		System.out.println(floorsCount);
		System.out.println(floorsCount);
	
		
		
		System.out.println("what is price of jordan shoes");
        float price=Mall.priceOfShoes();
		System.out.println(price);
		System.out.println(price);
	    System.out.println(price);

		

	}
	
		
	
	static void doMallHaveParking(){
		System.out.println("yes they provide parking");
	}
	static void istheretheater(){
		System.out.println("yes we have theater");
	}
	static void isThereEntryFee(){
		System.out.println("no it is free for everyone");
	}
	static void isThereGames(){
		System.out.println("yes there are some games that we can play");
	}
	static String addressOfTheMall(){
	String address="yelahanka";
	return address;
	}
	static int noOfShops(){
	int shopsCount=50;
    return shopsCount;
	}
	static byte noOfFloors(){
	byte floorsCount=5;
	return floorsCount;
	}
	static float priceOfShoes(){
	float price=8273.4f;
    return price;
	}
}

