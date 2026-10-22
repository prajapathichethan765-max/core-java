class CarShowroom{
	public static void main(String[] args){
		
	System.out.println("what is the car modle name");
	int modle=CarShowroom.carModle();
    System.out.println(modle);
	
	System.out.println("car name");	
	String name= CarShowroom.nameOfCar();	
	System.out.println(name);
	
    System.out.println("price of the car");
    long price=CarShowroom.priceOfTheCar();
    System.out.println(price);
	
	System.out.println("color the car");
	String color=CarShowroom.colorOfTheCar();
	System.out.println(color);
	
		
	}
	static int carModle(){
	int modle=2026;
	return modle;
	}
	static String nameOfCar(){
	String name="fortuner";
	return name;
	}
	static long priceOfTheCar(){
	long price=3000000;
    return price;
	}
	static String colorOfTheCar(){
	String color="black";	
	return color;
	
}


}