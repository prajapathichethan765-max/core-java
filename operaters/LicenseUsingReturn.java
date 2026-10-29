class LicenseUsingReturn{
public static void main(String[] args){

int number = 62512;
String idNumber  = LicenseUsingReturn.checkLicenseIdNumber(number);
System.out.println(idNumber);

}
static String checkLicenseIdNumber(int licenseNumber){
System.out.println(licenseNumber);

if(licenseNumber == 63231){
return "license Number is correct";
}
else if(licenseNumber == 678211){
return "license Number is correct";
}
else if(licenseNumber == 62512){
return "license number is correct";
}
else{
return "invalid number";
}
}
}
