class PowerStation{
public static void main(String[] args){

System.out.println("station name");
PowerStation.stationName();

System.out.println("total generators");
int generators = PowerStation.generatorCount();
System.out.println(generators);

System.out.println("daily operating cost");
float cost = PowerStation.operatingCost();
System.out.println(cost);

System.out.println("energy sources");
String a = "Solar";
String b = "Wind";
String c = "Hydro";
PowerStation.energySources(a,b,c);

System.out.println("generator numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
PowerStation.generatorIds(x,y,z);

System.out.println("station engineer");
String engineer = "Kumar";
PowerStation.engineerDetails(engineer);

System.out.println("remaining capacity");
int total = 10000;
int used = 6500;
System.out.println(PowerStation.remainingCapacity(total,used));

System.out.println("station rating");
double rating = 4.4;
System.out.println(PowerStation.stationRating(rating));

}

static void stationName(){
System.out.println("Raichur Power Station");
}

static int generatorCount(){
return 25;
}

static float operatingCost(){
return 85000.50f;
}

static void energySources(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void generatorIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void engineerDetails(String name){
System.out.println(name);
}

static int remainingCapacity(int total,int used){
if(total>=used){
return total-used;
}
else{
return 0;
}
}

static double stationRating(double value){
return value;
}
}