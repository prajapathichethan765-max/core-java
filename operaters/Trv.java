class Trv{
public static void main(String[] args){

System.out.println("agency name");
Trv.agencyName();

System.out.println("total packages");
int packages = Trv.packageCount();
System.out.println(packages);

System.out.println("daily bookings");
float bookings = Trv.bookings();
System.out.println(bookings);

System.out.println("destinations");
Trv.places("Goa","Kerala","Manali");

System.out.println("booking IDs");
Trv.bookingIds(111L,222L,333L);

System.out.println("guide");
Trv.guide("Rohit");

System.out.println("available packages");
System.out.println(Trv.available(200,50));

System.out.println("trip distance");
System.out.println(Trv.distance(750.5));
}

static void agencyName(){
System.out.println("Dream Travels");
}
static int packageCount(){
return 200;
}
static float bookings(){
return 45.5f;
}
static void places(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void bookingIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void guide(String name){
System.out.println(name);
}
static int available(int total, int booked){
return total-booked;
}
static double distance(double value){
return value;
}
}