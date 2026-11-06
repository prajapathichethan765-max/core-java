class FarmManagement{
	public static void main(String[] args){

		String crop1 = "Rice";
		String crop2 = "Wheat";
		String crop3 = "Corn";
		String crop4 = "Sugarcane";
		String crop5 = "Cotton";

		String cropNames[] = {crop1, crop2, crop3, crop4, crop5};

		System.out.println("Crop 0 = "+cropNames[0]);
		System.out.println("Crop 1 = "+cropNames[1]);
		System.out.println("Crop 2 = "+cropNames[2]);
		System.out.println("Crop 3 = "+cropNames[3]);
		System.out.println("Crop 4 = "+cropNames[4]);

		float cropWeight1 = 25.5f;
		float cropWeight2 = 30.5f;
		float cropWeight3 = 40.5f;
		float cropWeight4 = 50.5f;
		float cropWeight5 = 60.5f;

		float cropWeights[] = {cropWeight1, cropWeight2, cropWeight3, cropWeight4, cropWeight5};

		System.out.println("Weight 0 = "+cropWeights[0]);
		System.out.println("Weight 1 = "+cropWeights[1]);
		System.out.println("Weight 2 = "+cropWeights[2]);
		System.out.println("Weight 3 = "+cropWeights[3]);
		System.out.println("Weight 4 = "+cropWeights[4]);

		cropWeights[3] = 75.5f;

		System.out.println("Updated weight = "+cropWeights[3]);
	}
}