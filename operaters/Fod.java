class Fod{
public static void main(String[] args){

System.out.println("company name");
Fod.companyName();

System.out.println("total products");
int products = Fod.productCount();
System.out.println(products);

System.out.println("daily sales");
float sales = Fod.sales();
System.out.println(sales);

System.out.println("food items");
Fod.items("Pizza","Burger","Sandwich");

System.out.println("product IDs");
Fod.productIds(111L,222L,333L);

System.out.println("chef");
Fod.chef("Karthik");

System.out.println("available items");
System.out.println(Fod.available(500,100));

System.out.println("food weight");
System.out.println(Fod.weight(2.5));
}

static void companyName(){
System.out.println("Fresh Foods");
}
static int productCount(){
return 500;
}
static float sales(){
return 25000.5f;
}
static void items(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void productIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void chef(String name){
System.out.println(name);
}
static int available(int total,int sold){
return total-sold;
}
static double weight(double value){
return value;
}
}