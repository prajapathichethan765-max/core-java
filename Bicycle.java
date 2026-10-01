class Bicycle{
	public static void main(String[] args){
		System.out.println("before re-initialization");

		String bicycleBrand="Hero";
		String frameType="Steel";
		String bicycleColor="Red";
		String gearType="Mountain";
		int gearCount=21;
		int wheelSize=26;
		int bicyclePrice=15000;
		int manufactureYear=2025;
		double frameHeight=18.5d;
		double bicycleWeight=14.5d;
		float tyrePressure=45.5f;
		float performanceRating=4.2f;
		char bicycleGrade='B';
		char frameCode='S';
		boolean hasCarrier=true;
		boolean hasBell=true;
		long serialCode=123456789L;
		short warrantyPeriod=2;

		System.out.println("brand="+bicycleBrand);
		System.out.println("frame type="+frameType);
		System.out.println("color="+bicycleColor);
		System.out.println("gear type="+gearType);
		System.out.println("gear count="+gearCount);
		System.out.println("wheel size="+wheelSize);
		System.out.println("price="+bicyclePrice);
		System.out.println("manufacture year="+manufactureYear);
		System.out.println("frame height="+frameHeight);
		System.out.println("weight="+bicycleWeight);
		System.out.println("tyre pressure="+tyrePressure);
		System.out.println("rating="+performanceRating);
		System.out.println("grade="+bicycleGrade);
		System.out.println("frame code="+frameCode);
		System.out.println("carrier="+hasCarrier);
		System.out.println("bell="+hasBell);
		System.out.println("serial code="+serialCode);
		System.out.println("warranty="+warrantyPeriod);

		bicycleBrand="Firefox";
		frameType="Aluminium";
		bicycleColor="Blue";
		gearType="Road";
		gearCount=18;
		wheelSize=29;
		bicyclePrice=25000;
		manufactureYear=2026;
		frameHeight=20.2d;
		bicycleWeight=11.8d;
		tyrePressure=50.2f;
		performanceRating=4.7f;
		bicycleGrade='A';
		frameCode='M';
		hasCarrier=false;
		hasBell=false;
		serialCode=987654321L;
		warrantyPeriod=3;

		System.out.println("after re-initialization");
		System.out.println("brand="+bicycleBrand);
		System.out.println("frame type="+frameType);
		System.out.println("color="+bicycleColor);
		System.out.println("gear type="+gearType);
		System.out.println("gear count="+gearCount);
		System.out.println("wheel size="+wheelSize);
		System.out.println("price="+bicyclePrice);
		System.out.println("manufacture year="+manufactureYear);
		System.out.println("frame height="+frameHeight);
		System.out.println("weight="+bicycleWeight);
		System.out.println("tyre pressure="+tyrePressure);
		System.out.println("rating="+performanceRating);
		System.out.println("grade="+bicycleGrade);
		System.out.println("frame code="+frameCode);
		System.out.println("carrier="+hasCarrier);
		System.out.println("bell="+hasBell);
		System.out.println("serial code="+serialCode);
		System.out.println("warranty="+warrantyPeriod);
	}
}