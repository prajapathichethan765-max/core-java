class FarmBot{
public static void main(String[] args){

System.out.println("robot name");
FarmBot.robotName();

System.out.println("robot count");
int robots = FarmBot.robotCount();
System.out.println(robots);

System.out.println("battery voltage");
float voltage = FarmBot.batteryVoltage();
System.out.println(voltage);

System.out.println("robot functions");
String a = "Seeding";
String b = "Watering";
String c = "Harvesting";
FarmBot.functions(a,b,c);

System.out.println("robot numbers");
long x = 765432L;
long y = 876543L;
long z = 987654L;
FarmBot.robotNumbers(x,y,z);

System.out.println("technician");
String technician = "Naveen";
FarmBot.technician(technician);

System.out.println("idle robots");
int total = 60;
int working = 45;
System.out.println(FarmBot.idle(total,working));

System.out.println("field area");
double area = 125.75;
System.out.println(FarmBot.fieldArea(area));

}

static void robotName(){
System.out.println("Smart Farm Robot");
}

static int robotCount(){
return 60;
}

static float batteryVoltage(){
return 24.5f;
}

static void functions(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void robotNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void technician(String name){
System.out.println(name);
}

static int idle(int total,int working){
return total-working;
}

static double fieldArea(double value){
return value;
}
}