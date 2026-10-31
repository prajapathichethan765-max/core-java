class 	Restaurant{
public static void main(String[] args){
System.out.println("name of Restaurant");
Restaurant.nameOfrestaurant();

System.out.println("location of Restaurant");
Restaurant.locationOfHotel();

System.out.println("price of one day stay");
int price = Restaurant.priceOfStay();
System.out.println(price);

System.out.println("total no OF staf");
int staf = Restaurant.numberOfStaf();
System.out.println(staf);

System.out.println("no of branch");
int branch =100;
Restaurant.numOfBranch(branch);

System.out.println("number of rooms and halls");
int rooms= 500;
int halls = 45;
Restaurant.numOfRoomsHalls(rooms , halls);

System.out.println("famous dish , price , rating");
String famousDish = "biryani";
int priceOfDish = 430;
float rating = 4.9f;
Restaurant.famousDishPriceRating(famousDish , priceOfDish , rating);

System.out.println("maneger name ");
String name = "shatish";
String maneger = Restaurant.nameOfStaf(name);
System.out.println(maneger);

System.out.println("check where the hotel rooms price are below then 4000");
int roomRent = 4000;
String nameOfHotel = "taj";
String rent = Restaurant.checkRent(roomRent , nameOfHotel);
System.out.println(rent);


}
static void nameOfrestaurant(){
System.out.println("taj hotel");
}
static void locationOfHotel(){
System.out.println("jaipur");
}

static int priceOfStay(){
int priceOfOneDayStay = 1000;
return priceOfOneDayStay;
}
static int numberOfStaf(){
int stafCounts  = 500;
return stafCounts;
}
static void numOfBranch(int noOfBranch){
System.out.println(noOfBranch);
}
static void numOfRoomsHalls(int noOfRoom , int noOfHalls){
System.out.println(noOfRoom);
System.out.println(noOfRoom);
}
static void famousDishPriceRating(String dish , int price  , float rating){
System.out.println(dish);
System.out.println(price);
System.out.println(rating);
}
static String nameOfStaf(String nameOfManeger){
return nameOfManeger +" maneger are well behaved and respectfull for us"; 
}
static String checkRent(int rent , String nameOfTheHotel ){
System.out.println(rent);

if(rent <= 4000){
return nameOfTheHotel+ " yes rooms are affordable and are less then 4000";
}
else{
return nameOfTheHotel+" not room are not affordable and are more then 4000";
}
}
}





