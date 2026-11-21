class AquaSys{
public static void main(String[] args){

System.out.println("system name");
AquaSys.systemName();

System.out.println("water filters");
int filters = AquaSys.filterCount();
System.out.println(filters);

System.out.println("water flow");
float flow = AquaSys.waterFlow();
System.out.println(flow);

System.out.println("filter types");
String a = "Carbon";
String b = "Ceramic";
String c = "RO";
AquaSys.filterTypes(a,b,c);

System.out.println("filter IDs");
long x = 111222L;
long y = 222333L;
long z = 333444L;
AquaSys.filterIds(x,y,z);

System.out.println("operator");
String operator = "Ajay";
AquaSys.operator(operator);

System.out.println("unused filters");
int total = 200;
int used = 125;
System.out.println(AquaSys.unused(total,used));

System.out.println("water quality");
double quality = 99.2;
System.out.println(AquaSys.quality(quality));

}

static void systemName(){
System.out.println("Aqua Clean System");
}

static int filterCount(){
return 200;
}

static float waterFlow(){
return 75.5f;
}

static void filterTypes(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void filterIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void operator(String name){
System.out.println(name);
}

static int unused(int total,int used){
return total-used;
}

static double quality(double value){
return value;
}
}