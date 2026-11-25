class Zoo{
public static void main(String[] args){

System.out.println("zoo name");
Zoo.zooName();

System.out.println("total animals");
int animals = Zoo.animalCount();
System.out.println(animals);

System.out.println("daily visitors");
float visitors = Zoo.visitorCount();
System.out.println(visitors);

System.out.println("animal names");
Zoo.animals("Lion","Tiger","Elephant");

System.out.println("animal IDs");
Zoo.animalIds(111L,222L,333L);

System.out.println("zookeeper");
Zoo.keeper("Vimal");

System.out.println("healthy animals");
System.out.println(Zoo.healthy(300,25));

System.out.println("zoo area");
System.out.println(Zoo.area(5000.5));
}

static void zooName(){
System.out.println("National Zoo");
}
static int animalCount(){
return 300;
}
static float visitorCount(){
return 750.5f;
}
static void animals(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void animalIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void keeper(String name){
System.out.println(name);
}
static int healthy(int total,int sick){
return total-sick;
}
static double area(double value){
return value;
}
}