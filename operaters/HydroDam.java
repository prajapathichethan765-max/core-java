class HydroDam{
public static void main(String[] args){

System.out.println("dam name");
HydroDam.damName();

System.out.println("water capacity");
int capacity = HydroDam.waterCapacity();
System.out.println(capacity);

System.out.println("water pressure");
float pressure = HydroDam.waterPressure();
System.out.println(pressure);

System.out.println("water sources");
String a = "River";
String b = "Lake";
String c = "Rain";
HydroDam.waterSources(a,b,c);

System.out.println("dam codes");
long x = 112233L;
long y = 223344L;
long z = 334455L;
HydroDam.damCodes(x,y,z);

System.out.println("dam engineer");
String engineer = "Vijay";
HydroDam.engineer(engineer);

System.out.println("remaining capacity");
int total = 8000;
int filled = 5500;
System.out.println(HydroDam.remaining(total,filled));

System.out.println("dam height");
double height = 125.8;
System.out.println(HydroDam.damHeight(height));

}

static void damName(){
System.out.println("Krishna Hydro Dam");
}

static int waterCapacity(){
return 8000;
}

static float waterPressure(){
return 65.5f;
}

static void waterSources(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void damCodes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void engineer(String name){
System.out.println(name);
}

static int remaining(int total,int filled){
return total-filled;
}

static double damHeight(double value){
return value;
}
}