class Coconut{
	static byte noOfShild=1;
	static String outerlayerColor="green";
	static String innerLayerColor="brown";
	static String shape="round";
	public static void main(String[] args){
		int price=80;
		float weight=2.21f;
		float height=3.2f;
		String location="kogilu";
		String usedOFor="drinking parpose";
		System.out.println(Coconut.noOfShild);
		System.out.println(Coconut.outerlayerColor);
		System.out.println(Coconut.innerLayerColor);
		System.out.println(Coconut.shape);
		System.out.println(price);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(location);
		System.out.println(usedOFor);
		Coconut.canWeDrink();
		Coconut.canWeDrink();
		Coconut.canWeEat();
		Coconut.canWeUseForCook();
	}
	static void canWeDrink(){
		
				System.out.println("yes we can drink");
	}
	static void canWeEat(){
				System.out.println("yes we can eat");
	}
	static void canWeUseForCook(){
				System.out.println("yes we can cook");
	}
}


