class Lib{
public static void main(String[] args){
Lib.name();
System.out.println(Lib.books());
System.out.println(Lib.cost());
Lib.types("Novel","Story","Science");
Lib.ids(111L,222L,333L);
Lib.librarian("Rohit");
System.out.println(Lib.remaining(500,50));
System.out.println(Lib.rating(4.5));
}
static void name(){System.out.println("Central Library");}
static int books(){return 500;}
static float cost(){return 550.5f;}
static void types(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void librarian(String n){System.out.println(n);}
static int remaining(int a,int b){return a-b;}
static double rating(double a){return a;}
}