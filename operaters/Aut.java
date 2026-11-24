class Aut{
public static void main(String[] args){

System.out.println("company name");
Aut.companyName();

System.out.println("total cars");
int cars = Aut.carCount();
System.out.println(cars);

System.out.println("daily production");
float production = Aut.production();
System.out.println(production);

System.out.println("car models");
Aut.models("Swift","Baleno","Brezza");

System.out.println("car numbers");
Aut.carIds(111L,222L,333L);

System.out.println("engineer");
Aut.engineer("Rahul");

System.out.println("available cars");
System.out.println(Aut.available(500,100));

System.out.println("car weight");
System.out.println(Aut.weight(1200.5));
}

static void companyName(){
System.out.println("Speed Motors");
}
static int carCount(){
return 500;
}
static float production(){
return 75.5f;
}
static void models(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void carIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void engineer(String name){
System.out.println(name);
}
static int available(int total,int sold){
return total-sold;
}
static double weight(double value){
return value;
}
}