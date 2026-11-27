class Prk{
public static void main(String[] args){
Prk.name();
System.out.println(Prk.vehicles());
System.out.println(Prk.ticket());
Prk.rides("Wheel","Train","Swing");
Prk.ids(111L,222L,333L);
Prk.manager("Ramesh");
System.out.println(Prk.available(100,15));
System.out.println(Prk.height(50.5));
}
static void name(){System.out.println("Fun Park");}
static int vehicles(){return 100;}
static float ticket(){return 450.5f;}
static void rides(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void manager(String n){System.out.println(n);}
static int available(int a,int b){return a-b;}
static double height(double a){return a;}
}