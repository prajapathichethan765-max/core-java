class StateCode{
public static void main(String[] args){

int pinCode = 560064;
String yelahanakPinCode = StateCode.checkPinCode(pinCode);
System.out.println(yelahanakPinCode);

switch(pinCode){
	
	case 560064:
	System.out.println("rajajinagar code pin");
	break;
	
	
	case 5600644:
	System.out.println("yelahanak pin code");
		break;

	
	case 566606:
	System.out.println( "jaynagar pin code");
		break;

	
	default :
	System.out.println( "invalid pin");

}
}

static String checkPinCode(int pincode){
System.out.println(pincode);

switch(pincode){
	
	case 560064:
	return "rajajinagar code pin";
	
	
	case 5600644:
	return "yelahanak pin code";
	
	
	case 566606:
	return "jaynagar pin code";
	
	
	default :
	return "invalid pin";
}
}
}
