class Bnk{
public static void main(String[] args){

System.out.println("bank name");
Bnk.bankName();

System.out.println("total branches");
int branches = Bnk.branchCount();
System.out.println(branches);

System.out.println("daily deposits");
float deposits = Bnk.deposit();
System.out.println(deposits);

System.out.println("account types");
Bnk.accounts("Savings","Current","Salary");

System.out.println("account numbers");
Bnk.accountIds(123L,456L,789L);

System.out.println("manager");
Bnk.manager("Suresh");

System.out.println("active accounts");
System.out.println(Bnk.active(1000,150));

System.out.println("interest rate");
System.out.println(Bnk.interest(7.5));
}

static void bankName(){
System.out.println("National Bank");
}
static int branchCount(){
return 150;
}
static float deposit(){
return 50000.5f;
}
static void accounts(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void accountIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void manager(String name){
System.out.println(name);
}
static int active(int total,int closed){
return total-closed;
}
static double interest(double value){
return value;
}
}