class BikeKey{
public static void main(String[] args){
String bike = "classic 350";
String key = "metal ignition";

BikeKey.chechBikeAndKeyNames(bike , key);


}
static void chechBikeAndKeyNames(String name , String keyType){
System.out.println("name of the bike is = "+ name);
System.out.println("key type is ="+keyType);

if(name == "classic 350" && keyType == "metal ignition"){
System.out.println("bike will start");
}
else if(name == "classic 350" && keyType == "metal ignition"){
System.out.println("bike will start");

}
else{
System.out.println("bike wont start");
}

}
}





