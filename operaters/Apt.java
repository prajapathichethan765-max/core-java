class Apt{
public static void main(String[] args){

System.out.println("airport name");
Apt.airportName();

System.out.println("total flights");
int flights = Apt.flightCount();
System.out.println(flights);

System.out.println("daily fuel");
float fuel = Apt.fuel();
System.out.println(fuel);

System.out.println("airlines");
Apt.airlines("Indigo","Air India","Emirates");

System.out.println("flight IDs");
Apt.flightIds(111L,222L,333L);

System.out.println("pilot");
Apt.pilot("Vijay");

System.out.println("available flights");
System.out.println(Apt.available(100,30));

System.out.println("runway length");
System.out.println(Apt.runway(3000.5));
}

static void airportName(){
System.out.println("Kempegowda Airport");
}
static int flightCount(){
return 100;
}
static float fuel(){
return 7500.5f;
}
static void airlines(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void flightIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void pilot(String name){
System.out.println(name);
}
static int available(int total,int busy){
return total-busy;
}
static double runway(double value){
return value;
}
}