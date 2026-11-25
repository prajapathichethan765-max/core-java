class Ele{
public static void main(String[] args){

System.out.println("company name");
Ele.companyName();

System.out.println("total meters");
int meters = Ele.meterCount();
System.out.println(meters);

System.out.println("daily units");
float units = Ele.units();
System.out.println(units);

System.out.println("power sources");
Ele.sources("Solar","Wind","Hydro");

System.out.println("meter IDs");
Ele.meterIds(111L,222L,333L);

System.out.println("engineer");
Ele.engineer("Akshay");

System.out.println("active meters");
System.out.println(Ele.active(500,50));

System.out.println("voltage");
System.out.println(Ele.voltage(240.5));
}

static void companyName(){
System.out.println("Bright Electricity");
}
static int meterCount(){
return 500;
}
static float units(){
return 850.5f;
}
static void sources(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void meterIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void engineer(String name){
System.out.println(name);
}
static int active(int total,int damaged){
return total-damaged;
}
static double voltage(double value){
return value;
}
}