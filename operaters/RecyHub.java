class RecyHub{
public static void main(String[] args){

System.out.println("hub name");
RecyHub.hubName();

System.out.println("recycling machines");
int machines = RecyHub.machineCount();
System.out.println(machines);

System.out.println("daily waste");
float waste = RecyHub.dailyWaste();
System.out.println(waste);

System.out.println("waste materials");
String a = "Plastic";
String b = "Paper";
String c = "Glass";
RecyHub.wasteTypes(a,b,c);

System.out.println("machine numbers");
long x = 4567891L;
long y = 5678912L;
long z = 6789123L;
RecyHub.machineNumbers(x,y,z);

System.out.println("supervisor");
String supervisor = "Karthik";
RecyHub.supervisor(supervisor);

System.out.println("unused machines");
int total = 80;
int active = 55;
System.out.println(RecyHub.unused(total,active));

System.out.println("recycling rate");
double rate = 87.5;
System.out.println(RecyHub.recyclingRate(rate));

}

static void hubName(){
System.out.println("Recycle Smart Hub");
}

static int machineCount(){
return 80;
}

static float dailyWaste(){
return 2500.5f;
}

static void wasteTypes(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void machineNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void supervisor(String name){
System.out.println(name);
}

static int unused(int total,int active){
return total-active;
}

static double recyclingRate(double value){
return value;
}
}