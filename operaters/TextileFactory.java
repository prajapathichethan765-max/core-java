class TextileFactory{
public static void main(String[] args){

System.out.println("factory name");
TextileFactory.factoryName();

System.out.println("total workers");
int workers = TextileFactory.workerCount();
System.out.println(workers);

System.out.println("monthly production cost");
float cost = TextileFactory.productionCost();
System.out.println(cost);

System.out.println("fabric types");
String a = "Cotton";
String b = "Silk";
String c = "Wool";
TextileFactory.fabricDetails(a,b,c);

System.out.println("order numbers");
long x = 123456L;
long y = 234567L;
long z = 345678L;
TextileFactory.orderNumbers(x,y,z);

System.out.println("factory supervisor");
String supervisor = "Manjunath";
TextileFactory.supervisorDetails(supervisor);

System.out.println("remaining orders");
int total = 2000;
int completed = 1500;
System.out.println(TextileFactory.remainingOrders(total,completed));

System.out.println("factory rating");
double rating = 4.6;
System.out.println(TextileFactory.factoryRating(rating));

}

static void factoryName(){
System.out.println("Karnataka Textile Factory");
}

static int workerCount(){
return 500;
}

static float productionCost(){
return 350000.75f;
}

static void fabricDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void orderNumbers(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void supervisorDetails(String name){
System.out.println(name);
}

static int remainingOrders(int total,int completed){
if(total>=completed){
return total-completed;
}
else{
return 0;
}
}

static double factoryRating(double value){
return value;
}
}