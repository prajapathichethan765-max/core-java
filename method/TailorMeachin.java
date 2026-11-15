class TailorMeachin{
	static int priceOfMeachin(int price , String name , String threadType ){
		System.out.println("price of meachin is =" + price);
		System.out.println("name of meachin is="+name);
		String meachin[] = {name , threadType};
		
		switch(price){
			case 4000:
			System.out.println("meachin is avilble and the price is");
			return price;
			
			case 3000:
			System.out.println("meachin is avilble and the price is ");
			return price;
			
			default:
			System.out.println("meachin is not avilble" 
			);
			return 0;
		}
	}
	public static void main(String[] kush){
		int price = 4000;
		String name = "silver";
		String type = "thread small";
		System.out.println(price);
		System.out.println(name);
		
		int result = TailorMeachin.priceOfMeachin(price , name , type );
System.out.println(result);
	}
}
	