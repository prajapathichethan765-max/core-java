class OnlineShopping{
	public static void main(String[] rags){
		System.out.println("name of the platform");
		OnlineShopping.nameOfPlatRoom("amazon");
		System.out.println("which are the fesivel on which we get more offers");
		OnlineShopping.offerFestivels("dewali","dashara");
		System.out.println("what are the details we have to enter to register");
		OnlineShopping.registerDetiles("chethan", 872362131 , "kogillu village yelahanka");
		System.out.println("types of brand avilable");
        OnlineShopping.typesOfBrand("nike","jordan", "puma","adiddas");
	    
		
		
		
		
	}
	static void nameOfPlatRoom(String name){
		System.out.println("name of the platform is="+name);
	}
	static void offerFestivels(String nameOne, String nameTwo){
		System.out.println("1est festival name is="+nameOne);
		System.out.println("2nd festival name is="+nameTwo	);
}
    static void registerDetiles(String name , long phoneNumber , String address){
		
	System.out.println(name);
	System.out.println(phoneNumber);
	System.out.println(address);
	}
	static void typesOfBrand(String brandOne ,String brandTwo , String brandThree , String brandFour){
	System.out.println(brandOne);
	System.out.println(brandTwo);
	System.out.println(brandThree);
	System.out.println(brandFour);
}

	
	
	
	
}
