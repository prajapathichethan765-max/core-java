class Gmt{
public static void main(String[] args){

System.out.println("shop name");
Gmt.shopName();

System.out.println("total clothes");
int clothes = Gmt.clothCount();
System.out.println(clothes);

System.out.println("daily sales");
float sales = Gmt.sales();
System.out.println(sales);

System.out.println("cloth types");
Gmt.types("Shirt","Jeans","Jacket");

System.out.println("product IDs");
Gmt.productIds(111L,222L,333L);

System.out.println("shop owner");
Gmt.owner("Nithin");

System.out.println("available clothes");
System.out.println(Gmt.available(500,120));

System.out.println("cloth length");
System.out.println(Gmt.length(2.5));
}

static void shopName(){
System.out.println("Fashion Store");
}
static int clothCount(){
return 500;
}
static float sales(){
return 25000.5f;
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
static void owner(String name){
System.out.println(name);
}
static int available(int total,int sold){
return total-sold;
}
static double length(double value){
return value;
}
}