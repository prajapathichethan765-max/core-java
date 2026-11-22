class HotInn{
public static void main(String[] args){

System.out.println("hotel name");
HotInn.hotelName();

System.out.println("total rooms");
int rooms = HotInn.roomCount();
System.out.println(rooms);

System.out.println("daily income");
float income = HotInn.dailyIncome();
System.out.println(income);

System.out.println("food types");
String a = "Indian";
String b = "Chinese";
String c = "Italian";
HotInn.foodTypes(a,b,c);

System.out.println("room numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
HotInn.roomNumbers(x,y,z);

System.out.println("chef");
String chef = "Manoj";
HotInn.chef(chef);

System.out.println("vacant rooms");
int total = 80;
int occupied = 55;
System.out.println(HotInn.vacant(total,occupied));

System.out.println("customer satisfaction");
double rating = 95.5;
System.out.println(HotInn.satisfaction(rating));
}

static void hotelName(){
System.out.println("Royal Palace Hotel");
}
static int roomCount(){
return 80;
}
static float dailyIncome(){
return 45000.5f;
}
static void foodTypes(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void roomNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void chef(String name){
System.out.println(name);
}
static int vacant(int total,int occupied){
return total-occupied;
}
static double satisfaction(double value){
return value;
}
}