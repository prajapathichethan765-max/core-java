class SportsAcademyy{
public static void main(String[] args){

System.out.println("academy name");
SportsAcademy.academyName();

System.out.println("total players");
int players = SportsAcademy.playerCount();
System.out.println(players);

System.out.println("training fees");
float fees = SportsAcademy.trainingFees();
System.out.println(fees);

System.out.println("sports");
String a = "Cricket";
String b = "Football";
String c = "Badminton";
SportsAcademy.sportDetails(a,b,c);

System.out.println("player IDs");
long x = 123456L;
long y = 234567L;
long z = 345678L;
SportsAcademy.playerIds(x,y,z);

System.out.println("head coach");
String coach = "Rohit";
SportsAcademy.coachDetails(coach);

System.out.println("available seats");
int total = 500;
int joined = 350;
System.out.println(SportsAcademy.availableSeats(total,joined));

System.out.println("academy rating");
double rating = 4.7;
System.out.println(SportsAcademy.academyRating(rating));

}

static void academyName(){
System.out.println("Champion Sports Academy");
}

static int playerCount(){
return 350;
}

static float trainingFees(){
return 12000.50f;
}

static void sportDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void playerIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void coachDetails(String name){
System.out.println(name);
}

static int availableSeats(int total,int joined){
if(total>=joined){
return total-joined;
}
else{
return 0;
}
}

static double academyRating(double value){
return value;
}
}