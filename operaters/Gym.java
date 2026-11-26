class Gym{
public static void main(String[] args){

System.out.println("gym name");
Gym.gymName();

System.out.println("total equipment");
int equipment = Gym.equipmentCount();
System.out.println(equipment);

System.out.println("daily members");
float members = Gym.memberCount();
System.out.println(members);

System.out.println("equipment types");
Gym.types("Treadmill","Dumbbell","Cycle");

System.out.println("member IDs");
Gym.ids(111L,222L,333L);

System.out.println("trainer");
Gym.trainer("Vijay");

System.out.println("available equipment");
System.out.println(Gym.available(100,15));

System.out.println("gym area");
System.out.println(Gym.area(2500.5));
}

static void gymName(){
System.out.println("Power Fitness");
}
static int equipmentCount(){
return 100;
}
static float memberCount(){
return 250.5f;
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
static void trainer(String name){
System.out.println(name);
}
static int available(int total,int repair){
return total-repair;
}
static double area(double value){
return value;
}
}