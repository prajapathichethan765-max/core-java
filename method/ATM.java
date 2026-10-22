class ATM{
	public static void main(String[] args){
	System.out.println("insert the ATM card");
	ATM.isCardIsInserted();
	System.out.println("select the laguage");	
    ATM.selectedlaguageis();
    System.out.println("enter the amount");
    ATM.amount();
    System.out.println("enter the ATM card pin");	
    ATM.atmpin(); 
 	
		
		
		
		
	}
	static void isCardIsInserted(){
	System.out.println("yes card is inserted");	
	}
	static void selectedlaguageis(){
		System.out.println("english");
	}
    static void amount(){
			System.out.println("10000");
	}
	static void atmpin(){
		System.out.println("2132");
	}
}

