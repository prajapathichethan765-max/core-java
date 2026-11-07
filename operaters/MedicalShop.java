class MedicalShop{
	static String medicinsName(String medicin1 , String medicin2 , String medicin3 , String medicin4){
		
		System.out.println(medicin1);
		System.out.println(medicin2);
		System.out.println(medicin3);
		System.out.println(medicin4);
		
		String priceOfMedicins[] = {"100" , "200" , "300" , "400"};
		
		System.out.println( medicin1 + "=" + priceOfMedicins[0]);
		System.out.println(medicin2 + "=" +priceOfMedicins[1]);
		System.out.println(medicin3 + "=" +priceOfMedicins[2]);
		System.out.println(medicin4 + "=" +priceOfMedicins[3]);
		
		return priceOfMedicins[0] + "  " + priceOfMedicins[2] + " " + priceOfMedicins[1] + " " + priceOfMedicins[3];
	}
}

		
		