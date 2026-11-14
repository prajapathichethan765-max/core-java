class LaduType{
	static int laduPrice(String type1 , String type2 , String type3){
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		
		String ladus[] = {type1 , type2 , type3};
		System.out.println(ladus[0]);
		System.out.println(ladus[1]);
		System.out.println(ladus[2]);
		
		if(type1 == "mung"){
			System.out.println("yes ladu is present");
			return 120;
		}
		else if(type1 == "barfi"){
			System.out.println("yes brafi is present");
			return 130;
		}
		else if(type1 == "kaju barfi"){
			System.out.println("yes kaju barfi is present");
			return 1400;
		}
		else {
			System.out.println("invalid input");
			return 0;
			
		}
	}
}
