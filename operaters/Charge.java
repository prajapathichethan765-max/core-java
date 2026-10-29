class Charge{
public static void main(String[] args){
char chargeType = 'c';

System.out.println(Charge.checkChargeType(chargeType));
}
static String checkChargeType(char chargerPinType ){
System.out.println(chargerPinType);

if(chargerPinType == 'v' ){
return "charger pin is matching";
}
else if(chargerPinType == 'c'){
return "charger pin is c type and it is matching";
}
else if(chargerPinType == 'd'){
return "charge Type is c and matching";
}
else {
return "pin not found";
}
}
}





