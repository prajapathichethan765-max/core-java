class AquariumCenter{
public static void main(String[] args){

System.out.println("aquarium name");
AquariumCenter.aquariumName();

System.out.println("total fish");
int fish = AquariumCenter.fishCount();
System.out.println(fish);

System.out.println("water temperature");
float temperature = AquariumCenter.waterTemperature();
System.out.println(temperature);

System.out.println("fish varieties");
String a = "Goldfish";
String b = "Shark";
String c = "Starfish";
AquariumCenter.fishVarieties(a,b,c);

System.out.println("tank identification numbers");
long x = 1234567L;
long y = 2345678L;
long z = 3456789L;
AquariumCenter.tankNumbers(x,y,z);

System.out.println("aquarium manager");
String manager = "Kiran";
AquariumCenter.managerDetails(manager);

System.out.println("available tanks");
int total = 150;
int occupied = 110;
System.out.println(AquariumCenter.availableTanks(total,occupied));

System.out.println("visitor rating");
double rating = 4.8;
System.out.println(AquariumCenter.visitorRating(rating));

}

static void aquariumName(){
System.out.println("Ocean World Aquarium");
}

static int fishCount(){
return 2500;
}

static float waterTemperature(){
return 26.5f;
}

static void fishVarieties(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void tankNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void managerDetails(String name){
System.out.println(name);
}

static int availableTanks(int total,int occupied){
return total-occupied;
}

static double visitorRating(double value){
return value;
}
}