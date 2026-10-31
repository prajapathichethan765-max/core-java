class CricketStadium{
public static void main(String[] args){

System.out.println("stadium name");
CricketStadium.stadiumName();

System.out.println("total seating capacity");
int capacity = CricketStadium.seatingCapacity();
System.out.println(capacity);

System.out.println("stadium maintenance cost");
float maintenance = CricketStadium.maintenanceCost();
System.out.println(maintenance);

System.out.println("teams played in stadium");
String team1 = "India";
String team2 = "Australia";
String team3 = "England";
CricketStadium.teamDetails(team1,team2,team3);

System.out.println("match ticket prices");
long price1 = 500L;
long price2 = 1000L;
long price3 = 2000L;
CricketStadium.ticketPrices(price1,price2,price3);

System.out.println("stadium owner");
String owner = "Vikram";
CricketStadium.ownerDetails(owner);

System.out.println("check available seats");
int total = 40000;
int booked = 30000;
int available = CricketStadium.availableSeats(total,booked);
System.out.println(available);

System.out.println("stadium rating");
double rating = 4.8;
double stadiumRating = CricketStadium.ratingCheck(rating);
System.out.println(stadiumRating);

}

static void stadiumName(){
System.out.println("M Chinnaswamy Stadium");
}

static int seatingCapacity(){
return 40000;
}

static float maintenanceCost(){
return 250000.75f;
}

static void teamDetails(String teamA,String teamB,String teamC){
System.out.println(teamA);
System.out.println(teamB);
System.out.println(teamC);
}

static void ticketPrices(long amount1,long amount2,long amount3){
System.out.println(amount1);
System.out.println(amount2);
System.out.println(amount3);
}

static void ownerDetails(String ownerName){
System.out.println(ownerName);
}

static int availableSeats(int totalSeats,int bookedSeats){
if(totalSeats >= bookedSeats){
return totalSeats-bookedSeats;
}
else{
return 0;
}
}

static double ratingCheck(double value){
return value;
}
}