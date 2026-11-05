class BikeShowroom{
	public static void main(String[] args){

		String bike1 = "Royal Enfield";
		String bike2 = "KTM";
		String bike3 = "Yamaha";
		String bike4 = "Honda";
		String bike5 = "Suzuki";

		String bikeBrands[] = {bike1, bike2, bike3, bike4, bike5};

		System.out.println("Bike 0 = "+bikeBrands[0]);
		System.out.println("Bike 1 = "+bikeBrands[1]);
		System.out.println("Bike 2 = "+bikeBrands[2]);
		System.out.println("Bike 3 = "+bikeBrands[3]);
		System.out.println("Bike 4 = "+bikeBrands[4]);

		double mileage1 = 35.5d;
		double mileage2 = 30.2d;
		double mileage3 = 45.8d;
		double mileage4 = 50.5d;
		double mileage5 = 42.3d;

		double bikeMileage[] = {mileage1, mileage2, mileage3, mileage4, mileage5};

		System.out.println("Mileage 0 = "+bikeMileage[0]);
		System.out.println("Mileage 1 = "+bikeMileage[1]);
		System.out.println("Mileage 2 = "+bikeMileage[2]);
		System.out.println("Mileage 3 = "+bikeMileage[3]);
		System.out.println("Mileage 4 = "+bikeMileage[4]);

		bikeMileage[2] = 55.5d;

		System.out.println("Updated mileage = "+bikeMileage[2]);
	}
}