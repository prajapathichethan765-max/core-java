class Air{
public static void main(String[] args){
Air.name();
System.out.println(Air.flights());
System.out.println(Air.fuel());
Air.routes("Delhi","Mumbai","Chennai");
Air.ids(111L,222L,333L);
Air.pilot("Arun");
System.out.println(Air.ready(60,10));
System.out.println(Air.speed(850.5));
}
static void name(){System.out.println("Sky Airlines");}
static int flights(){return 60;}
static float fuel(){return 450.5f;}
static void routes(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void pilot(String n){System.out.println(n);}
static int ready(int a,int b){return a-b;}
static double speed(double a){return a;}
}