class Hsp{
public static void main(String[] args){
Hsp.name();
System.out.println(Hsp.rooms());
System.out.println(Hsp.budget());
Hsp.departments("Heart","Brain","Bone");
Hsp.ids(11L,22L,33L);
Hsp.doctor("Manoj");
System.out.println(Hsp.available(200,30));
System.out.println(Hsp.rating(4.5));
}
static void name(){System.out.println("City Hospital");}
static int rooms(){return 200;}
static float budget(){return 550.5f;}
static void departments(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void doctor(String n){System.out.println(n);}
static int available(int a,int b){return a-b;}
static double rating(double a){return a;}
}