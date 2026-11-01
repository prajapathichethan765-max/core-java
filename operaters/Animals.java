class Animals{
public static void main(String[] args){

System.out.println("name of the animal");
Animals.nameOfAnimal();

System.out.println("what does lion and elephant eat");
String foods = Animals.foodOfAnimal();
System.out.println(foods);

System.out.println("what does lion is call");
String lionIS = "king of jungle";
Animals.lionStatus(lionIS);

System.out.println("check whether tiger leave in the jungle ");
String tiger = "yes";
String tigerLeave = Animals.checkTiger(tiger);


}
static void nameOfAnimal(){
System.out.println("lion , elephant , ant");
}
static String foodOfAnimal(){
String lionFood = "deer";
String elephantFood = "sugar cane";
return lionFood + elephantFood;
}
static void lionStatus(String lionName ){
System.out.println(lionName);
}
static String checkTiger(String doTigerLeave){
System.out.println(doTigerLeave);

if(doTigerLeave == "yes"){
return doTigerLeave + "yes tiger leave in the jungle";
}
else {
return doTigerLeave + " no tiger leave in the jungle";
}
}
}

