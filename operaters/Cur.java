class Cur{
public static void main(String[] args){

System.out.println("service name");
Cur.serviceName();

System.out.println("total parcels");
int parcels = Cur.parcelCount();
System.out.println(parcels);

System.out.println("daily delivery");
float delivery = Cur.delivery();
System.out.println(delivery);

System.out.println("parcel types");
Cur.types("Documents","Clothes","Electronics");

System.out.println("tracking IDs");
Cur.trackingIds(111L,222L,333L);

System.out.println("delivery agent");
Cur.agent("Suraj");

System.out.println("pending parcels");
System.out.println(Cur.pending(500,150));

System.out.println("parcel weight");
System.out.println(Cur.weight(5.5));
}

static void serviceName(){
System.out.println("Fast Courier");
}
static int parcelCount(){
return 500;
}
static float delivery(){
return 350.5f;
}
static void types(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void trackingIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void agent(String name){
System.out.println(name);
}
static int pending(int total,int delivered){
return total-delivered;
}
static double weight(double value){
return value;
}
}