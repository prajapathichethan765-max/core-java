class ATMPin{
public static void main(String[] args){
int ATMpin = 9845;

ATMPin.checkPin(ATMpin);

}
static void checkPin(int pin){
System.out.println("ATM pin is ="+pin);

if(pin == 9865){
System.out.println("atm pin matches");
}
else {
System.out.println("atm pin doest match");
}
}
}
