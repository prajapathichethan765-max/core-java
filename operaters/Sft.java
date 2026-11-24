class Sft{
public static void main(String[] args){

System.out.println("company name");
Sft.companyName();

System.out.println("total employees");
int employees = Sft.employeeCount();
System.out.println(employees);

System.out.println("daily working hours");
float hours = Sft.workingHours();
System.out.println(hours);

System.out.println("programming languages");
Sft.languages("Java","Python","C");

System.out.println("employee IDs");
Sft.employeeIds(111L,222L,333L);

System.out.println("team leader");
Sft.leader("Arun");

System.out.println("available employees");
System.out.println(Sft.available(500,50));

System.out.println("office area");
System.out.println(Sft.area(4500.5));
}

static void companyName(){
System.out.println("Tech Solutions");
}
static int employeeCount(){
return 500;
}
static float workingHours(){
return 8.5f;
}
static void languages(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void employeeIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void leader(String name){
System.out.println(name);
}
static int available(int total,int busy){
return total-busy;
}
static double area(double value){
return value;
}
}