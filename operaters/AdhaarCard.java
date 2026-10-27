class AdhaarCard{
public static void main(String[] args){
long adhaarNumber = 5677877L;
System.out.println("is 5677877 adhaar number match the chethan adhaar ");

AdhaarCard.checkAdhaarNumber(adhaarNumber);


}
static void checkAdhaarNumber(long number){
System.out.println(number);

if( number == 5671827){
System.out.println("adhaar Number  is miss match ");
}
else if(number == 567873){

System.out.println("adhaar Number  is miss match ");
}
else if(number == 5677877){

System.out.println("adhaar Number  is  matching ");
}
else {
System.out.println("invalid adhaar Number ");
}
}
}


