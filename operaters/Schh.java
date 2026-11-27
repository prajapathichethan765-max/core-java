class Sch{
public static void main(String[] args){
Sch.name();
System.out.println(Sch.students());
System.out.println(Sch.fees());
Sch.subjects("Java","Maths","Science");
Sch.ids(101L,102L,103L);
Sch.teacher("Ajay");
System.out.println(Sch.present(800,40));
System.out.println(Sch.grade(9.5));
}
static void name(){System.out.println("Bright School");}
static int students(){return 800;}
static float fees(){return 350.5f;}
static void subjects(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void ids(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void teacher(String n){System.out.println(n);}
static int present(int a,int b){return a-b;}
static double grade(double a){return a;}
}