class Hospital{
public static void main(String[] args){

System.out.println("hospital name");
Hospital.hospitalName();

System.out.println("number of doctors");
short doctors = Hospital.doctorCount();
System.out.println(doctors);

System.out.println("hospital revenue");
double revenue = Hospital.hospitalRevenue();
System.out.println(revenue);

System.out.println("departments available");
String d1 = "cardiology";
String d2 = "neurology";
String d3 = "orthopedic";
Hospital.departmentDetails(d1,d2,d3);

System.out.println("consultation fees");
int f1 = 500;
int f2 = 800;
int f3 = 1000;
Hospital.consultationFees(f1,f2,f3);

System.out.println("chief doctor");
String doctor = "Dr Kumar";
Hospital.chiefDoctor(doctor);

System.out.println("check available beds");
byte totalBeds = 100;
byte occupiedBeds = 75;
int freeBeds = Hospital.bedAvailability(totalBeds,occupiedBeds);
System.out.println(freeBeds);

System.out.println("hospital rating");
float rating = 4.5f;
float hospitalRating = Hospital.ratingDetails(rating);
System.out.println(hospitalRating);

}

static void hospitalName(){
System.out.println("City Care Hospital");
}

static short doctorCount(){
return 45;
}

static double hospitalRevenue(){
return 750000.50;
}

static void departmentDetails(String dep1,String dep2,String dep3){
System.out.println(dep1);
System.out.println(dep2);
System.out.println(dep3);
}

static void consultationFees(int fee1,int fee2,int fee3){
System.out.println(fee1);
System.out.println(fee2);
System.out.println(fee3);
}

static void chiefDoctor(String name){
System.out.println(name);
}

static int bedAvailability(byte total,byte occupied){
if(total > occupied){
return total-occupied;
}
else{
return 0;
}
}

static float ratingDetails(float rating){
return rating;
}
}