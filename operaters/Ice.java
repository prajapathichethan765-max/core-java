class Ice{
public static void main(String[] args){

System.out.println("company name");
Ice.companyName();

System.out.println("total flavors");
int flavors = Ice.flavorCount();
System.out.println(flavors);

System.out.println("daily production");
float production = Ice.production();
System.out.println(production);

System.out.println("ice cream types");
Ice.types("Vanilla","Chocolate","Strawberry");

System.out.println("product IDs");
Ice.productIds(111L,222L,333L);

System.out.println("manager");
Ice.manager("Kiran");

System.out.println("available products");
System.out.println(Ice.available(500,100));

System.out.println("ice cream weight");
System.out.println(Ice.weight(2.5));
}

static void companyName(){
System.out.println("Cool Creams");
}
static int flavorCount(){
return 50;
}
static float production(){
return 750.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void productIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void manager(String name){
System.out.println(name);
}
static int available(int total,sold){
return total-sold;
}
static double weight(double value){
return value;
}
}