class Dmart{
	public static void main(String[] args){
System.out.println("what is the address of the Dmart");
Dmart.addressOfTheDmart();
Dmart.addressOfTheDmart();
Dmart.addressOfTheDmart();

System.out.println("name of the owner ");
Dmart.nameOfTheOwner();
Dmart.nameOfTheOwner();
Dmart.nameOfTheOwner();

System.out.println("mark is open? ");
Dmart.openStore();
Dmart.openStore();
Dmart.openStore();

System.out.println("mark is closed  ");
Dmart.closeStroe();
Dmart.closeStroe();
Dmart.closeStroe();

System.out.println("types of products avilable ");
String typeOfProducts =Dmart.typesOfProduct();
System.out.println(typeOfProducts);
System.out.println(typeOfProducts);
System.out.println(typeOfProducts);

System.out.println("what is the price of facewash");
int price=	Dmart.priceOfFaceWash();
System.out.println(price);
System.out.println(price);
System.out.println(price);


System.out.println("where is the cloth section");
String clothSection=Dmart.clothSection();
System.out.println(clothSection);
System.out.println(clothSection);
System.out.println(clothSection);


System.out.println("what is my total bill??");
float bill=Dmart.totalBillAmount();
System.out.println(bill);
System.out.println(bill);
System.out.println(bill);



	}
	static void addressOfTheDmart(){
		System.out.println("yelahanka");
	}
	static void nameOfTheOwner(){
		System.out.println("mniyapa");
	}
	static void openStore(){
		System.out.println("store is open");
	}		
    static void closeStroe(){
		System.out.println("store is closed");
	}
	static String typesOfProduct(){
		String typesOfProducts="facewash , rice, chocolate etc";
		return typesOfProducts;
	}
	static int priceOfFaceWash(){
		int price=100;
		return price;
	}
	static String clothSection(){
		String clothArea="3rd floor";
		return clothArea;
	}
	static float totalBillAmount(){
		float billAmount=2342.3f;
		return billAmount;
	}
}
