class Pwr{
public static void main(String[] args){

System.out.println("plant name");
Pwr.plantName();

System.out.println("total generators");
int generators = Pwr.generatorCount();
System.out.println(generators);

System.out.println("daily output");
float output = Pwr.output();
System.out.println(output);

System.out.println("fuel types");
Pwr.fuels("Coal","Diesel","Gas");

System.out.println("generator IDs");
Pwr.generatorIds(111L,222L,333L);

System.out.println("engineer");
Pwr.engineer("Harish");

System.out.println("working generators");
System.out.println(Pwr.working(100,20));

System.out.println("voltage");
System.out.println(Pwr.voltage(220.5));
}

static void plantName(){
System.out.println("National Power");
}
static int generatorCount(){
return 100;
}
static float output(){
return 850.5f;
}
static void fuels(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void generatorIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void engineer(String name){
System.out.println(name);
}
static int working(int total,int repair){
return total-repair;
}
static double voltage(double value){
return value;
}
}