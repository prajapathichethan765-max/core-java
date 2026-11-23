class CrkAcd{
public static void main(String[] args){

System.out.println("academy name");
CrkAcd.academyName();

System.out.println("total players");
int players = CrkAcd.playerCount();
System.out.println(players);

System.out.println("daily practice hours");
float hours = CrkAcd.practice();
System.out.println(hours);

System.out.println("player names");
CrkAcd.players("Rohit","Virat","Dhoni");

System.out.println("jersey numbers");
CrkAcd.jersey(18L,45L,7L);

System.out.println("coach");
CrkAcd.coach("Rahul");

System.out.println("available players");
System.out.println(CrkAcd.available(60,45));

System.out.println("ground area");
System.out.println(CrkAcd.area(2500.5));
}

static void academyName(){
System.out.println("Champions Cricket Academy");
}
static int playerCount(){
return 60;
}
static float practice(){
return 4.5f;
}
static void players(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void jersey(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void coach(String name){
System.out.println(name);
}
static int available(int total,int present){
return total-present;
}
static double area(double value){
return value;
}
}