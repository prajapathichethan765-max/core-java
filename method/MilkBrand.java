class MilkBrand{
	static String brands(String brand1 , String brand2 , String brand3){
		System.out.println(brand1);
		System.out.println(brand2);
		System.out.println(brand3);
		
		String brand[] = {brand1 , brand2 , brand3};
		System.out.println(brand[0]);
		System.out.println(brand[1]);
		System.out.println(brand[2]);
		
		return brand1 + brand2 + brand3 + brand[0] + brand[1] +brand[2] ;
	}
}
