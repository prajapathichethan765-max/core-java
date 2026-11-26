class Flw{
public static void main(String[] args){

System.out.println("shop name");
Flw.shopName();

System.out.println("total flowers");
int flowers = Flw.flowerCount();
System.out.println(flowers);

System.out.println("daily bouquets");
float bouquets = Flw.bouquets();
System.out.println(bouquets);

System.out.println("flower types");
Flw.types("Rose","Lily","Tulip");

System.out.println("flower IDs");
Flw.ids(111L,222L,333L);

System.out.println("gardener");
Flw.gardener("Ramesh");

System.out.println("available flowers");
System.out.println(Flw.available(300,50));

System.out.println("flower height");
System.out.println(Flw.height(25.5));
}

static void shopName(){
System.out.println("Rose Garden");
}
static int flowerCount(){
return 300;
}
static float bouquets(){
return 150.5f;
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
static void gardener(String name){
System.out.println(name);
}
static int available(int total,int sold){
return total-sold;
}
static double height(double value){
return value;
}
}