class GreenLab{
public static void main(String[] args){

System.out.println("lab name");
GreenLab.labName();

System.out.println("researchers");
int researchers = GreenLab.researcherCount();
System.out.println(researchers);

System.out.println("research budget");
float budget = GreenLab.researchBudget();
System.out.println(budget);

System.out.println("research topics");
String a = "Solar";
String b = "Wind";
String c = "Biogas";
GreenLab.topics(a,b,c);

System.out.println("project IDs");
long x = 1234567L;
long y = 2345678L;
long z = 3456789L;
GreenLab.projectIds(x,y,z);

System.out.println("head researcher");
String head = "Suresh";
GreenLab.headResearcher(head);

System.out.println("pending projects");
int total = 40;
int completed = 25;
System.out.println(GreenLab.pending(total,completed));

System.out.println("success rate");
double rate = 92.5;
System.out.println(GreenLab.successRate(rate));

}

static void labName(){
System.out.println("Green Future Research Lab");
}

static int researcherCount(){
return 35;
}

static float researchBudget(){
return 250000.5f;
}

static void topics(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void projectIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void headResearcher(String name){
System.out.println(name);
}

static int pending(int total,int completed){
return total-completed;
}

static double successRate(double value){
return value;
}
}