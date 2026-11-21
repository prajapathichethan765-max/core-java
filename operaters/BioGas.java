class BioGas{
public static void main(String[] args){

System.out.println("plant name");
BioGas.plantName();

System.out.println("gas storage");
int storage = BioGas.gasStorage();
System.out.println(storage);

System.out.println("daily production");
float production = BioGas.dailyProduction();
System.out.println(production);

System.out.println("raw materials");
String a = "Cow Dung";
String b = "Food Waste";
String c = "Leaves";
BioGas.materials(a,b,c);

System.out.println("batch numbers");
long x = 456123L;
long y = 567234L;
long z = 678345L;
BioGas.batchNumbers(x,y,z);

System.out.println("operator");
String operator = "Manoj";
BioGas.operator(operator);

System.out.println("remaining storage");
int total = 9000;
int filled = 6000;
System.out.println(BioGas.remaining(total,filled));

System.out.println("gas purity");
double purity = 98.6;
System.out.println(BioGas.gasPurity(purity));

}

static void plantName(){
System.out.println("Eco BioGas Plant");
}

static int gasStorage(){
return 9000;
}

static float dailyProduction(){
return 3500.5f;
}

static void materials(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void batchNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void operator(String name){
System.out.println(name);
}

static int remaining(int total,int filled){
return total-filled;
}

static double gasPurity(double value){
return value;
}
}