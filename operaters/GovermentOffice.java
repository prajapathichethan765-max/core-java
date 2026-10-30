class GovermentOffice{
public static void main(String[] kp){

GovermentOffice.totalEmployee();

int salary = GovermentOffice.salaryOfOneEmployee();
System.out.println(salary);

String officeLocationn = "yelahanka";
GovermentOffice.officeLocation(officeLocationn);

String name = "bmtc";

String nameOfOffice = GovermentOffice.nameOfOffice(name);
System.out.println(nameOfOffice);

}
static void totalEmployee(){
System.out.println("60");
}
static int salaryOfOneEmployee(){
int salary = 2000;
return salary;
}
static void officeLocation(String location){
System.out.println(location);
}
static String nameOfOffice(String name){
return name;
}

}





