class FisFrm{
public static void main(String[] args){

System.out.println("farm name");
FisFrm.farmName();

System.out.println("total ponds");
int ponds = FisFrm.pondCount();
System.out.println(ponds);

System.out.println("daily fish food");
float food = FisFrm.dailyFood();
System.out.println(food);

System.out.println("fish types");
String a = "Salmon";
String b = "Tuna";
String c = "Rohu";
FisFrm.fishTypes(a,b,c);

System.out.println("pond numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
FisFrm.pondNumbers(x,y,z);

System.out.println("supervisor");
String supervisor = "Ravi";
FisFrm.supervisor(supervisor);

System.out.println("empty ponds");
int total = 70;
int occupied = 50;
System.out.println(FisFrm.empty(total,occupied));

System.out.println("water quality");
double quality = 96.5;
System.out.println(FisFrm.quality(quality));
}

static void farmName(){
System.out.println("Blue Ocean Fish Farm");
}
static int pondCount(){
return 70;
}
static float dailyFood(){
return 250.5f;
}
static void fishTypes(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void pondNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void supervisor(String name){
System.out.println(name);
}
static int empty(int total,int occupied){
return total-occupied;
}
static double quality(double value){
return value;
}
}