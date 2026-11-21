class EVHub{
public static void main(String[] args){

System.out.println("hub name");
EVHub.hubName();

System.out.println("charging stations");
int stations = EVHub.stationCount();
System.out.println(stations);

System.out.println("charging speed");
float speed = EVHub.chargingSpeed();
System.out.println(speed);

System.out.println("vehicle brands");
String a = "Tesla";
String b = "Tata";
String c = "Mahindra";
EVHub.vehicleBrands(a,b,c);

System.out.println("station IDs");
long x = 123789L;
long y = 234891L;
long z = 345912L;
EVHub.stationIds(x,y,z);

System.out.println("technician");
String technician = "Arun";
EVHub.technician(technician);

System.out.println("free stations");
int total = 50;
int occupied = 32;
System.out.println(EVHub.freeStations(total,occupied));

System.out.println("battery capacity");
double battery = 85.5;
System.out.println(EVHub.batteryCapacity(battery));

}

static void hubName(){
System.out.println("Smart EV Charging Hub");
}

static int stationCount(){
return 50;
}

static float chargingSpeed(){
return 120.5f;
}

static void vehicleBrands(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void stationIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void technician(String name){
System.out.println(name);
}

static int freeStations(int total,int occupied){
return total-occupied;
}

static double batteryCapacity(double value){
return value;
}
}