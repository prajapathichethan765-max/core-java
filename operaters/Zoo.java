class Zoo{
public static void main(String[] args){

System.out.println("zoo name");
Zoo.zooName();

System.out.println("total animals");
int animals = Zoo.animalCount();
System.out.println(animals);

System.out.println("daily food");
float food = Zoo.food();
System.out.println(food);

System.out.println("animal types");
Zoo.types("Lion","Tiger","Elephant");

System.out.println("animal IDs");
Zoo.ids(1001L,1002L,1003L);

System.out.println("keeper");
Zoo.keeper("Arun");

System.out.println("available cages");
System.out.println(Zoo.cages(100,65));

System.out.println("zoo area");
System.out.println(Zoo.area(4500.5));
}

static void zooName(){
System.out.println("National Zoo");
}
static int animalCount(){
return 250;
}
static float food(){
return 500.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void keeper(String name){
System.out.println(name);
}
static int cages(int total,int occupied){
return total-occupied;
}
static double area(double value){
return value;
}
}