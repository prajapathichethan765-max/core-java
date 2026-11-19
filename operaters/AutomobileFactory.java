class AutomobileFactory{
public static void main(String[] args){

System.out.println("factory name");
AutomobileFactory.factoryName();

System.out.println("total machines");
int machines = AutomobileFactory.machineCount();
System.out.println(machines);

System.out.println("production cost");
float cost = AutomobileFactory.productionCost();
System.out.println(cost);

System.out.println("car models");
String a = "Swift";
String b = "Baleno";
String c = "Brezza";
AutomobileFactory.carModels(a,b,c);

System.out.println("vehicle codes");
long x = 123456L;
long y = 234567L;
long z = 345678L;
AutomobileFactory.vehicleCodes(x,y,z);

System.out.println("factory owner");
String owner = "Vijay";
AutomobileFactory.ownerDetails(owner);

System.out.println("remaining production");
int target = 1000;
int completed = 750;
System.out.println(AutomobileFactory.remainingProduction(target,completed));

System.out.println("factory rating");
double rating = 4.6;
System.out.println(AutomobileFactory.factoryRating(rating));

}

static void factoryName(){
System.out.println("Tata Motors Factory");
}

static int machineCount(){
return 250;
}

static float productionCost(){
return 750000.50f;
}

static void carModels(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void vehicleCodes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void ownerDetails(String name){
System.out.println(name);
}

static int remainingProduction(int target,int completed){
if(target>=completed){
return target-completed;
}
else{
return 0;
}
}

static double factoryRating(double value){
return value;
}
}