class Dry{
public static void main(String[] args){

System.out.println("farm name");
Dry.farmName();

System.out.println("total cows");
int cows = Dry.cowCount();
System.out.println(cows);

System.out.println("daily milk");
float milk = Dry.milk();
System.out.println(milk);

System.out.println("animal types");
Dry.animals("Cow","Buffalo","Goat");

System.out.println("animal IDs");
Dry.animalIds(111L,222L,333L);

System.out.println("farm owner");
Dry.owner("Mohan");

System.out.println("healthy animals");
System.out.println(Dry.healthy(200,15));

System.out.println("farm area");
System.out.println(Dry.area(5000.5));
}

static void farmName(){
System.out.println("Green Dairy Farm");
}
static int cowCount(){
return 200;
}
static float milk(){
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
static void owner(String name){
System.out.println(name);
}
static int healthy(int total,int sick){
return total-sick;
}
static double area(double value){
return value;
}
}