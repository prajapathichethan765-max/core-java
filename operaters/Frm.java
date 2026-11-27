class Frm{
public static void main(String[] args){
Frm.name();
System.out.println(Frm.cows());
System.out.println(Frm.milk());
Frm.animals("Cow","Goat","Buffalo");
Frm.ids(111L,222L,333L);
Frm.owner("Mahesh");
System.out.println(Frm.healthy(100,10));
System.out.println(Frm.weight(350.5));
}
static void name(){System.out.println("Happy Farm");}
static int cows(){return 100;}
static float milk(){return 250.5f;}
static void animals(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void owner(String n){System.out.println(n);}
static int healthy(int a,int b){return a-b;}
static double weight(double a){return a;}
}