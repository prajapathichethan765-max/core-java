class OnlingShop{
	public static void main(String[] args){
		System.out.println("platfrom  of the shoping");
		String platfrom=OnlingShop.platfrom();
		System.out.println(platfrom);
		
		System.out.println("rate of the pant");
		float price=OnlingShop.pantRate();
			System.out.println(price);
			
	
		
	}
	static String platfrom(){
		String platfromOfShop="online";
    return platfromOfShop;
	}
	static float pantRate(){
		float price=656.5f;
		return price;
	}
}
