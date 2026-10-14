class IndianCurrancy{
	public static void main(String[] args){
		System.out.println("How many times  1rupess coin have changes");
		int a=4;
		IndianCurrancy.oneRupeeCoinTypes(a);
		System.out.println("what is color of the 10 rupes note which where chnages 2 times");
		String colorOfOldNote="light muddy";
		String colorOfNewNote="dard brown";
		IndianCurrancy.colorOfTenRupesNotes(colorOfOldNote , colorOfNewNote);
		System.out.println(" name , symbol , code");
		String name = "indian rupee";
		String symbol="$";
		String code="INR";
		IndianCurrancy.nmaeSymbolCode(name , symbol , code);
			System.out.println(" authority , subunit , conversion , ");
	    IndianCurrancy.authoritySubunitConversion("rbi","ropes","1 rpee = 100 paisa");

		
	}
	static void oneRupeeCoinTypes(int OneRupe){
		System.out.println("ones rupee is changed="+OneRupe);
	}
	static void colorOfTenRupesNotes(String oldTenRupeNOteColor , String newTenRupeColor){
		System.out.println("color on old ="+oldTenRupeNOteColor);
		System.out.println("color on new ="+newTenRupeColor);
		
	}
	static void nmaeSymbolCode(String name , String symbol , String code){
	System.out.println(name);
	System.out.println(symbol);
	System.out.println(code);
	}
    static void authoritySubunitConversion(String authority , String subunit , String conversion){
		
	System.out.println(authority);
	System.out.println(subunit);
	System.out.println(conversion);
}
}


	
	