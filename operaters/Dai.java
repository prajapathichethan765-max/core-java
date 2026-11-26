class Dai{
public static void main(String[] args){

System.out.println("company name");
Dai.companyName();

System.out.println("total milk vans");
int vans = Dai.vanCount();
System.out.println(vans);

System.out.println("daily milk");
float milk = Dai.milk();
System.out.println(milk);

System.out.println("products");
Dai.products("Milk","Curd","Butter");

System.out.println("product IDs");
Dai.ids(111L,222L,333L);

System.out.println("supervisor");
Dai.supervisor("Kiran");

System.out.println("available vans");
System.out.println(Dai.available(40,8));

System.out.println("milk capacity");
System.out.println(Dai.capacity(500.5));
}

static void companyName(){
System.out.println("Fresh Dairy");
}
static int vanCount(){
return 40;
}
static float milk(){
return 850.5f;
}
static void products(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void supervisor(String name){
System.out.println(name);
}
static int available(int total,int busy){
return total-busy;
}
static double capacity(double value){
return value;
}
}