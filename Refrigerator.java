class Refrigerator{
	public static void main(String[] args){
		System.out.println("before re-initialization");

		String refrigeratorBrand="Whirlpool";
		String refrigeratorColor="Silver";
		String coolingType="Frost Free";
		String doorType="Double Door";
		int capacityLitres=300;
		int energyRating=4;
		int refrigeratorPrice=35000;
		int temperatureLevel=5;
		double refrigeratorHeight=170.5d;
		double refrigeratorWeight=65.4d;
		float powerConsumption=1.5f;
		float efficiencyRating=4.2f;
		char refrigeratorGrade='B';
		char modelCode='W';
		boolean inverter=true;
		boolean waterDispenser=false;
		long productCode=123456789L;
		short warrantyYears=5;

		System.out.println("brand="+refrigeratorBrand);
		System.out.println("color="+refrigeratorColor);
		System.out.println("cooling type="+coolingType);
		System.out.println("door type="+doorType);
		System.out.println("capacity="+capacityLitres);
		System.out.println("energy rating="+energyRating);
		System.out.println("price="+refrigeratorPrice);
		System.out.println("temperature="+temperatureLevel);
		System.out.println("height="+refrigeratorHeight);
		System.out.println("weight="+refrigeratorWeight);
		System.out.println("power consumption="+powerConsumption);
		System.out.println("efficiency rating="+efficiencyRating);
		System.out.println("grade="+refrigeratorGrade);
		System.out.println("model code="+modelCode);
		System.out.println("inverter="+inverter);
		System.out.println("water dispenser="+waterDispenser);
		System.out.println("product code="+productCode);
		System.out.println("warranty="+warrantyYears);

		refrigeratorBrand="Samsung";
		refrigeratorColor="Black";
		coolingType="Digital Cooling";
		doorType="Triple Door";
		capacityLitres=500;
		energyRating=5;
		refrigeratorPrice=65000;
		temperatureLevel=3;
		refrigeratorHeight=185.8d;
		refrigeratorWeight=80.2d;
		powerConsumption=1.2f;
		efficiencyRating=4.8f;
		refrigeratorGrade='A';
		modelCode='S';
		inverter=true;
		waterDispenser=true;
		productCode=987654321L;
		warrantyYears=7;

		System.out.println("after re-initialization");
		System.out.println("brand="+refrigeratorBrand);
		System.out.println("color="+refrigeratorColor);
		System.out.println("cooling type="+coolingType);
		System.out.println("door type="+doorType);
		System.out.println("capacity="+capacityLitres);
		System.out.println("energy rating="+energyRating);
		System.out.println("price="+refrigeratorPrice);
		System.out.println("temperature="+temperatureLevel);
		System.out.println("height="+refrigeratorHeight);
		System.out.println("weight="+refrigeratorWeight);
		System.out.println("power consumption="+powerConsumption);
		System.out.println("efficiency rating="+efficiencyRating);
		System.out.println("grade="+refrigeratorGrade);
		System.out.println("model code="+modelCode);
		System.out.println("inverter="+inverter);
		System.out.println("water dispenser="+waterDispenser);
		System.out.println("product code="+productCode);
		System.out.println("warranty="+warrantyYears);
	}
}