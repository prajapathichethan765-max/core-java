class ElectricScooter{
	public static void main(String[] args){

		System.out.println("before re-initialization");

		String scooterBrand="Ather";
		String batteryType="Lithium Ion";
		String bodyColor="White";
		String ridingMode="Eco";

		byte batteryVoltage=48;
		short chargingTime=300;
		int scooterPrice=125000;
		int maximumRange=120;

		double scooterWeight=110.5d;
		double motorPower=3.7d;

		float topSpeed=90.5f;
		float userRating=4.6f;

		char scooterGrade='A';
		char modelCode='X';

		boolean fastCharging=true;
		boolean gpsAvailable=true;

		long vehicleNumber=9876543210L;
		short warrantyPeriod=3;

		System.out.println("brand="+scooterBrand);
		System.out.println("battery type="+batteryType);
		System.out.println("body color="+bodyColor);
		System.out.println("riding mode="+ridingMode);
		System.out.println("battery voltage="+batteryVoltage);
		System.out.println("charging time="+chargingTime);
		System.out.println("price="+scooterPrice);
		System.out.println("maximum range="+maximumRange);
		System.out.println("weight="+scooterWeight);
		System.out.println("motor power="+motorPower);
		System.out.println("top speed="+topSpeed);
		System.out.println("rating="+userRating);
		System.out.println("grade="+scooterGrade);
		System.out.println("model code="+modelCode);
		System.out.println("fast charging="+fastCharging);
		System.out.println("GPS available="+gpsAvailable);
		System.out.println("vehicle number="+vehicleNumber);
		System.out.println("warranty="+warrantyPeriod);


		// Re-initialization

		scooterBrand="Ola";
		batteryType="Lithium Iron";
		bodyColor="Black";
		ridingMode="Sport";

		batteryVoltage=72;
		chargingTime=240;
		scooterPrice=145000;
		maximumRange=150;

		scooterWeight=125.8d;
		motorPower=5.5d;

		topSpeed=115.5f;
		userRating=4.2f;

		scooterGrade='S';
		modelCode='Z';

		fastCharging=true;
		gpsAvailable=false;

		vehicleNumber=1234567890L;
		warrantyPeriod=5;


		System.out.println("after re-initialization");

		System.out.println("brand="+scooterBrand);
		System.out.println("battery type="+batteryType);
		System.out.println("body color="+bodyColor);
		System.out.println("riding mode="+ridingMode);
		System.out.println("battery voltage="+batteryVoltage);
		System.out.println("charging time="+chargingTime);
		System.out.println("price="+scooterPrice);
		System.out.println("maximum range="+maximumRange);
		System.out.println("weight="+scooterWeight);
		System.out.println("motor power="+motorPower);
		System.out.println("top speed="+topSpeed);
		System.out.println("rating="+userRating);
		System.out.println("grade="+scooterGrade);
		System.out.println("model code="+modelCode);
		System.out.println("fast charging="+fastCharging);
		System.out.println("GPS available="+gpsAvailable);
		System.out.println("vehicle number="+vehicleNumber);
		System.out.println("warranty="+warrantyPeriod);
	}
}