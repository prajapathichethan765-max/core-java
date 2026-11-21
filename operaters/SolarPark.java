class SolarPark{
public static void main(String[] args){

System.out.println("park name");
SolarPark.parkName();

System.out.println("total panels");
int panels = SolarPark.panelCount();
System.out.println(panels);

System.out.println("power output");
float power = SolarPark.powerOutput();
System.out.println(power);

System.out.println("panel brands");
String a = "Tata";
String b = "Adani";
String c = "Waaree";
SolarPark.panelBrands(a,b,c);

System.out.println("plant codes");
long x = 123456L;
long y = 234567L;
long z = 345678L;
SolarPark.plantCodes(x,y,z);

System.out.println("manager");
String manager = "Rahul";
SolarPark.managerName(manager);

System.out.println("remaining panels");
int total = 4000;
int installed = 2500;
System.out.println(SolarPark.remaining(total,installed));

System.out.println("efficiency");
double efficiency = 95.5;
System.out.println(SolarPark.efficiency(efficiency));

}

static void parkName(){
System.out.println("Sunshine Solar Park");
}

static int panelCount(){
return 4000;
}

static float powerOutput(){
return 6500.5f;
}

static void panelBrands(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void plantCodes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void managerName(String name){
System.out.println(name);
}

static int remaining(int total,int installed){
return total-installed;
}

static double efficiency(double value){
return value;
}
}class SolarPark{
public static void main(String[] args){

System.out.println("park name");
SolarPark.parkName();

System.out.println("total panels");
int panels = SolarPark.panelCount();
System.out.println(panels);

System.out.println("power output");
float power = SolarPark.powerOutput();
System.out.println(power);

System.out.println("panel brands");
String a = "Tata";
String b = "Adani";
String c = "Waaree";
SolarPark.panelBrands(a,b,c);

System.out.println("plant codes");
long x = 123456L;
long y = 234567L;
long z = 345678L;
SolarPark.plantCodes(x,y,z);

System.out.println("manager");
String manager = "Rahul";
SolarPark.managerName(manager);

System.out.println("remaining panels");
int total = 4000;
int installed = 2500;
System.out.println(SolarPark.remaining(total,installed));

System.out.println("efficiency");
double efficiency = 95.5;
System.out.println(SolarPark.efficiency(efficiency));

}

static void parkName(){
System.out.println("Sunshine Solar Park");
}

static int panelCount(){
return 4000;
}

static float powerOutput(){
return 6500.5f;
}

static void panelBrands(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void plantCodes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void managerName(String name){
System.out.println(name);
}

static int remaining(int total,int installed){
return total-installed;
}

static double efficiency(double value){
return value;
}
}