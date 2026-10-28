class Charge{
public static void main(String[] args){
char chargeType = 'c';

Charge.checkChargeType(chargeType);
}
static void checkChargeType(char chargerPinType ){
System.out.println(chargerPinType);

if(chargerPinType == 'v' ){
System.out.println("charger pin is matching");
}
else if(chargerPinType == 'c'){
System.out.println("charger pin is c type and it is matching");
}
else if(chargerPinType == 'd'){
System.out.println("charge Type is c and matching");
}
else {
System.out.println("pin not found");
}
}
}





