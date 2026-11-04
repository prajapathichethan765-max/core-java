class FlipCart{

static double searchProduct(String productName){
System.out.println(productName);

switch(productName){
case "lipstick":
System.out.println("lipstick is avilable");
return 120.0d;

case "stool":
System.out.println("stool is avilable");
return 400.0d;

case "bed":
System.out.println("bed is avilable");
return 3000.0d;

case "phone":
System.out.println("phone is avilable");
return 1000.0d;

case "laptop":
System.out.println("laptop is avilable");
return 4000.0d;

case "pen":
System.out.println("pen is avilable");
return 5.0d;

case "pencil box":
System.out.println("pencil box is avilable");
return 35.4d;

case "bag":
System.out.println("bag is avilable");
return 1000.0d;

default :
System.out.println("seacrch not found");
return 0.0d
}
}
}






