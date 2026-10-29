class BankAccountUsingReturn{
public static void main(String[] mall){

long bankAccuntNumber = 72767878;
String ifccodeOfaccount = "uni540123";

String nameAndAccountNumber = BankAccountUsingReturn.checkTheAcountNhumberAndIfcCode(bankAccuntNumber , ifccodeOfaccount);
System.out.println(nameAndAccountNumber);

}
static String checkTheAcountNhumberAndIfcCode(long accountNumber , String ifcCode){
System.out.println(accountNumber);
System.out.println(ifcCode);

if(accountNumber == 73323721 && ifcCode == "uni5212"){
return "name and ifc code is correct";
}
else if(accountNumber == 72767878 && ifcCode ==" uni540123 "){
return "name and ifc both are correct";
}
else {
return "invalid name and number";
}
}

}
