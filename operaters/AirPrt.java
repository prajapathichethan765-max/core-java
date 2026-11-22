class AirPrt{
public static void main(String[] args){

System.out.println("airport name");
AirPrt.airportName();

System.out.println("total flights");
int flights = AirPrt.flightCount();
System.out.println(flights);

System.out.println("daily passengers");
float passengers = AirPrt.passengers();
System.out.println(passengers);

System.out.println("airlines");
String a = "Indigo";
String b = "Air India";
String c = "Emirates";
AirPrt.airlines(a,b,c);

System.out.println("flight numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
AirPrt.flightNumbers(x,y,z);

System.out.println("pilot");
String pilot = "Ramesh";
AirPrt.pilot(pilot);

System.out.println("grounded flights");
int total = 120;
int active = 100;
System.out.println(AirPrt.grounded(total,active));

System.out.println("on time rate");
double rate = 94.5;
System.out.println(AirPrt.onTime(rate));
}

static void airportName(){
System.out.println("Kempegowda Airport");
}
static int flightCount(){
return 120;
}
static float passengers(){
return 8500.5f;
}
static void airlines(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void flightNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void pilot(String name){
System.out.println(name);
}
static int grounded(int total,int active){
return total-active;
}
static double onTime(double value){
return value;
}
}