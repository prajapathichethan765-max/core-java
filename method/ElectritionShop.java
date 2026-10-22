class ElectritionShop{
	public static void main(String[] args){
	System.out.println("what is the price 24L cooler");
    int price=ElectritionShop.priceCooler();
	System.out.println(price);
	
	System.out.println("how many years of warranty");
	byte warranty=ElectritionShop.warrantyYears();
	System.out.println(warranty);
	 
		System.out.println("brand name");
		String brand=ElectritionShop.brandName();
		System.out.println(brand);
		
	

	}
    static int priceCooler(){
    int price=10000;
    return price;
	}
	static byte warrantyYears(){
	byte warranty=2;
    return	warranty;
	}
	static String brandName(){
	String brand ="bajaj";
	return brand;
	}
}
