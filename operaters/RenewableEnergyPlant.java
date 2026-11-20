class RenewableEnergyPlant{
public static void main(String[] args){

System.out.println("plant name");
RenewableEnergyPlant.plantName();

System.out.println("total solar panels");
int panels = RenewableEnergyPlant.panelCount();
System.out.println(panels);

System.out.println("daily power generation");
float power = RenewableEnergyPlant.powerGeneration();
System.out.println(power);

System.out.println("energy sources");
String a = "Solar";
String b = "Wind";
String c = "Hydro";
RenewableEnergyPlant.energySources(a,b,c);

System.out.println("plant registration numbers");
long x = 345678L;
long y = 456789L;
long z = 567891L;
RenewableEnergyPlant.registrationNumbers(x,y,z);

System.out.println("plant engineer");
String engineer = "Arun";
RenewableEnergyPlant.engineerDetails(engineer);

System.out.println("remaining installation panels");
int total = 5000;
int installed = 3750;
System.out.println(RenewableEnergyPlant.remainingPanels(total,installed));

System.out.println("plant efficiency");
double efficiency = 96.8;
System.out.println(RenewableEnergyPlant.plantEfficiency(efficiency));

}

static void plantName(){
System.out.println("Green Energy Power Plant");
}

static int panelCount(){
return 5000;
}

static float powerGeneration(){
return 7500.5f;
}

static void energySources(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void registrationNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void engineerDetails(String name){
System.out.println(name);
}

static int remainingPanels(int total,int installed){
return total-installed;
}

static double plantEfficiency(double value){
return value;
}
}