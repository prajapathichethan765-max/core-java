class Msm{
public static void main(String[] args){

System.out.println("museum name");
Msm.museumName();

System.out.println("total objects");
int objects = Msm.objectCount();
System.out.println(objects);

System.out.println("daily visitors");
float visitors = Msm.visitors();
System.out.println(visitors);

System.out.println("collections");
Msm.collections("Coins","Paintings","Sculptures");

System.out.println("object IDs");
Msm.ids(111L,222L,333L);

System.out.println("curator");
Msm.curator("Rakesh");

System.out.println("available objects");
System.out.println(Msm.available(500,50));

System.out.println("museum area");
System.out.println(Msm.area(3500.5));
}

static void museumName(){
System.out.println("History Museum");
}
static int objectCount(){
return 500;
}
static float visitors(){
return 250.5f;
}
static void collections(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void curator(String name){
System.out.println(name);
}
static int available(int total,int damaged){
return total-damaged;
}
static double area(double value){
return value;
}
}