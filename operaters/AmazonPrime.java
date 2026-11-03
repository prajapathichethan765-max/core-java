class AmazonPrime{

static int checkPriceOfProduct(String productName){
System.out.println(productName);

if(productName == "chamera"){
System.out.println("camera is avilable");
return 2000;
}
else if(productName == "kurta"){
System.out.println("kurta is avilable");
return 1200;
}
else if(productName == "kukar"){
System.out.println("kukar is avilable");
return 1000;
}
else if(productName == "bedsheet"){
System.out.println("bedsheet is avilable");
return 500;
}
else if(productName == "remote"){
System.out.println("remote is avilable");
return 455;
}
else if(productName == "tv"){
System.out.println("tv is avilable");
return 3000;
}
else if(productName == "helmate"){
System.out.println("helmate is avilable");
return 1000;
}
else if(productName == "can"){
System.out.println("can is avilable");
return 350;
}
else if(productName == "fizer"){
System.out.println("fizer is avilable");
return 1200;
}
else {
System.out.println("search not found");
return 0;
}
}
}
