class Elt{
public static void main(String[] args){

System.out.println("shop name");
Elt.shopName();

System.out.println("total products");
int products = Elt.productCount();
System.out.println(products);

System.out.println("daily sales");
float sales = Elt.sales();
System.out.println(sales);

System.out.println("product types");
Elt.types("Laptop","TV","Mobile");

System.out.println("product IDs");
Elt.ids(111L,222L,333L);

System.out.println("shop owner");
Elt.owner("Naveen");

System.out.println("available products");
System.out.println(Elt.available(500,75));

System.out.println("screen size");
System.out.println(Elt.screen(55.5));
}

static void shopName(){
System.out.println("Electro Mart");
}
static int productCount(){
return 500;
}
static float sales(){
return 35000.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
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
static double screen(double value){
return value;
}
}