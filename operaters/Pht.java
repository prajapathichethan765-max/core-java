class Pht{
public static void main(String[] args){

System.out.println("studio name");
Pht.studioName();

System.out.println("total cameras");
int cameras = Pht.cameraCount();
System.out.println(cameras);

System.out.println("daily photos");
float photos = Pht.photos();
System.out.println(photos);

System.out.println("photo types");
Pht.types("Wedding","Portrait","Nature");

System.out.println("camera IDs");
Pht.ids(111L,222L,333L);

System.out.println("photographer");
Pht.photographer("Sanjay");

System.out.println("available cameras");
System.out.println(Pht.available(50,10));

System.out.println("lens size");
System.out.println(Pht.lens(85.5));
}

static void studioName(){
System.out.println("Pixel Studio");
}
static int cameraCount(){
return 50;
}
static float photos(){
return 250.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void ids(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void photographer(String name){
System.out.println(name);
}
static int available(int total,int busy){
return total-busy;
}
static double lens(double value){
return value;
}
}