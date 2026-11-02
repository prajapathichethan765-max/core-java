class HospitalName{
public static void main(String[] args){

String hospitalName = "pawan hospital";
String hospital = HospitalName.checkHospitalName(hospitalName);

switch(hospitalName){

case "pawan Hospital":
System.out.println("pawan hospital loacted in rajajinagar");
break;

case "pawaN hospital":
System.out.println("pawan hospital loacted in jaynagar");
break;

case "pawan hospital":
System.out.println("pawan hospital loacted in yelahanka");
break;

default :
System.out.println("invalid name");
}



}
static String checkHospitalName(String hospitalName){
System.out.println(hospitalName);

switch(hospitalName){

case "pawan Hospital":
return "pawan hospital loacted in rajajinagar";

case "pawaN hospital":
return "pawan hospital located in jaynagar";

case "pawan hospital":
return "pawan hospital located in yelahanka";

default :
return "invalid hospital";
}
}
}
