class CarShw{
public static void main(String[] args){

System.out.println("showroom name");
CarShw.showroomName();

System.out.println("total cars");
int cars = CarShw.carCount();
System.out.println(cars);

System.out.println("monthly sales");
float sales = CarShw.monthlySales();
System.out.println(sales);

System.out.println("car brands");
String a = "BMW";
String b = "Audi";
String c = "Toyota";
CarShw.brands(a,b,c);

System.out.println("car numbers");
long x = 456789L;
long y = 567891L;
long z = 678912L;
CarShw.carNumbers(x,y,z);

System.out.println("sales manager");
String manager = "Ajay";
CarShw.manager(manager);

System.out.println("unsold cars");
int total = 100;
int sold = 70;
System.out.println(CarShw.unsold(total,sold));

System.out.println("customer rating");
double rating = 4.8;
System.out.println(CarShw.rating(rating));
}

static void showroomName(){
System.out.println("Royal Car Showroom");
}
static int carCount(){
return 100;
}
static float monthlySales(){
return 850000.5f;
}
static void brands(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void carNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void manager(String name){
System.out.println(name);
}
static int unsold(int total,int sold){
return total-sold;
}
static double rating(double value){
return value;
}
}