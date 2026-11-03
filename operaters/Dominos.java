class Dominos{

static String checkIfTheIteamIsAvilable(String itemName){
System.out.println(itemName);

switch(itemName){

case "pizza":
return "pizza is avilable";
 
case "burger":
return "burger is avilable";
 
case "nuts":
return "nuts is avilable";

case "cocacola":
return "cocacola is avilable";
 case "dew":
return "dew us avilable";
 
case "chichen pizza":
return "chichen pizza is avilable";

case "veg pizza":
return "veg pizza is avilable";

default :
return "invalid search";
}
}

static String checkPrice(){
int price = 1000;

if(price == 1000){
return "highly taste pizza";
}
else {
return "normal pizza";
}


}
}

 