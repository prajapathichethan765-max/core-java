class MobileStore{
	public static void main(String[] args){

		String mobile1 = "Samsung";
		String mobile2 = "Apple";
		String mobile3 = "Vivo";
		String mobile4 = "Oppo";
		String mobile5 = "OnePlus";

		String mobileBrands[] = {mobile1, mobile2, mobile3, mobile4, mobile5};

		System.out.println("Mobile index 0 = "+mobileBrands[0]);
		System.out.println("Mobile index 1 = "+mobileBrands[1]);
		System.out.println("Mobile index 2 = "+mobileBrands[2]);
		System.out.println("Mobile index 3 = "+mobileBrands[3]);
		System.out.println("Mobile index 4 = "+mobileBrands[4]);

		long mobilePrice1 = 25000L;
		long mobilePrice2 = 85000L;
		long mobilePrice3 = 18000L;
		long mobilePrice4 = 22000L;
		long mobilePrice5 = 35000L;

		long mobilePrices[] = {mobilePrice1, mobilePrice2, mobilePrice3, mobilePrice4, mobilePrice5};

		System.out.println("Price index 0 = "+mobilePrices[0]);
		System.out.println("Price index 1 = "+mobilePrices[1]);
		System.out.println("Price index 2 = "+mobilePrices[2]);
		System.out.println("Price index 3 = "+mobilePrices[3]);
		System.out.println("Price index 4 = "+mobilePrices[4]);

		mobileBrands[2] = "Realme";

		System.out.println("Updated mobile = "+mobileBrands[2]);
	}
}