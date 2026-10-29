class VoterIDUsingReturn{
public static void main(String[] args){

String nameAndNumber = VoterIDUsingReturn.checkNameAndIdNumber( "chethan" , 12);
System.out.println(nameAndNumber);
}
static String checkNameAndIdNumber(String name , int IDnumber){
System.out.println(name);
System.out.println(IDnumber);

if(name == "chethan" && IDnumber == 24){
return "name and id number is coorect";
}

else if(name == "chtehan" && IDnumber == 12){
return "name and id number is coorect";
}

else {
return "invalid name";
}
}
}
