class SolPrk{
public static void main(String[] args){

System.out.println("park name");
SolPrk.parkName();

System.out.println("solar panels");
int panels = SolPrk.panelCount();
System.out.println(panels);

System.out.println("power generation");
float power = SolPrk.power();
System.out.println(power);

System.out.println("energy sources");
String a = "Sunlight";
String b = "Wind";
String c = "Battery";
SolPrk.sources(a,b,c);

System.out.println("panel numbers");
long x = 1234567L;
long y = 2345678L;
long z = 3456789L;
SolPrk.panelNumbers(x,y,z);

System.out.println("engineer");
String engineer = "Arjun";
SolPrk.engineer(engineer);

System.out.println("unused panels");
int total = 100;
int active = 75;
System.out.println(SolPrk.unused(total,active));

System.out.println("efficiency");
double rate = 92.5;
System.out.println(SolPrk.efficiency(rate));
}

static void parkName(){
System.out.println("Green Solar Park");
}
static int panelCount(){
return 100;
}
static float power(){
return 5500.5f;
}
static void sources(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void panelNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void engineer(String name){
System.out.println(name);
}
static int unused(int total,int active){
return total-active;
}
static double efficiency(double value){
return value;
}
}