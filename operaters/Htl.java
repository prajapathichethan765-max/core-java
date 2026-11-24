class Htl{
public static void main(String[] args){

System.out.println("hotel name");
Htl.hotelName();

System.out.println("total rooms");
int rooms = Htl.roomCount();
System.out.println(rooms);

System.out.println("daily income");
float income = Htl.dailyIncome();
System.out.println(income);

System.out.println("room types");
Htl.roomTypes("Single","Double","Suite");

System.out.println("booking IDs");
Htl.bookingIds(111L,222L,333L);

System.out.println("manager");
Htl.manager("Arun");

System.out.println("available rooms");
System.out.println(Htl.available(100,40));

System.out.println("hotel rating");
System.out.println(Htl.rating(4.5));
}

static void hotelName(){
System.out.println("Grand Palace");
}
static int roomCount(){
return 100;
}
static float dailyIncome(){
return 25000.5f;
}
static void roomTypes(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void bookingIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void manager(String name){
System.out.println(name);
}
static int available(int total,int busy){
return total-busy;
}
static double rating(double value){
return value;
}
}