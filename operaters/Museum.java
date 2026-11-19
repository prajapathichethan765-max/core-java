class Museum{
public static void main(String[] args){

System.out.println("museum name");
Museum.museumName();

System.out.println("total exhibits");
int exhibits = Museum.exhibitCount();
System.out.println(exhibits);

System.out.println("maintenance cost");
float cost = Museum.maintenanceCost();
System.out.println(cost);

System.out.println("exhibit names");
String a = "Ancient Coins";
String b = "Sculptures";
String c = "Paintings";
Museum.exhibitDetails(a,b,c);

System.out.println("artifact numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
Museum.artifactIds(x,y,z);

System.out.println("museum curator");
String curator = "Deepak";
Museum.curatorDetails(curator);

System.out.println("available tickets");
int total = 2000;
int sold = 1200;
System.out.println(Museum.availableTickets(total,sold));

System.out.println("museum rating");
double rating = 4.7;
System.out.println(Museum.museumRating(rating));

}

static void museumName(){
System.out.println("National Museum");
}

static int exhibitCount(){
return 500;
}

static float maintenanceCost(){
return 65000.50f;
}

static void exhibitDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void artifactIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void curatorDetails(String name){
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

static double museumRating(double value){
return value;
}
}