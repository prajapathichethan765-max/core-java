class Airport{
public static void main(String[] args){

System.out.println("airport name");
Airport.airportName();

System.out.println("total flights");
int flights = Airport.flightCount();
System.out.println(flights);

System.out.println("runway length");
float length = Airport.runwayLength();
System.out.println(length);

System.out.println("airlines");
String a = "Indigo";
String b = "Air India";
String c = "Vistara";
Airport.airlineDetails(a,b,c);

System.out.println("flight numbers");
long f1 = 12345L;
long f2 = 67890L;
long f3 = 45678L;
Airport.flightNumbers(f1,f2,f3);

System.out.println("airport manager");
String manager = "Rahul";
Airport.managerDetails(manager);

System.out.println("available parking");
int total = 500;
int occupied = 350;
int available = Airport.parkingSlots(total,occupied);
System.out.println(available);

System.out.println("airport rating");
double rating = 4.7;
System.out.println(Airport.ratingCheck(rating));

}

static void airportName(){
System.out.println("Kempegowda International Airport");
}

static int flightCount(){
return 250;
}

static float runwayLength(){
return 4000.5f;
}

static void airlineDetails(String x,String y,String z){
System.out.println(x);
System.out.println(y);
System.out.println(z);
}

static void flightNumbers(long x,long y,long z){
System.out.println(x);
System.out.println(y);
System.out.println(z);
}

static void managerDetails(String name){
System.out.println(name);
}

static int parkingSlots(int total,int occupied){
if(total>=occupied){
return total-occupied;
}
else{
return 0;
}
}

static double ratingCheck(double value){
return value;
}
}