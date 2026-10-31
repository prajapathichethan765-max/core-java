class Camera{
public static void main(String[] args){
System.out.println("what is color of camera");
Camera.colorOfCamera();

System.out.println("location of the shop");
Camera.locationOfShop();

System.out.println("what is the price ");
long price = Camera.priceOfCamera();
System.out.println(price);

System.out.println("what is the quality of the camera");
char quality = Camera.qualityOfCamers();
System.out.println(quality);

System.out.println("no of lenc used");
int lenc = 4;
Camera.numOfLenc(lenc);

System.out.println("what is the brand and water resistance capacity");
String brand ="sony";
char waterresistance = 'A';
Camera.brandAndwaterCapacity(brand , waterresistance);

System.out.println("color , ipAddres , shop name");
String colorName = "black";
String ipAddres = "52471ty1";
String shopAddress = "rajajinagar";
Camera.colorIPAddressShopAddesss(colorName , ipAddres , shopAddress );

System.out.println("sorage capacity");
String storageCapacity = "600GB";
String storage = Camera.storageCapacityOfCamera(storageCapacity);
System.out.println(storage);

System.out.println("is this is water resistance");
String isWaterResistance = "yes it is ";
int zoom = 10;
String result = Camera.propertity(isWaterResistance , zoom);
System.out.println(result);



}
static void colorOfCamera(){
System.out.println("camera color is black");
}
static void locationOfShop(){
System.out.println("yelahanka");
}
static long priceOfCamera(){
long price = 400000;
return price;
}
static char qualityOfCamers(){
char quality = 'A';
return quality;
}
static void numOfLenc(int lencUsed ){
System.out.println(lencUsed);
}
static void brandAndwaterCapacity( String brandName , char waterCertified    ){
System.out.println(brandName);
System.out.println(waterCertified);
}

static void colorIPAddressShopAddesss(String color , String ip , String address){
System.out.println(color);
System.out.println(ip);
System.out.println(address);
}

static String storageCapacityOfCamera(String capacity){
System.out.println(capacity);
return capacity + " camera have more storage capacity";
}

static String propertity(String isWaterResistance , int zoomLevel){
	System.out.println(zoomLevel);
return isWaterResistance + isWaterResistance + "all the cameras of sony campany are waterresistance";
}
}







