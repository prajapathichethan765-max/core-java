class LaptopShopping{
	public static void main(String[] args){
	System.out.println("what is the brand name of the laptop");
    System.out.println(LaptopShopping.brandName());
	
	System.out.println("price of laptop");
	System.out.println(LaptopShopping.priceOfLaptop());
	
	System.out.println("color of the laptop");
    System.out.println(colorOfLaptop()); 

    System.out.println("windows number");
	System.out.println(windowNumber());

	}
    static String brandName(){
    String brand="hp";
    return brand;
	}
	static long priceOfLaptop(){
		long price=1000000;
		return price;
	}
	static String colorOfLaptop(){
		String color="silver";
		return color;
	}
	static byte windowNumber(){
		byte number=11;
		return number;
	}
}
