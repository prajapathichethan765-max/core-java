class License{
public static void main(String[] args){

long licenseNumber = 872344;
String name = "chethan";

License.checkLicenseNumberAndName(licenseNumber , name);

}
static void checkLicenseNumberAndName(long IDNumber , String nameOfPerson ){
System.out.println(IDNumber);

if(IDNumber == 872531 && nameOfPerson == "chethann"){
System.out.println("name and number is correct");
}
else if(IDNumber == 872344 && nameOfPerson == "chethahn"){
System.out.println("name and number is matching");
}
else if(IDNumber == 872344 || nameOfPerson == "chethan" ){
System.out.println("name is matching and even id number");
}
else{
System.out.println("invalid number");
}
}
}




