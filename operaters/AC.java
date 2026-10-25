class AC{
static boolean statusOfAC = false;

public static void main(String[] args){
System.out.println("check the status of the ca whether it is off or on");
boolean status = AC.check();
System.out.println(status);

AC.turnOn();
System.out.println(statusOfAC);

AC.turnOff();
System.out.println(statusOfAC);




}
static boolean check(){
return statusOfAC;
}
static void turnOn(){
System.out.println("turn on the ac");
statusOfAC = true;
}
static void turnOff(){
System.out.println("turn offf the ac");
statusOfAC = false;
}
}