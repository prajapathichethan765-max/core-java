class CarShowroom{
	
	static String checkExpensiveCar( double defender , double fortuner){
		
		System.out.println(defender);
		System.out.println(fortuner);
		
		double carPrices[] = {defender , fortuner};
		System.out.println(carPrices[0]);
		System.out.println(carPrices[1]);
		
		switch(defender){
			
			case 500000.3d:
			return "defender is expensive then fortuner";
			
			default :
			return "fortuner is expensive the defender";
			
		}
	}
}
			
		