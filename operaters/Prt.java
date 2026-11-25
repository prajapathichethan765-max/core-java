class Prt{
public static void main(String[] args){

System.out.println("company name");
Prt.companyName();

System.out.println("total printers");
int printers = Prt.printerCount();
System.out.println(printers);

System.out.println("daily pages");
float pages = Prt.pages();
System.out.println(pages);

System.out.println("print types");
Prt.types("Color","Black","Duplex");

System.out.println("printer IDs");
Prt.printerIds(111L,222L,333L);

System.out.println("technician");
Prt.technician("Naveen");

System.out.println("working printers");
System.out.println(Prt.working(100,15));

System.out.println("paper weight");
System.out.println(Prt.weight(80.5));
}

static void companyName(){
System.out.println("Quick Prints");
}
static int printerCount(){
return 100;
}
static float pages(){
return 5000.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void printerIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void technician(String name){
System.out.println(name);
}
static int working(int total,int repair){
return total-repair;
}
static double weight(double value){
return value;
}
}