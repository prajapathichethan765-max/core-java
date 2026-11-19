class ZooPark{
public static void main(String[] args){

System.out.println("zoo name");
ZooPark.zooName();

System.out.println("animal count");
int animals = ZooPark.animalCount();
System.out.println(animals);

System.out.println("daily food cost");
float cost = ZooPark.foodCost();
System.out.println(cost);

System.out.println("animal names");
String a = "Lion";
String b = "Tiger";
String c = "Elephant";
ZooPark.animalDetails(a,b,c);

System.out.println("animal identification numbers");
long x = 12345L;
long y = 23456L;
long z = 34567L;
ZooPark.animalIds(x,y,z);

System.out.println("zoo director");
String director = "Mahesh";
ZooPark.directorName(director);

System.out.println("available tickets");
int total = 1000;
int sold = 700;
System.out.println(ZooPark.availableTickets(total,sold));

System.out.println("zoo rating");
double rating = 4.5;
System.out.println(ZooPark.zooRating(rating));

}

static void zooName(){
System.out.println("Mysore Zoo");
}

static int animalCount(){
return 1500;
}

static float foodCost(){
return 25000.50f;
}

static void animalDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void animalIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void directorName(String name){
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

static double zooRating(double value){
return value;
}
}