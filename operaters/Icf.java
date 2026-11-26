class Icf{
public static void main(String[] args){

System.out.println("factory name");
Icf.factoryName();

System.out.println("total machines");
int machines = Icf.machineCount();
System.out.println(machines);

System.out.println("daily ice");
float ice = Icf.iceProduction();
System.out.println(ice);

System.out.println("ice types");
Icf.types("Cube","Block","Crushed");

System.out.println("machine IDs");
Icf.ids(111L,222L,333L);

System.out.println("worker");
Icf.worker("Manu");

System.out.println("working machines");
System.out.println(Icf.working(50,10));

System.out.println("ice temperature");
System.out.println(Icf.temperature(-5.5));
}

static void factoryName(){
System.out.println("Cool Ice Factory");
}
static int machineCount(){
return 50;
}
static float iceProduction(){
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
static void worker(String name){
System.out.println(name);
}
static int working(int total,int damaged){
return total-damaged;
}
static double temperature(double value){
return value;
}
}