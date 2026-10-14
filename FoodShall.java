class FoodShall{
	public static void main(String[] args){
		System.out.println("what kind of food they serve");
		FoodShall.typeOfFood();
			FoodShall.typeOfFood();
			FoodShall.typeOfFood();

		
		
		System.out.println("opeing time of the shall");
		FoodShall.openingTime();
		FoodShall.openingTime();
		FoodShall.openingTime();
		
		
		
		System.out.println("closing time of the stall");
		FoodShall.closingTime();
			FoodShall.closingTime();
			FoodShall.closingTime();

		
		
		System.out.println("do stall open on weekends");
		FoodShall.doShallOpensOnWeekend();
			FoodShall.doShallOpensOnWeekend();
			FoodShall.doShallOpensOnWeekend();
	
		
		System.out.println("menu of the shall");
		String menu=FoodShall.MenuOfTheStall();
		System.out.println(menu);
		System.out.println(menu);
		System.out.println(menu);
		
		
		
		System.out.println("price of the dosa");
		System.out.println(priceOfOneDosa());
				System.out.println(priceOfOneDosa());
						System.out.println(priceOfOneDosa());


		
		System.out.println("what is the quality of the dosa");
		char quality=FoodShall.qualityOfDosa();
		System.out.println(quality);
			System.out.println(quality);
		System.out.println(quality);
	
		
		
		System.out.println("address of the shall");
		String address=FoodShall.addressOfTheShall();
			System.out.println(address);
			System.out.println(address);			
			System.out.println(address);
	

		
	}
	static void typeOfFood(){
		System.out.println("south indian food ");
	}
	static void openingTime(){
	System.out.println("morning 8:30 AM");
	}
	static void closingTime(){
		System.out.println("what kind of food they serve");
	}
	static void doShallOpensOnWeekend(){
		System.out.println("yes the shall will be opend on weekends");
	}
	static String MenuOfTheStall(){
		String menu="idly, dosa, vada , puri , palav";
		return menu;
	}
	static int priceOfOneDosa(){
		int price=50;
		return price;
	}
	static char qualityOfDosa(){
		char quality='A';
		return quality;
	}
	
	static String addressOfTheShall(){
        String address="yelahanaka kogilu village";
         return address;
	}
}
	
		

		