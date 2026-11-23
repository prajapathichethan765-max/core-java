class ShpCmp{
public static void main(String[] args){

System.out.println("company name");
ShpCmp.companyName();

System.out.println("total ships");
int ships = ShpCmp.shipCount();
System.out.println(ships);

System.out.println("daily cargo");
float cargo = ShpCmp.cargo();
System.out.println(cargo);

System.out.println("ship names");
ShpCmp.ships("Ocean Star","Sea King","Blue Wave");

System.out.println("ship IDs");
ShpCmp.ids(123L,456L,789L);

System.out.println("captain");
ShpCmp.captain("Raj");

System.out.println("available ships");
System.out.println(ShpCmp.available(50,35));

System.out.println("ship weight");
System.out.println(ShpCmp.weight(2500.5));
}

static void companyName(){
System.out.println("Ocean Shipping");
}
static int shipCount(){
return 50;
}
static float cargo(){
return 750.5f;
}
static void ships(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void captain(String name){
System.out.println(name);
}
static int available(int total,int busy){
return total-busy;
}
static double weight(double value){
return value;
}
}