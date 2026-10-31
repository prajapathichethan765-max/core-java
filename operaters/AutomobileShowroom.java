class AutomobileShowroom{
public static void main(String[] args){

System.out.println("showroom name");
AutomobileShowroom.showroomName();

System.out.println("number of vehicles");
int vehicles = AutomobileShowroom.vehicleCount();
System.out.println(vehicles);

System.out.println("yearly sales");
long sales = AutomobileShowroom.yearlySales();
System.out.println(sales);

System.out.println("available vehicle brands");
String b1 = "Honda";
String b2 = "Toyota";
String b3 = "Hyundai";
AutomobileShowroom.brandDetails(b1,b2,b3);

System.out.println("vehicle prices");
double v1 = 850000.50;
double v2 = 1200000.75;
double v3 = 1500000.25;
AutomobileShowroom.vehiclePrice(v1,v2,v3);

System.out.println("sales manager");
String manager = "Arun";
AutomobileShowroom.managerName(manager);

System.out.println("check vehicle stock");
int totalStock = 80;
int soldStock = 35;
int remaining = AutomobileShowroom.stockCheck(totalStock,soldStock);
System.out.println(remaining);

System.out.println("showroom address");
String address = "Mysore Road";
String showroomAddress = AutomobileShowroom.addressDetails(address);
System.out.println(showroomAddress);

}

static void showroomName(){
System.out.println("Royal Motors");
}

static int vehicleCount(){
return 80;
}

static long yearlySales(){
return 75000000L;
}

static void brandDetails(String brand1,String brand2,String brand3){
System.out.println(brand1);
System.out.println(brand2);
System.out.println(brand3);
}

static void vehiclePrice(double price1,double price2,double price3){
System.out.println(price1);
System.out.println(price2);
System.out.println(price3);
}

static void managerName(String name){
System.out.println(name);
}

static int stockCheck(int stock,int sold){
if(stock >= sold){
return stock-sold;
}
else{
return 0;
}
}

static String addressDetails(String place){
return place;
}
}