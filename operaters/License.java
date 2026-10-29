class License{
public static void main(String[] args){

long licenseNumber = 872344;
String name = "chethan";

System.out.println(License.checkLicenseNumberAndName(licenseNumber , name));

}
static String checkLicenseNumberAndName(long IDNumber , String nameOfPerson ){
System.out.println(IDNumber);

if(IDNumber == 872531 && nameOfPerson == "chethann"){
return "name and number is correct";
}
else if(IDNumber == 872344 && nameOfPerson == "chethahn"){
return "name and number is matching";
}
else if(IDNumber == 872344 || nameOfPerson == "chethan" ){
return "name is matching arend even id number";
}
else{
System.out.println("invalid number");
}
//return "cheching is done";
}
}




