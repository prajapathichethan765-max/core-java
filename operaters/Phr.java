class Phr{
public static void main(String[] args){

System.out.println("pharmacy name");
Phr.pharmacyName();

System.out.println("total medicines");
int medicines = Phr.medicineCount();
System.out.println(medicines);

System.out.println("daily sales");
float sales = Phr.sales();
System.out.println(sales);

System.out.println("medicine types");
Phr.types("Tablets","Syrup","Cream");

System.out.println("medicine IDs");
Phr.medicineIds(111L,222L,333L);

System.out.println("pharmacist");
Phr.pharmacist("Vikas");

System.out.println("available medicines");
System.out.println(Phr.available(500,100));

System.out.println("medicine weight");
System.out.println(Phr.weight(25.5));
}

static void pharmacyName(){
System.out.println("Health Pharmacy");
}
static int medicineCount(){
return 500;
}
static float sales(){
return 15000.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void medicineIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void pharmacist(String name){
System.out.println(name);
}
static int available(int total,int sold){
return total-sold;
}
static double weight(double value){
return value;
}
}