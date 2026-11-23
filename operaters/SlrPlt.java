class SlrPlt{
public static void main(String[] args){

System.out.println("plant name");
SlrPlt.plantName();

System.out.println("solar panels");
int panels = SlrPlt.panelCount();
System.out.println(panels);

System.out.println("daily power");
float power = SlrPlt.power();
System.out.println(power);

System.out.println("energy sources");
SlrPlt.sources("Solar","Wind","Hydro");

System.out.println("panel IDs");
SlrPlt.ids(111L,222L,333L);

System.out.println("technician");
SlrPlt.technician("Arun");

System.out.println("active panels");
System.out.println(SlrPlt.active(1000,100));

System.out.println("plant efficiency");
System.out.println(SlrPlt.efficiency(95.5));
}

static void plantName(){
System.out.println("Sun Power Plant");
}
static int panelCount(){
return 1000;
}
static float power(){
return 850.5f;
}
static void sources(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void technician(String name){
System.out.println(name);
}
static int active(int total,int damaged){
return total-damaged;
}
static double efficiency(double value){
return value;
}
}