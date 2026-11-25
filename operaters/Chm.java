class Chm{
public static void main(String[] args){

System.out.println("factory name");
Chm.factoryName();

System.out.println("total tanks");
int tanks = Chm.tankCount();
System.out.println(tanks);

System.out.println("daily production");
float production = Chm.production();
System.out.println(production);

System.out.println("chemical names");
Chm.chemicals("Oxygen","Hydrogen","Nitrogen");

System.out.println("chemical IDs");
Chm.chemicalIds(111L,222L,333L);

System.out.println("chemist");
Chm.chemist("Rohith");

System.out.println("active tanks");
System.out.println(Chm.active(100,15));

System.out.println("tank capacity");
System.out.println(Chm.capacity(2500.5));
}

static void factoryName(){
System.out.println("Nova Chemicals");
}
static int tankCount(){
return 100;
}
static float production(){
return 450.5f;
}
static void chemicals(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void chemicalIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void chemist(String name){
System.out.println(name);
}
static int active(int total,int damaged){
return total-damaged;
}
static double capacity(double value){
return value;
}
}