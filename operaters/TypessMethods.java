class TypessMethods{
public static void main(String[] c){
System.out.println(c[0]);
System.out.println(c[1]);
System.out.println(c[2]);
System.out.println(c[3]);

System.out.println("price of the bag");
TypessMethods.bagPrice();

System.out.println("address of the cmr university");
String address = TypessMethods.CollageAddress();
System.out.println(address);

System.out.println("addition of two number");
int a = 100;
int b = 500;
 TypessMethods.addition(a,b);


System.out.println("substarction");
int result1 = TypessMethods.substarction(a,b);
System.out.println(result1);



}
static void bagPrice(){
System.out.println("10000");
}
static String CollageAddress(){
	String address="bagluru yelahanka";
	return address;
}
static void addition(int a , int b){
System.out.println("sum="+a);
System.out.println("sum2="+b);
}
static int substarction(int a , int b){
int sum = a-b;
return sum;
}
}
	

