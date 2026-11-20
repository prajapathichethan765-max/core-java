class AutomobileWorkshop{
public static void main(String[] args){

System.out.println("workshop name");
AutomobileWorkshop.workshopName();

System.out.println("total mechanics");
int mechanics = AutomobileWorkshop.mechanicCount();
System.out.println(mechanics);

System.out.println("service charge");
float charge = AutomobileWorkshop.serviceCharge();
System.out.println(charge);

System.out.println("vehicle brands");
String a = "BMW";
String b = "Audi";
String c = "Mercedes";
AutomobileWorkshop.vehicleBrands(a,b,c);

System.out.println("service receipt numbers");
long x = 789123L;
long y = 891234L;
long z = 912345L;
AutomobileWorkshop.receiptNumbers(x,y,z);

System.out.println("workshop owner");
String owner = "Suresh";
AutomobileWorkshop.ownerDetails(owner);

System.out.println("pending vehicles");
int total = 120;
int serviced = 85;
System.out.println(AutomobileWorkshop.pendingVehicles(total,serviced));

System.out.println("customer satisfaction");
double satisfaction = 4.7;
System.out.println(AutomobileWorkshop.customerRating(satisfaction));

}

static void workshopName(){
System.out.println("Royal Automobile Workshop");
}

static int mechanicCount(){
return 45;
}

static float serviceCharge(){
return 2500.50f;
}

static void vehicleBrands(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void receiptNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void ownerDetails(String name){
System.out.println(name);
}

static int pendingVehicles(int total,int serviced){
return total-serviced;
}

static double customerRating(double value){
return value;
}
}