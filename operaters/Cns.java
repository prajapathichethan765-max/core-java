class Cns{
public static void main(String[] args){

System.out.println("company name");
Cns.companyName();

System.out.println("total workers");
int workers = Cns.workerCount();
System.out.println(workers);

System.out.println("daily cement");
float cement = Cns.cement();
System.out.println(cement);

System.out.println("materials");
Cns.materials("Cement","Steel","Bricks");

System.out.println("project IDs");
Cns.projectIds(111L,222L,333L);

System.out.println("engineer");
Cns.engineer("Sanjay");

System.out.println("active workers");
System.out.println(Cns.active(300,25));

System.out.println("building height");
System.out.println(Cns.height(150.5));
}

static void companyName(){
System.out.println("Build Masters");
}
static int workerCount(){
return 300;
}
static float cement(){
return 500.5f;
}
static void materials(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void projectIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void engineer(String name){
System.out.println(name);
}
static int active(int total,int absent){
return total-absent;
}
static double height(double value){
return value;
}
}