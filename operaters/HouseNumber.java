class HouseNumber{
public static void main(String[] jhgs){

int houseNum = 988;
String numberHouse = HouseNumber.checkHouseNumber(houseNum);
System.out.println(numberHouse);


}
static String checkHouseNumber(int number){
System.out.println(number);

switch(number){
case 989:
return "number matches for ankit";

case 999:
return "number matches for ankitha";

case 988:
return "number matches for harish";
 
default:
return "number doest matches ";

}
}
}
 