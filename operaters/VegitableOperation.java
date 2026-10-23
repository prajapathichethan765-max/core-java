class VegitableOperation{
public static void main(String[] operation){
System.out.println(operation[0]);
System.out.println(operation[1]);
System.out.println(operation[2]);
System.out.println(operation[3]);
System.out.println(operation[4]);

long onion = 8732;
long tamato = 32823;
long bottelGuard = 8273;
long cucumbar = 7000;

if(tamato>=bottelGuard || bottelGuard>cucumbar){
System.out.println("loction of the shop");
VegitableOperation.addressOfShop();
}
else if(bottelGuard==onion && bottelGuard>=cucumbar){
System.out.println("price of the mango and address Of Shop");
float price  = VegitableOperation.priceOfMango();
System.out.println(price);
VegitableOperation.addressOfShop();

}
else if (onion== tamato || cucumbar<bottelGuard){
System.out.println("what is  the price of tamato and bottelGuard , address , price of mango");
VegitableOperation.tamatoBottelGuardPrice(120 , 400);
VegitableOperation.addressOfShop();

}

else if(bottelGuard> cucumbar && onion<tamato){
System.out.println("add the price of tamato , bottelGuard , onion , cucumbar and address , priceOfMango , tamato , bottelGuard price");
int sum = VegitableOperation.addition( 120 , 100 , 154, 366);
System.out.println(sum);
VegitableOperation.addressOfShop();
System.out.println(priceOfMango());
VegitableOperation.tamatoBottelGuardPrice(120 , 400);

}
}

static void addressOfShop(){
System.out.println("yelahanka");
}
static float priceOfMango(){
float price = 300.4f;
return price;
}
static void tamatoBottelGuardPrice(int a , int b){
System.out.println("price of tamato="+a);
System.out.println("price of bottelGuard="+b);
}
static int addition(int a , int b , int c, int d){
int add = a+b+c+d;
return add;
}
}





