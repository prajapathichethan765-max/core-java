class Bnk{
public static void main(String[] args){
Bnk.name();
System.out.println(Bnk.accounts());
System.out.println(Bnk.balance());
Bnk.services("Loan","Deposit","ATM");
Bnk.codes(111L,222L,333L);
Bnk.manager("Kiran");
System.out.println(Bnk.active(500,50));
System.out.println(Bnk.rate(4.2));
}
static void name(){System.out.println("Smart Bank");}
static int accounts(){return 500;}
static float balance(){return 750.5f;}
static void services(String a,String b,String c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void codes(long a,long b,long c){
System.out.println(a);System.out.println(b);System.out.println(c);}
static void manager(String n){System.out.println(n);}
static int active(int a,int b){return a-b;}
static double rate(double a){return a;}
}