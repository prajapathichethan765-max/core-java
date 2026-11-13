class InstaMart{


static double checkpirceOfProduct(String priceOfProduct){

System.out.println(priceOfProduct);

switch(priceOfProduct){

case laadu:
System.out.println("laadu is avilable");
return 12000.4d;

case rasmali:
System.out.println("rasmali is avilable");
return 230.3d;

case gulabJaun:
System.out.println("gulabJaun is avilable");
return 1000.0d;

case barfi:
System.out.println("barfi is avilable");
return 200.3d;

default :
System.out.println("itam not found");
return 0.0d;

}
}
}
