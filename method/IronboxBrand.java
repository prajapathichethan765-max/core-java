class IronboxBrand{
	static String brands(String brand1 , String brand2 , String brand3){
		System.out.println(brand1);
		System.out.println(brand2);
		System.out.println(brand3);
		
		String ironBrand[] = {brand1 , brand2 , brand3};
		System.out.println(ironBrand[0]);
		System.out.println(ironBrand[1]);
		System.out.println(ironBrand[2]);
		
		ironBrand[0] = "avone";
		System.out.println(ironBrand[0]);
	return brand1 + brand2 + brand3 + ironBrand[0] + ironBrand[1] + ironBrand[2];
	}
}
