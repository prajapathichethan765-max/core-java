class BusDepot{
public static void main(String[] args){

System.out.println("depot name");
BusDepot.depotName();

System.out.println("total buses");
int buses = BusDepot.busCount();
System.out.println(buses);

System.out.println("fuel expenses");
float expenses = BusDepot.fuelExpenses();
System.out.println(expenses);

System.out.println("bus routes");
String a = "Bangalore to Mysore";
String b = "Bangalore to Chennai";
String c = "Bangalore to Hubli";
BusDepot.routeDetails(a,b,c);

System.out.println("bus registration numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
BusDepot.registrationNumbers(x,y,z);

System.out.println("depot manager");
String manager = "Prakash";
BusDepot.managerDetails(manager);

System.out.println("available buses");
int total = 200;
int running = 150;
System.out.println(BusDepot.availableBuses(total,running));

System.out.println("depot rating");
double rating = 4.3;
System.out.println(BusDepot.depotRating(rating));

}

static void depotName(){
System.out.println("Majestic Bus Depot");
}

static int busCount(){
return 200;
}

static float fuelExpenses(){
return 450000.50f;
}

static void routeDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void registrationNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void managerDetails(String name){
System.out.println(name);
}

static int availableBuses(int total,int running){
if(total>=running){
return total-running;
}
else{
return 0;
}
}

static double depotRating(double value){
return value;
}
}