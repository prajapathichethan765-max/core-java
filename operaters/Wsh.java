class Wsh{
public static void main(String[] args){

System.out.println("workshop name");
Wsh.workshopName();

System.out.println("total vehicles");
int vehicles = Wsh.vehicleCount();
System.out.println(vehicles);

System.out.println("daily repairs");
float repairs = Wsh.repairs();
System.out.println(repairs);

System.out.println("vehicle types");
Wsh.types("Car","Bike","Truck");

System.out.println("service IDs");
Wsh.serviceIds(111L,222L,333L);

System.out.println("mechanic");
Wsh.mechanic("Lokesh");

System.out.println("pending vehicles");
System.out.println(Wsh.pending(100,35));

System.out.println("engine capacity");
System.out.println(Wsh.capacity(1500.5));
}

static void workshopName(){
System.out.println("Auto Care Center");
}
static int vehicleCount(){
return 100;
}
static float repairs(){
return 25.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void serviceIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void mechanic(String name){
System.out.println(name);
}
static int pending(int total,int completed){
return total-completed;
}
static double capacity(double value){
return value;
}
}