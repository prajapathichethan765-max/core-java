class ElectricityBoard{
	public static void main(String[] args){

		String area1 = "Yelahanka";
		String area2 = "Hebbal";
		String area3 = "Kogilu";
		String area4 = "Bagalur";
		String area5 = "Jakkur";

		String areaNames[] = {area1, area2, area3, area4, area5};

		System.out.println("Area 0 = "+areaNames[0]);
		System.out.println("Area 1 = "+areaNames[1]);
		System.out.println("Area 2 = "+areaNames[2]);
		System.out.println("Area 3 = "+areaNames[3]);
		System.out.println("Area 4 = "+areaNames[4]);

		float electricity1 = 120.5f;
		float electricity2 = 150.5f;
		float electricity3 = 200.5f;
		float electricity4 = 175.5f;
		float electricity5 = 250.5f;

		float electricityUnits[] = {electricity1, electricity2, electricity3, electricity4, electricity5};

		System.out.println("Units 0 = "+electricityUnits[0]);
		System.out.println("Units 1 = "+electricityUnits[1]);
		System.out.println("Units 2 = "+electricityUnits[2]);
		System.out.println("Units 3 = "+electricityUnits[3]);
		System.out.println("Units 4 = "+electricityUnits[4]);

		electricityUnits[2] = 300.5f;

		System.out.println("Updated units = "+electricityUnits[2]);
	}
}