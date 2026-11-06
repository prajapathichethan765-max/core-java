class ZooManagement{
	public static void main(String[] args){

		String animal1 = "Lion";
		String animal2 = "Tiger";
		String animal3 = "Elephant";
		String animal4 = "Giraffe";
		String animal5 = "Zebra";

		String animalNames[] = {animal1, animal2, animal3, animal4, animal5};

		System.out.println("Animal 0 = "+animalNames[0]);
		System.out.println("Animal 1 = "+animalNames[1]);
		System.out.println("Animal 2 = "+animalNames[2]);
		System.out.println("Animal 3 = "+animalNames[3]);
		System.out.println("Animal 4 = "+animalNames[4]);

		boolean animal1Available = true;
		boolean animal2Available = true;
		boolean animal3Available = false;
		boolean animal4Available = true;
		boolean animal5Available = false;

		boolean animalAvailability[] = {animal1Available, animal2Available, animal3Available, animal4Available, animal5Available};

		System.out.println("Availability 0 = "+animalAvailability[0]);
		System.out.println("Availability 1 = "+animalAvailability[1]);
		System.out.println("Availability 2 = "+animalAvailability[2]);
		System.out.println("Availability 3 = "+animalAvailability[3]);
		System.out.println("Availability 4 = "+animalAvailability[4]);

		animalAvailability[2] = true;

		System.out.println("Updated availability = "+animalAvailability[2]);
	}
}