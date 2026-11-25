class Acd{
public static void main(String[] args){

System.out.println("academy name");
Acd.academyName();

System.out.println("total students");
int students = Acd.studentCount();
System.out.println(students);

System.out.println("daily training");
float training = Acd.training();
System.out.println(training);

System.out.println("sports");
Acd.sports("Boxing","Swimming","Football");

System.out.println("student IDs");
Acd.studentIds(111L,222L,333L);

System.out.println("trainer");
Acd.trainer("Girish");

System.out.println("active students");
System.out.println(Acd.active(300,20));

System.out.println("ground size");
System.out.println(Acd.ground(2500.5));
}

static void academyName(){
System.out.println("Champion Academy");
}
static int studentCount(){
return 300;
}
static float training(){
return 5.5f;
}
static void sports(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void studentIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void trainer(String name){
System.out.println(name);
}
static int active(int total,int absent){
return total-absent;
}
static double ground(double value){
return value;
}
}