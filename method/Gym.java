class Gym{
	public static void main(String[] args){
		System.out.println("whats the cost of 1 month membership");
		int price = Gym.costOfOneYear();
		System.out.println(price);
		
		
		System.out.println("phone number of the owner");
		long number=Gym.ownerPhoneNumber();
		System.out.println(number);
		
		System.out.println("name of the owner");
		String name=Gym.nameOfTheOwner();
		System.out.println(name);
		
	}
	static int costOfOneYear(){
		int cost=1000;
		return cost;
	}
	static long ownerPhoneNumber(){
		long phoneNumberOfTheOwner=861237151;
		return phoneNumberOfTheOwner;
		
	
}
static String nameOfTheOwner(){
		String nameOfOwner="vishnu";
		return nameOfOwner;
	}
}
