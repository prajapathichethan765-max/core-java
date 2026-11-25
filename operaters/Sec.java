class Sec{
public static void main(String[] args){

System.out.println("company name");
Sec.companyName();

System.out.println("total guards");
int guards = Sec.guardCount();
System.out.println(guards);

System.out.println("daily duty hours");
float hours = Sec.dutyHours();
System.out.println(hours);

System.out.println("security types");
Sec.types("CCTV","Patrol","Gate");

System.out.println("guard IDs");
Sec.guardIds(111L,222L,333L);

System.out.println("supervisor");
Sec.supervisor("Praveen");

System.out.println("available guards");
System.out.println(Sec.available(200,25));

System.out.println("building height");
System.out.println(Sec.height(150.5));
}

static void companyName(){
System.out.println("Safe Guard Services");
}
static int guardCount(){
return 200;
}
static float dutyHours(){
return 8.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void guardIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void supervisor(String name){
System.out.println(name);
}
static int available(int total,int busy){
return total-busy;
}
static double height(double value){
return value;
}
}