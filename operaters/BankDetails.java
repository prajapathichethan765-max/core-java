class BankDetails{
	public static void main(String[] args){

		String bank1 = "SBI";
		String bank2 = "HDFC";
		String bank3 = "ICICI";
		String bank4 = "Canara";
		String bank5 = "Axis";

		String bankNames[] = {bank1, bank2, bank3, bank4, bank5};

		System.out.println("Bank 0 = "+bankNames[0]);
		System.out.println("Bank 1 = "+bankNames[1]);
		System.out.println("Bank 2 = "+bankNames[2]);
		System.out.println("Bank 3 = "+bankNames[3]);
		System.out.println("Bank 4 = "+bankNames[4]);

		double balance1 = 15000.50d;
		double balance2 = 25000.75d;
		double balance3 = 35000.25d;
		double balance4 = 45000.50d;
		double balance5 = 55000.75d;

		double bankBalances[] = {balance1, balance2, balance3, balance4, balance5};

		System.out.println("Balance 0 = "+bankBalances[0]);
		System.out.println("Balance 1 = "+bankBalances[1]);
		System.out.println("Balance 2 = "+bankBalances[2]);
		System.out.println("Balance 3 = "+bankBalances[3]);
		System.out.println("Balance 4 = "+bankBalances[4]);

		bankBalances[4] = 65000.50d;

		System.out.println("Updated balance = "+bankBalances[4]);
	}
}