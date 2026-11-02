class AccountNumber{
public static void main(String[] hgf){

int accNumber = 98459;
String accountNumber = AccountNumber.checkAccountNumber(accNumber);
System.out.println(accountNumber);


}
static String checkAccountNumber(int accountNumber){
System.out.println(accountNumber);

switch(accountNumber){
case 98455:
return "acc number matches by tharuns acc number";

case 98445:
return "acc number matches by chethan acc number";

case 98459:
return "acc number matches by ankit";

default :
return "default acc number";
}
}
}