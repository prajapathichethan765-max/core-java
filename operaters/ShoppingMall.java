class ShoppingMall{
public static void main(String[] args){

System.out.println("mall name");
ShoppingMall.mallName();

System.out.println("number of floors");
int floors = ShoppingMall.floorCount();
System.out.println(floors);

System.out.println("electricity bill");
float bill = ShoppingMall.electricityBill();
System.out.println(bill);

System.out.println("available shops");
String shop1 = "Reliance";
String shop2 = "Max";
String shop3 = "Puma";
ShoppingMall.shopDetails(shop1,shop2,shop3);

System.out.println("shop registration numbers");
long id1 = 123456L;
long id2 = 234567L;
long id3 = 345678L;
ShoppingMall.shopIds(id1,id2,id3);

System.out.println("mall manager");
String manager = "Kiran";
ShoppingMall.managerName(manager);

System.out.println("available parking slots");
int total = 1000;
int used = 650;
System.out.println(ShoppingMall.parkingAvailability(total,used));

System.out.println("mall rating");
double rating = 4.5;
System.out.println(ShoppingMall.mallRating(rating));

}

static void mallName(){
System.out.println("Orion Mall");
}

static int floorCount(){
return 8;
}

static float electricityBill(){
return 75000.50f;
}

static void shopDetails(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void shopIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

static void managerName(String name){
System.out.println(name);
}

static int parkingAvailability(int total,int used){
if(total>=used){
return total-used;
}
else{
return 0;
}
}

static double mallRating(double value){
return value;
}
}