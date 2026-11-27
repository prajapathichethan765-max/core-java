class Fct{
public static void main(String[] args){
System.out.println("factory name");
Fct.name();
System.out.println("machines");
System.out.println(Fct.machines());
System.out.println("production");
System.out.println(Fct.production());
Fct.products("Steel","Iron","Copper");
Fct.ids(101L,202L,303L);
Fct.manager("Ravi");
System.out.println(Fct.working(50,5));
System.out.println(Fct.weight(450.5));
}
static void name(){System.out.println("Metal Factory");}
static int machines(){return 50;}
static float production(){return 250.5f;}
static void products(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void manager(String n){System.out.println(n);}
static int working(int a,int b){return a-b;}
static double weight(double a){return a;}
}