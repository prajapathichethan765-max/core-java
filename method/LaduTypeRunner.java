class LaduTypeRunner{
	public static void main(String[] kbrf){
		String sweet1 = "mung";
		String sweet2 = "kaju";
		String sweet3 = "sonpapdi";
		System.out.println(sweet1);
		System.out.println(sweet2);
		System.out.println(sweet3);
		
		int price = LaduType.laduPrice(sweet1 , sweet2 , sweet3);
		System.out.println(price);
	}
}
