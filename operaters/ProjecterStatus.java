class ProjecterStatus{
	static boolean statusOfProjecter = false;
public static void main(String[] args){
	System.out.println("check the status of the Projecter Status wheather it is off or on");
	boolean status = ProjecterStatus.check();
	System.out.println(status);
	
	ProjecterStatus.turnOn();
	boolean status1 = ProjecterStatus.check();
	System.out.println(status1);
	
	ProjecterStatus.trunOff();
	boolean status2 = ProjecterStatus.check();
	System.out.println(status2);
	
	
}
static boolean check(){
	return statusOfProjecter;
}
static void turnOn(){
	System.out.println("tv is on");
	statusOfProjecter = true;
}
static void trunOff(){
	System.out.println("tv is off ");
	statusOfProjecter = false;

}
}