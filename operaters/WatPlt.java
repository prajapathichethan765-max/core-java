class WatPlt{
public static void main(String[] args){

System.out.println("plant name");
WatPlt.plantName();

System.out.println("water tanks");
int tanks = WatPlt.tankCount();
System.out.println(tanks);

System.out.println("daily water");
float water = WatPlt.dailyWater();
System.out.println(water);

System.out.println("water sources");
String a = "River";
String b = "Lake";
String c = "Rain";
WatPlt.sources(a,b,c);

System.out.println("tank numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
WatPlt.tankNumbers(x,y,z);

System.out.println("manager");
String manager = "Rahul";
WatPlt.manager(manager);

System.out.println("empty tanks");
int total = 50;
int active = 35;
System.out.println(WatPlt.empty(total,active));

System.out.println("purity rate");
double rate = 96.5;
System.out.println(WatPlt.purity(rate));
}

static void plantName(){
System.out.println("Pure Water Plant");
}
static int tankCount(){
return 50;
}
static float dailyWater(){
return 4500.5f;
}
static void sources(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void tankNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void manager(String name){
System.out.println(name);
}
static int empty(int total,int active){
return total-active;
}
static double purity(double value){
return value;
}
}