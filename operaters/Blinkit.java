class Blinkit{

static String searchProductisAvilable(int productPrice){
System.out.println(productPrice);

switch(productPrice){

case 3000:
return "price of smart tv";

case 2000:
return "price of onion";

case 100:
return "price of bottelGard";

case 200:
return "price of match Box";

case 3001:
return "price of exam Pad";

case 2001:
return "price of sky bag";

default :
return "price doest match to any item";
}


}
}