class AmusementPark{
public static void main(String[] args){

System.out.println("park name");
AmusementPark.parkName();

System.out.println("total rides");
int rides = AmusementPark.rideCount();
System.out.println(rides);

System.out.println("maintenance charges");
float charges = AmusementPark.maintenanceCharges();
System.out.println(charges);

System.out.println("ride names");
String a = "Roller Coaster";
String b = "Ferris Wheel";
String c = "Water Slide";
AmusementPark.rideDetails(a,b,c);

System.out.println("ticket numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
AmusementPark.ticketNumbers(x,y,z);

System.out.println("park manager");
String manager = "Harish";
AmusementPark.managerDetails(manager);

System.out.println("available tickets");
int total = 5000;
int sold = 3200;
System.out.println(AmusementPark.availableTickets(total,sold));

System.out.println("park rating");
double rating = 4.6;
System.out.println(AmusementPark.parkRating(rating));

}

static void parkName(){
System.out.println("Wonderla");
}

static int rideCount(){
return 40;
}

static float maintenanceCharges(){
return 95000.50f;
}

static void rideDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void ticketNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void managerDetails(String name){
System.out.println(name);
}

static int availableTickets(int total,int sold){
if(total>=sold){
return total-sold;
}
else{
return 0;
}
}

static double parkRating(double value){
return value;
}
}