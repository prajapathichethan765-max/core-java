class RailwayStation{
public static void main(String[] args){

System.out.println("station name");
RailwayStation.stationName();

System.out.println("platform count");
int platforms = RailwayStation.platformCount();
System.out.println(platforms);

System.out.println("daily maintenance");
float cost = RailwayStation.maintenanceCost();
System.out.println(cost);

System.out.println("train names");
String train1 = "Rajdhani Express";
String train2 = "Shatabdi Express";
String train3 = "Vande Bharat";
RailwayStation.trainDetails(train1,train2,train3);

System.out.println("train numbers");
long n1 = 12627L;
long n2 = 12007L;
long n3 = 20661L;
RailwayStation.trainNumbers(n1,n2,n3);

System.out.println("station master");
String master = "Ramesh";
RailwayStation.masterDetails(master);

System.out.println("available seats");
int total = 1200;
int booked = 900;
System.out.println(RailwayStation.availableSeats(total,booked));

System.out.println("station rating");
double rating = 4.6;
System.out.println(RailwayStation.stationRating(rating));

}

static void stationName(){
System.out.println("Bengaluru City Railway Station");
}

static int platformCount(){
return 10;
}

static float maintenanceCost(){
return 45000.75f;
}

static void trainDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void trainNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void masterDetails(String name){
System.out.println(name);
}

static int availableSeats(int total,int booked){
if(total>=booked){
return total-booked;
}
else{
return 0;
}
}

static double stationRating(double value){
return value;
}
}