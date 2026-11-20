class SpaceResearchCenter{
public static void main(String[] args){

System.out.println("research center name");
SpaceResearchCenter.centerName();

System.out.println("total scientists");
int scientists = SpaceResearchCenter.scientistCount();
System.out.println(scientists);

System.out.println("annual budget");
double budget = SpaceResearchCenter.annualBudget();
System.out.println(budget);

System.out.println("research areas");
String a = "Mars";
String b = "Moon";
String c = "Jupiter";
SpaceResearchCenter.researchAreas(a,b,c);

System.out.println("mission codes");
long x = 456789L;
long y = 567891L;
long z = 678912L;
SpaceResearchCenter.missionCodes(x,y,z);

System.out.println("chief scientist");
String scientist = "Raghav";
SpaceResearchCenter.chiefScientist(scientist);

System.out.println("pending missions");
int total = 25;
int completed = 18;
System.out.println(SpaceResearchCenter.pendingMissions(total,completed));

System.out.println("success rate");
float rate = 92.5f;
System.out.println(SpaceResearchCenter.successRate(rate));

}

static void centerName(){
System.out.println("Indian Space Research Center");
}

static int scientistCount(){
return 350;
}

static double annualBudget(){
return 85000000.75;
}

static void researchAreas(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void missionCodes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void chiefScientist(String name){
System.out.println(name);
}

static int pendingMissions(int total,int completed){
return total-completed;
}

static float successRate(float value){
return value;
}
}