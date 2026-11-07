class LuluMallRunner{
	public static void main(String[] ljf){
		
		String item1 = "baggy";
		String item2 = "over size";
		String item3 = "shirt";
		String item4 = "tshirt";
		
		System.out.println(item1);
		System.out.println(item3);
		System.out.println(item2);
		System.out.println(item4);
		
		String nameOfCloths = LuluMall.itemsInMall(item1 , item2 , item3 , item4);
	}
}
