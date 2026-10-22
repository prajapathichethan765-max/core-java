class ClothsShopping{
	public static void main(String[] args){
		System.out.println("shop location");
		System.out.println(ClothsShopping.shopLocation());
		
		
        System.out.println("types of shirt avilable");
		System.out.println(ClothsShopping.typeOfShirts());

        System.out.println("type of pants");
        System.out.println(ClothsShopping.typeOfPants());
		

		
	}
	static String shopLocation(){
		String location="yelahanka new town";
		return location;
	}
	static String typeOfShirts(){
		String typesOfShirt="cotton, formal";
		return typesOfShirt;
	}
	static String typeOfPants(){
		String typesOfPants="baddy, stright fit";
		return typesOfPants;
	}
}
