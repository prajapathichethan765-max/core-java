class Pwr{
public static void main(String[] args){

System.out.println("plant name");
Wtr.plantName();

System.out.println("total tanks");
int tanks = Wtr.tankCount();
System.out.println(tanks);

System.out.println("daily water");
float water = Wtr.water();
System.out.println(water);

System.out.println("water types");
Wtr.types("Drinking","Mineral","Filtered");

System.out.println("tank IDs");
Wtr.tankIds(111L,222L,333L);

System.out.println("supervisor");
Wtr.supervisor("Dinesh");

System.out.println("active tanks");
System.out.println(Wtr.active(100,15));

System.out.println("tank capacity");
System.out.println(Wtr.capacity(5000.5));
}

static void plantName(){
System.out.println("Pure Water Plant");
}
static int tankCount(){
return 100;
}
static float water(){
return 7500.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void tankIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void supervisor(String name){
System.out.println(name);
}
static int active(int total,int damaged){
return total-damaged;
}
static double capacity(double value){
return value;
}
}