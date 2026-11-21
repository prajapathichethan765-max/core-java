class EcoCity{
public static void main(String[] args){

System.out.println("city name");
EcoCity.cityName();

System.out.println("electric buses");
int buses = EcoCity.busCount();
System.out.println(buses);

System.out.println("daily savings");
float savings = EcoCity.dailySavings();
System.out.println(savings);

System.out.println("green projects");
String a = "Tree Planting";
String b = "Solar Roads";
String c = "Rainwater";
EcoCity.projects(a,b,c);

System.out.println("project numbers");
long x = 112244L;
long y = 223355L;
long z = 334466L;
EcoCity.projectNumbers(x,y,z);

System.out.println("city officer");
String officer = "Ramesh";
EcoCity.officer(officer);

System.out.println("remaining buses");
int total = 120;
int active = 90;
System.out.println(EcoCity.remaining(total,active));

System.out.println("green coverage");
double coverage = 78.5;
System.out.println(EcoCity.coverage(coverage));

}

static void cityName(){
System.out.println("Eco Smart City");
}

static int busCount(){
return 120;
}

static float dailySavings(){
return 4500.5f;
}

static void projects(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void projectNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void officer(String name){
System.out.println(name);
}

static int remaining(int total,int active){
return total-active;
}

static double coverage(double value){
return value;
}
}