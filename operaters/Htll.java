class Htl{
public static void main(String[] args){
Htl.name();
System.out.println(Htl.rooms());
System.out.println(Htl.price());
Htl.food("Pizza","Burger","Pasta");
Htl.ids(11L,22L,33L);
Htl.manager("Rahul");
System.out.println(Htl.free(100,20));
System.out.println(Htl.rating(4.8));
}
static void name(){System.out.println("Royal Hotel");}
static int rooms(){return 100;}
static float price(){return 250.5f;}
static void food(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void manager(String n){System.out.println(n);}
static int free(int a,int b){return a-b;}
static double rating(double a){return a;}
}