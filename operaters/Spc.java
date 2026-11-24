class Spc{
public static void main(String[] args){

System.out.println("club name");
Spc.clubName();

System.out.println("total players");
int players = Spc.playerCount();
System.out.println(players);

System.out.println("daily practice hours");
float hours = Spc.practice();
System.out.println(hours);

System.out.println("sports");
Spc.sports("Cricket","Football","Tennis");

System.out.println("player IDs");
Spc.playerIds(111L,222L,333L);

System.out.println("coach");
Spc.coach("Ravi");

System.out.println("available players");
System.out.println(Spc.available(100,20));

System.out.println("ground area");
System.out.println(Spc.area(3500.5));
}

static void clubName(){
System.out.println("Victory Sports Club");
}
static int playerCount(){
return 100;
}
static float practice(){
return 4.5f;
}
static void sports(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void playerIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void coach(String name){
System.out.println(name);
}
static int available(int total,int injured){
return total-injured;
}
static double area(double value){
return value;
}
}