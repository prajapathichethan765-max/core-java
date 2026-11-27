class Txt{
public static void main(String[] args){
Txt.name();
System.out.println(Txt.workers());
System.out.println(Txt.cost());
Txt.materials("Cotton","Silk","Wool");
Txt.ids(111L,222L,333L);
Txt.manager("Naveen");
System.out.println(Txt.active(200,20));
System.out.println(Txt.quality(95.5));
}
static void name(){System.out.println("Fashion Textiles");}
static int workers(){return 200;}
static float cost(){return 650.5f;}
static void materials(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void manager(String n){System.out.println(n);}
static int active(int a,int b){return a-b;}
static double quality(double a){return a;}
}