class ZooPrk{
public static void main(String[] args){

System.out.println("zoo name");
ZooPrk.zooName();

System.out.println("total animals");
int animals = ZooPrk.animalCount();
System.out.println(animals);

System.out.println("daily food");
float food = ZooPrk.dailyFood();
System.out.println(food);

System.out.println("animal types");
String a = "Lion";
String b = "Tiger";
String c = "Elephant";
ZooPrk.animalTypes(a,b,c);

System.out.println("animal codes");
long x = 123456L;
long y = 234567L;
long z = 345678L;
ZooPrk.animalCodes(x,y,z);

System.out.println("keeper");
String keeper = "Vikram";
ZooPrk.keeper(keeper);

System.out.println("available cages");
int total = 90;
int occupied = 65;
System.out.println(ZooPrk.available(total,occupied));

System.out.println("health rate");
double rate = 98.5;
System.out.println(ZooPrk.health(rate));
}

static void zooName(){
System.out.println("National Zoo Park");
}
static int animalCount(){
return 200;
}
static float dailyFood(){
return 750.5f;
}
static void animalTypes(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void animalCodes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void keeper(String name){
System.out.println(name);
}
static int available(int total,int occupied){
return total-occupied;
}
static double health(double value){
return value;
}
}