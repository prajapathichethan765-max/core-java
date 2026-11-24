class Txt{
public static void main(String[] args){

System.out.println("factory name");
Txt.factoryName();

System.out.println("total machines");
int machines = Txt.machineCount();
System.out.println(machines);

System.out.println("daily production");
float production = Txt.production();
System.out.println(production);

System.out.println("fabric types");
Txt.fabrics("Cotton","Silk","Wool");

System.out.println("order IDs");
Txt.orderIds(111L,222L,333L);

System.out.println("supervisor");
Txt.supervisor("Ajay");

System.out.println("working machines");
System.out.println(Txt.working(100,15));

System.out.println("fabric length");
System.out.println(Txt.length(2500.5));
}

static void factoryName(){
System.out.println("Royal Textiles");
}
static int machineCount(){
return 100;
}
static float production(){
return 450.5f;
}
static void fabrics(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void orderIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void supervisor(String name){
System.out.println(name);
}
static int working(int total,int repair){
return total-repair;
}
static double length(double value){
return value;
}
}