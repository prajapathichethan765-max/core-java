class Boat
{
	static void steelBoat(){
	System.out.println("running boat in water");
	strongBoat();
	}
	static void strongBoat(){
	System.out.println("running strong boat in water");
	steelBoat();
	}
	public static void main(String[] arge){
		steelBoat();
		strongBoat();
	}
}
