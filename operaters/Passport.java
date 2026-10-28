class Passport{
public static void main(String[] args){
String name = "rohit";
int passportNumber = 653531;

Passport.checkNameAndNumber(name , passportNumber);

}
static void checkNameAndNumber(String name ,  int number){
System.out.println("name of the candidate is ="+name);
System.out.println("passport Number is ="+number);

if(name == "rohit" && number == 634372){
System.out.println("name and number is matching");
}
else if (name == "rohhit" || number == 287127 ){
System.out.println("name and number is matching");
}
else if(name == "rohit" && number == 653531){
System.out.println("name and number is matching");
}
else {
System.out.println("invalid input");
}
}
}

