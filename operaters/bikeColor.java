class Bicycle{
public static void main(String[] args){

System.out.println("what is the color of the bike");
Bicycle.bikeColor();

System.out.println("name of the bike");
Bicycle.nameOfBike();

System.out.println("check wheather the price is under 400000");
String bikePrice = Bicycle.priceOfBike();
System.out.println(bikePrice);

System.out.println("check bike is avilable in showroom");
String bikeIsThere = Bicycle.isAvilable();
System.out.println(bikeIsThere);

System.out.println("what is the engine power");
int engineCC = 350;
Bicycle.enginePower(engineCC);

System.out.println(" waranty , top Speed ");
int waranty = 2;
int speed = 120;
Bicycle.warantyAndSpeed(waranty , speed);

System.out.println("check where road clearance is good ");
String heightOfBike = "height is good enoughh to clear the road";
String bikerating = "rating is 4 .5 ";
String clearance = Bicycle.checkRoadClearnence(heightOfBike , bikerating);
System.out.println(clearance);


}
static void bikeColor(){
System.out.println("grenn");
}
static void nameOfBike(){
System.out.println("gt 650");
}
static String priceOfBike(){
long price = 400000;
 if(price == 400000){
 return "is bike is under price";
 }
 else{
 return "bike is out of actual price";
 }
 }
 
static String isAvilable(){
String bikeisavilable = "yes";

if(bikeisavilable == "yes"){
return "bike is avilable";
}
else{
return "bike is not avilable";
}
}
static void enginePower(int enginepower){
System.out.println(enginepower);
}

static void warantyAndSpeed(int warantyYear , int topSpeed){
System.out.println(warantyYear);
System.out.println(topSpeed);
}
static String checkRoadClearnence(String height , String rating ){
System.out.println(height);
System.out.println(rating);

if(height ==  "height is good enoughh to clear the road"){
return height + "yes bike can pass easily";
}
else {
return height + "no bike cant pass";
}
}

}

