class Watchh{
	static String country="Switzerland";
	static String company="Rolex";
	static String gender="Unisex";
	static char countryCode;

	public static void main(String[] args){
		int price;
		int weightInGrams;
		String location;
		boolean isAvailable;
		char grade;

		System.out.println("initalizing the values");

		price=5000;
		weightInGrams=150;
		location="Yelahanka";
		isAvailable=true;
		grade='A';

		System.out.println("brfore initalization");
		System.out.println("country="+Watch.country);
		System.out.println("company="+Watch.company);
		System.out.println("gender="+Watch.gender);
		System.out.println("countryCode="+Watch.countryCode);
		System.out.println("price="+price);
		System.out.println("weightInGrams="+weightInGrams);
		System.out.println("location="+location);
		System.out.println("isAvailable="+isAvailable);
		System.out.println("grade="+grade);

		price=10000;
		weightInGrams=180;
		location="Rajajinagar";
		isAvailable=false;
		grade='B';

		System.out.println("country="+Watch.country);
		System.out.println("company="+Watch.company);
		System.out.println("gender="+Watch.gender);
		System.out.println("countryCode="+Watch.countryCode);
		System.out.println("price="+price);
		System.out.println("weightInGrams="+weightInGrams);
		System.out.println("location="+location);
		System.out.println("isAvailable="+isAvailable);
		System.out.println("grade="+grade);

		price=25000;
		weightInGrams=220;
		location="JP NAGAR";
		isAvailable=false;
		grade='C';

		System.out.println("country="+Watch.country);
		System.out.println("company="+Watch.company);
		System.out.println("gender="+Watch.gender);
		System.out.println("countryCode="+Watch.countryCode);
		System.out.println("price="+price);
		System.out.println("weightInGrams="+weightInGrams);
		System.out.println("location="+location);
		System.out.println("isAvailable="+isAvailable);
		System.out.println("grade="+grade);
	}
}