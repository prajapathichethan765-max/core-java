class RailwayStation{
public static void main(String[] args){

System.out.println("railway station name");
RailwayStation.stationName();

System.out.println("number of platforms");
byte platforms = RailwayStation.platformCount();
System.out.println(platforms);

System.out.println("daily passenger income");
double income = RailwayStation.passengerIncome();
System.out.println(income);

System.out.println("train names");
String t1 = "Rajdhani Express";
String t2 = "Shatabdi Express";
String t3 = "Vande Bharat";
RailwayStation.trainDetails(t1,t2,t3);

System.out.println("ticket prices");
int ticket1 = 450;
int ticket2 = 750;
int ticket3 = 1200;
RailwayStation.ticketDetails(ticket1,ticket2,ticket3);

System.out.println("station master name");
String master = "Suresh";
RailwayStation.stationMaster(master);

System.out.println("check available seats");
long totalSeats = 5000L;
long bookedSeats = 3500L;
long remainingSeats = RailwayStation.seatAvailability(totalSeats,bookedSeats);
System.out.println(remainingSeats);

System.out.println("station code");
char code = 'B';
char stationCode = RailwayStation.codeDetails(code);
System.out.println(stationCode);

}

static void stationName(){
System.out.println("Bangalore City Junction");
}

static byte platformCount(){
return 10;
}

static double passengerIncome(){
return 450000.75;
}

static void trainDetails(String train1,String train2,String train3){
System.out.println(train1);
System.out.println(train2);
System.out.println(train3);
}

static void ticketDetails(int price1,int price2,int price3){
System.out.println(price1);
System.out.println(price2);
System.out.println(price3);
}

static void stationMaster(String name){
System.out.println(name);
}

static long seatAvailability(long total,long booked){
if(total > booked){
return total-booked;
}
else{
return 0L;
}
}

static char codeDetails(char station){
return station;
}
}