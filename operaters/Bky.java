class Bky{
public static void main(String[] args){

System.out.println("bakery name");
Bky.bakeryName();

System.out.println("total cakes");
int cakes = Bky.cakeCount();
System.out.println(cakes);

System.out.println("daily production");
float production = Bky.production();
System.out.println(production);

System.out.println("bakery items");
Bky.items("Cake","Bread","Biscuit");

System.out.println("item codes");
Bky.codes(111L,222L,333L);

System.out.println("baker");
Bky.baker("Suresh");

System.out.println("remaining cakes");
System.out.println(Bky.remaining(200,75));

System.out.println("shop rating");
System.out.println(Bky.rating(4.8));
}

static void bakeryName(){
System.out.println("Sweet Home Bakery");
}
static int cakeCount(){
return 200;
}
static float production(){
return 150.5f;
}
static void items(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void codes(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void baker(String name){
System.out.println(name);
}
static int remaining(int total,int sold){
return total-sold;
}
static double rating(double value){
return value;
}
}