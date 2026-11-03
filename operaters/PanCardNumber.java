class PanCardNumber{
public static void main(String[] args){

long panNumber= 1255L;
String panCard =PanCardNumber.checkPanNumber(panNumber);
System.out.println(panCard);
System.out.println(panNumber);


}
static String checkPanNumber (long panCardNumber){
System.out.println(panCardNumber);

switch(panCardNumber){
case 12:
return "number belon to kafil";

case 13:
return "number belon to mohan";

case 6:
return "number belon to sandeep";

default:
return "invalid pan number";
}
}
}

