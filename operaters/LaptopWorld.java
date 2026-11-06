class LaptopWorld{
	public static void main(String[] args){

		String laptop1 = "Dell";
		String laptop2 = "HP";
		String laptop3 = "Lenovo";
		String laptop4 = "Asus";
		String laptop5 = "Acer";

		String laptopBrands[] = {laptop1, laptop2, laptop3, laptop4, laptop5};

		System.out.println("Laptop 0 = "+laptopBrands[0]);
		System.out.println("Laptop 1 = "+laptopBrands[1]);
		System.out.println("Laptop 2 = "+laptopBrands[2]);
		System.out.println("Laptop 3 = "+laptopBrands[3]);
		System.out.println("Laptop 4 = "+laptopBrands[4]);

		byte ram1 = 8;
		byte ram2 = 16;
		byte ram3 = 32;
		byte ram4 = 4;
		byte ram5 = 16;

		byte laptopRam[] = {ram1, ram2, ram3, ram4, ram5};

		System.out.println("RAM 0 = "+laptopRam[0]);
		System.out.println("RAM 1 = "+laptopRam[1]);
		System.out.println("RAM 2 = "+laptopRam[2]);
		System.out.println("RAM 3 = "+laptopRam[3]);
		System.out.println("RAM 4 = "+laptopRam[4]);

		laptopRam[3] = 12;

		System.out.println("Updated RAM = "+laptopRam[3]);
	}
}