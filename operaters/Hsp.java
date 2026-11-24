class Hsp{
public static void main(String[] args){

System.out.println("hospital name");
Hsp.hospitalName();

System.out.println("total beds");
int beds = Hsp.bedCount();
System.out.println(beds);

System.out.println("daily patients");
float patients = Hsp.patientCount();
System.out.println(patients);

System.out.println("departments");
Hsp.departments("Cardiology","Neurology","Dental");

System.out.println("doctor IDs");
Hsp.doctorIds(101L,202L,303L);

System.out.println("doctor name");
Hsp.doctor("Manoj");

System.out.println("empty beds");
System.out.println(Hsp.emptyBeds(200,75));

System.out.println("hospital area");
System.out.println(Hsp.area(5000.5));
}

static void hospitalName(){
System.out.println("City Care Hospital");
}
static int bedCount(){
return 200;
}
static float patientCount(){
return 150.5f;
}
static void departments(String a,String b,String c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void doctorIds(long a,long b,long c){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
static void doctor(String name){
System.out.println(name);
}
static int emptyBeds(int total,int occupied){
return total-occupied;
}
static double area(double value){
return value;
}
}