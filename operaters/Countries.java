class Countries{
	static String countriesName(String countryOne , String countryTwo , String countryThree , String countryFour , String countryFive){
		System.out.println(countryOne);
		System.out.println(countryTwo);
		System.out.println(countryThree);
		System.out.println(countryFour);
		System.out.println(countryFive);
		
		String countries[] = {countryOne , countryTwo , countryThree , countryFour , countryFive};
		System.out.println(countries[0]);
		System.out.println(countries[1]);
		System.out.println(countries[2]);
		System.out.println(countries[3]);
		System.out.println(countries[4]);
		
		switch (countryOne){
			
			case "india":
			return  countryOne +" country name is india";
			
			case "austrila":
			return  countryTwo +" country name is austrila";
			
			case "sri lanka":
			return  countryThree + " country name is sri lanka";
			
			default :
			return "invalid country name";
		}
	}
}