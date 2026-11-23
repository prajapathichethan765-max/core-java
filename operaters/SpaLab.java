class SpaLab{
public static void main(String[] args){

System.out.println("lab name");
SpaLab.labName();

System.out.println("total projects");
int projects = SpaLab.projectCount();
System.out.println(projects);

System.out.println("research hours");
float hours = SpaLab.researchHours();
System.out.println(hours);

System.out.println("research fields");
String a = "Astronomy";
String b = "Physics";
String c = "Robotics";
SpaLab.fields(a,b,c);

System.out.println("project codes");
long x = 987654L;
long y = 876543L;
long z = 765432L;
SpaLab.projectCodes(x,y,z);

System.out.println("scientist");
String scientist = "Kiran";
SpaLab.scientist(scientist);

System.out.println("pending projects");
int total = 40;
int completed = 25;
System.out.println(SpaLab.pending(total,completed));

System.out.println("success rate");
double rate = 89.5;
System.out.println(SpaLab.success(rate));
}

static void labName(){
System.out.println("National Space Lab");
}
static int projectCount(){
return 40;
}
static float researchHours(){
return 1200.5f;
}
static void fields(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void projectCodes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void scientist(String name){
System.out.println(name);
}
static int pending(int total,int completed){
return total-completed;
}
static double success(double value){
return value;
}
}