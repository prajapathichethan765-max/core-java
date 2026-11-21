class WindFarm{
public static void main(String[] args){

System.out.println("farm name");
WindFarm.farmName();

System.out.println("wind turbines");
int turbines = WindFarm.turbineCount();
System.out.println(turbines);

System.out.println("wind speed");
float speed = WindFarm.windSpeed();
System.out.println(speed);

System.out.println("turbine models");
String a = "Vestas";
String b = "Siemens";
String c = "Suzlon";
WindFarm.models(a,b,c);

System.out.println("turbine numbers");
long x = 567891L;
long y = 678912L;
long z = 789123L;
WindFarm.turbineNumbers(x,y,z);

System.out.println("supervisor");
String supervisor = "Kiran";
WindFarm.supervisorName(supervisor);

System.out.println("available turbines");
int total = 100;
int working = 75;
System.out.println(WindFarm.available(total,working));

System.out.println("land area");
double area = 250.75;
System.out.println(WindFarm.landArea(area));

}

static void farmName(){
System.out.println("Blue Sky Wind Farm");
}

static int turbineCount(){
return 100;
}

static float windSpeed(){
return 45.5f;
}

static void models(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void turbineNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void supervisorName(String name){
System.out.println(name);
}

static int available(int total,int working){
return total-working;
}

static double landArea(double value){
return value;
}
}