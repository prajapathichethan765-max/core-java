class Nwp{
public static void main(String[] args){

System.out.println("company name");
Nwp.companyName();

System.out.println("total reporters");
int reporters = Nwp.reporterCount();
System.out.println(reporters);

System.out.println("daily copies");
float copies = Nwp.copies();
System.out.println(copies);

System.out.println("newspaper names");
Nwp.names("Times","Daily News","Morning Star");

System.out.println("edition IDs");
Nwp.ids(111L,222L,333L);

System.out.println("editor");
Nwp.editor("Ajay");

System.out.println("active reporters");
System.out.println(Nwp.active(100,15));

System.out.println("paper weight");
System.out.println(Nwp.weight(45.5));
}

static void companyName(){
System.out.println("City News");
}
static int reporterCount(){
return 100;
}
static float copies(){
return 2500.5f;
}
static void names(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void editor(String name){
System.out.println(name);
}
static int active(int total,int absent){
return total-absent;
}
static double weight(double value){
return value;
}
}