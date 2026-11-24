class Rly{
public static void main(String[] args){

System.out.println("station name");
Rly.stationName();

System.out.println("total trains");
int trains = Rly.trainCount();
System.out.println(trains);

System.out.println("daily passengers");
float passengers = Rly.passengers();
System.out.println(passengers);

System.out.println("train names");
Rly.trainNames("Express","Rajdhani","Shatabdi");

System.out.println("train numbers");
Rly.trainNumbers(123L,456L,789L);

System.out.println("station master");
Rly.master("Kiran");

System.out.println("available platforms");
System.out.println(Rly.platforms(20,5));

System.out.println("track length");
System.out.println(Rly.track(1500.5));
}

static void stationName(){
System.out.println("Central Railway");
}
static int trainCount(){
return 80;
}
static float passengers(){
return 5000.5f;
}
static void trainNames(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void trainNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void master(String name){
System.out.println(name);
}
static int platforms(int total,int busy){
return total-busy;
}
static double track(double value){
return value;
}
}