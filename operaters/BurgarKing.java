class BurgarKing{

static int priceOfBurgar(){
int price = 500;
return price;
}
static String nameOfFamusBurgar(){
String nameOfBurgar = "chichen burgar";
return nameOfBurgar;
}
static float distanceOfBurgarKing(){
float distance = 23.4f;
return distance;
}
static String ownerName(){
String name = "marsal";
return name;
}

static String checkIsBurgarAvilable(String nameOfItem){

if(nameOfItem == "veg burgar"){
return nameOfItem +" yes veg it is avilable";
}
else if(nameOfItem == "chiken burgar"){
return nameOfItem +" yes chichen burgar is avilable";
}
else {
return nameOfItem + " iteam not found";
}

}
}
