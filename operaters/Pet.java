class Pet{
public static void main(String[] args){

System.out.println("bunk name");
Pet.bunkName();

System.out.println("total pumps");
int pumps = Pet.pumpCount();
System.out.println(pumps);

System.out.println("daily fuel");
float fuel = Pet.fuel();
System.out.println(fuel);

System.out.println("fuel types");
Pet.types("Petrol","Diesel","CNG");

System.out.println("pump IDs");
Pet.ids(111L,222L,333L);

System.out.println("manager");
Pet.manager("Ravi");

System.out.println("working pumps");
System.out.println(Pet.working(20,5));

System.out.println("fuel price");
System.out.println(Pet.price(105.5));
}

static void bunkName(){
System.out.println("Speed Petrol Bunk");
}
static int pumpCount(){
return 20;
}
static float fuel(){
return 750.5f;
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
static void manager(String name){
System.out.println(name);
}
static int working(int total,int repair){
return total-repair;
}
static double price(double value){
return value;
}
}