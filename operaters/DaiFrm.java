class DaiFrm{
public static void main(String[] args){

System.out.println("farm name");
DaiFrm.farmName();

System.out.println("total cows");
int cows = DaiFrm.cowCount();
System.out.println(cows);

System.out.println("daily milk");
float milk = DaiFrm.dailyMilk();
System.out.println(milk);

System.out.println("animal breeds");
String a = "Jersey";
String b = "Holstein";
String c = "Gir";
DaiFrm.breeds(a,b,c);

System.out.println("cow numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
DaiFrm.cowNumbers(x,y,z);

System.out.println("owner");
String owner = "Mahesh";
DaiFrm.owner(owner);

System.out.println("empty sheds");
int total = 60;
int occupied = 45;
System.out.println(DaiFrm.empty(total,occupied));

System.out.println("milk quality");
double quality = 97.5;
System.out.println(DaiFrm.quality(quality));
}

static void farmName(){
System.out.println("Green Dairy Farm");
}
static int cowCount(){
return 60;
}
static float dailyMilk(){
return 350.5f;
}
static void breeds(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void cowNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void owner(String name){
System.out.println(name);
}
static int empty(int total,int occupied){
return total-occupied;
}
static double quality(double value){
return value;
}
}