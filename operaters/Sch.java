class Sch{
public static void main(String[] args){

System.out.println("school name");
Sch.schoolName();

System.out.println("total students");
int students = Sch.studentCount();
System.out.println(students);

System.out.println("daily fee");
float fee = Sch.dailyFee();
System.out.println(fee);

System.out.println("subjects");
Sch.subjects("Java","Maths","Science");

System.out.println("student IDs");
Sch.studentIds(101L,202L,303L);

System.out.println("principal");
Sch.principal("Ramesh");

System.out.println("present students");
System.out.println(Sch.present(500,50));

System.out.println("school area");
System.out.println(Sch.area(2500.5));
}

static void schoolName(){
System.out.println("Bright School");
}
static int studentCount(){
return 500;
}
static float dailyFee(){
return 1500.5f;
}
static void subjects(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void studentIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void principal(String name){
System.out.println(name);
}
static int present(int total,int absent){
return total-absent;
}
static double area(double value){
return value;
}
}