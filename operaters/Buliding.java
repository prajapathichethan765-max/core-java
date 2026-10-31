class Buliding{
public static void main(String[] args){
System.out.println("name of the bulding");
Buliding.nameOfbuliding();

System.out.println("for what persose the bulding is built");
Buliding.useOfBulding();

System.out.println("size of the site");
float size = Buliding.sizeOfSite();
System.out.println(size);

System.out.println(" rent owenr get from building  ");
long rent = Buliding.rent();
System.out.println(rent);

System.out.println("material used in the bulding");
String m1 = "cement";
String m2 = "road";
String m3 = "bricks";
Buliding.materialUsed(m1 ,m2 , m3);

System.out.println("price of the materials");
String mp1 = 1200 ;
String mp2 = 1000;
String mp3 = 1500;
Buliding.materialPrice(mp1 ,mp2 , mp3);

System.out.println("name of the contracter");
Buliding.contracterName(name);
name = "mohan";

System.out.println("check the quality of the material and price of block , cement ");
int priceOfBlock = 300;
int priceOfCement = 250;
int prices = Buliding.checkmaterialquality(priceOfBlock , priceOfCement);
System.out.println(prices);

System.out.println("what is the color of the building");
String colorOfBuilding = "gray and yellow";
String coloroFBulding = Buliding.colorOfTheBuilding(coloroFBulding);



}
static void nameOfbuliding(){
System.out.println("bdk complex");
}
static void useOfBulding(){
System.out.println("hotel");
}
static float sizeOfSite(){
float size = 123.4f;
return size;
}

static long rent(){
long rentOfHotel = 200000;
return rentOfHotel;
}
static void materialUsed(String material1 , String material2 , String material3){
System.out.println(material1);
System.out.println(material2);
System.out.println(material3);
}
static void materialPrice(int material1 , int material2 , int material3){
System.out.println(material1);
System.out.println(material2);
System.out.println(material3);
}
static void contracterName(String name){
System.out.println(name);
}
static int checkmaterialquality(int blockPrice , int cementPrice){
System.out.println(blockPrice);
System.out.println(cementPrice);

if(blockPrice == 300 && cementPrice == 250){
return "yes the block price is good and quality is good";
}
else{
return "no block price is more and quality is less";
}
}

static String colorOfTheBuilding(String color){
return color;
}
}








